package com.spirit.togaf.bb.metrics;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.QualityAttribute;


public class Availability extends QualityAttribute {

    private Double          probability;
    private HashSet<String> rule = new HashSet<>();
    private List<String>    list = new LinkedList<>();

    public void evaluate(ABB left, ABB right) {
        // The evaluation of the availability is the application of the rule to create the fault tree, and the report on the probability

        if (rule != null) {
            list = rule.stream().map(x -> evaluateRule(x, left.getName(), right.getName())).collect(Collectors.toList());
        }
    }

    @Override
    public String getValue() {
        StringBuilder sb = new StringBuilder();
        list.stream().forEach(x -> {
            if (x != null)
                sb.append(x);
        });
        return sb.toString();
    }



   

    public void setProbability(Double value) {
        this.probability = value;

    }

    /**
     * Add a rule for the fault tree. A rule is read as if ABB1 is grouped with ABB2 and abb2 fails, it's and AND, and the system fails with
     * description. DS/PI->AND, Documents can't be searched without patient identification
     * @param string
     */
    public void addRule(String s) {
        rule.add(s);

    }

    public String evaluateRule(String s, String abbFrom, String abbTo) {
        String[] leftRight = s.split("->");
        if (leftRight.length != 2) {
            throw new IllegalArgumentException("Invalid availability rule");
        }
        String[] left12 = leftRight[0].split("/");

        if (left12.length != 2) {
            throw new IllegalArgumentException("Invalid availability rule");
        }
        String left1 = left12[0];
        String left2 = left12[1];

        String[] right12 = leftRight[1].split("/");

        if (right12.length != 2) {
            throw new IllegalArgumentException("Invalid availability rule");
        }
        String right1 = right12[0];
        String right2 = right12[1];

        if (abbFrom.equals(left1) && abbTo.equals(left2)) {
            // I have to report the failure and the dependency
            String value = "["+probability + "(" + left1 + "," + right1 + "," + left2 + ")" + right2+"]";
            return value;
        }
        return null;
    }

    @Override
    public String toString() {

        String returned = "AvailabilityMetric. Probability " + probability + " rules " + rule;
        return returned;
    }
}
