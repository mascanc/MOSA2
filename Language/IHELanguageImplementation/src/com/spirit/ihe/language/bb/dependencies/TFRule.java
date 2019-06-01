package com.spirit.ihe.language.bb.dependencies;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import com.spirit.ihe.language.bb.ABB;


/**
 * This class implements an IHE TF Rule.
 * @author max
 */
public class TFRule {
    private String              rightActor;
    private String              leftActor;
    private String              rightABB;
    private String              leftABB;
    private String              rule;
    private String              inverseProfile;
    private final static Logger L = Logger.getLogger(TFRule.class.getName());

    public String getRule() {
        return rule;
    }

    public String getRightActor() {
        return this.rightActor;
    }

    public String getLeftActor() {
        return this.leftActor;
    }

    public String getRightABB() {
        return this.rightABB;
    }

    public String getLeftABB() {
        return this.leftABB;
    }

    public TFRule(String rule) {
        parse(rule);
    }

    /**
     * This method parses a rule fo the form
     * act/prof->act/prof
     * @param rule
     */
    private void parse(String rule) {
        this.rule = rule;
        L.finest("Parsing rule " + rule);
        String[] couple = rule.split("->");
        if (couple == null || couple.length != 2) {
            // Check if it is an inverse rule
            if (rule.startsWith("<<-/")) {
                inverseProfile = rule.substring(4);
            } else {
                throw new IllegalArgumentException("Invalid size of TF Rule");
            }
        } else {

            String[] right = couple[1].split("/");
            if (right == null || right.length != 2) {
                throw new IllegalArgumentException("Invalid count of right element");
            }
            rightActor = right[0];
            rightABB = right[1];

            String[] left = couple[0].split("/");
            if (left == null || left.length != 2) {
                throw new IllegalArgumentException("Invalid count of left element");
            }
            leftActor = left[0];
            leftABB = left[1];
        }
    }

    /**
     * This is the implementation of R.
     * @param actor
     * @param profile
     * @return
     */
    public String match(Actor actor, final ABB profile) {
        System.out.println("Evaluating rule [" + rule + "] with actor " + actor.getName() + " and profile " + profile.getName());
        if (leftActor != null) {
            if ((leftActor.equals("*") && leftABB.equals(profile.getName())
                    || (leftActor.equals(actor.getName()) && leftABB.equals(profile.getName())))) {
                System.out.println("Rule matches!");
                return rightABB;

            } else {
                return null;
            }
        } else if (inverseProfile != null) {
            // The rule is inverse
            // Here I hve to check if the ABB has a transaction which equals to the profile. 
            List<Transaction> back = profile.getTransactions().stream().map(t -> {

                String associatedProfile = t.getAssociatedProfile();
                if (associatedProfile != null) {
                    if (associatedProfile.equals(inverseProfile)) {
                        System.out.println("The associated profile " + associatedProfile + " matches!");
                        return null;
                    } else {
                        return t;
                    }
                } else {
                    return null;
                }
            }).collect(Collectors.toList());

            back.stream().forEach(x -> profile.removeTransaction(x));

            return null;
        } else {
            L.finest("No match!");
            return null;
        }
    }

    @Override
    public String toString() {
        return "[" + this.rule + "]";
    }

}
