package com.spirit.togaf.bb.dependencies;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.SAT;


/**
 * This class implements the function A
 * @author max
 */
public class ResolveDependency {

    LinkedList<Actor>            act   = null;
    LinkedList<TFRule>           rules = null;
    HashSet<ABB>                 set   = new HashSet<>();
    private HashMap<String, ABB> abbList;

    public ResolveDependency(HashMap<String, ABB> abbList) {

        this.abbList = abbList;
    }

    public HashSet<ABB> resolve(ABB p) {
        resolveABB(p);
        return set;
    }

    private ABB resolveABB(ABB p) {

        /*
         * What to do here: get the rules of r, get the actors of p, and recursively
         * call the A on the evaluation R of a, P.
         */
        if (p == null) {
            return null;
        }
        ABB abbToReturn = null;
        System.out.println("Going to resolve dependency on ABB named " + p.getName());
        rules = new LinkedList<>();
        act = p.getActors();
        LinkedList<SAT> parentSATs = p.getParentSAT();

        Iterator<SAT> pit = parentSATs.iterator();
        while (pit.hasNext()) {
            SAT sat = pit.next();
            rules.addAll(sat.getOrchestration());
        }
        System.out.println("For actors: ");
        act.stream().forEach(x -> System.out.println("   " + x.getName()));
        System.out.println("For rules: ");
        rules.stream().forEach(x -> System.out.println("   " + x.getRule()));

        Iterator<Actor> actorIterator = act.iterator();
        Iterator<TFRule> ruleIterator = rules.iterator();

        while (actorIterator.hasNext()) {
            Actor currentActor = actorIterator.next();

            while (ruleIterator.hasNext()) {
                TFRule tfRule = ruleIterator.next();
                if (tfRule == null) {
                    return null;
                } else {
                    //                    System.out.println("++++ Should add: " + resolveABB(abbList.get(tfRule.match(currentActor, p))));
                    String matchedString = tfRule.match(currentActor, p);
                    if (matchedString != null) {
                        ABB temp = abbList.get(matchedString);
                        if (temp != null) {
                            set.add(temp);

                        }
                        abbToReturn = resolveABB(temp);
                        System.out.println("ABB To return: " + abbToReturn);
                        if (abbToReturn != null) {
                            set.add(abbToReturn);
                        }
                    } 
                }
            }
        }
        return abbToReturn;
    }

    public HashSet<ABB> getResolvedABB() {
        return set;
    }
}
