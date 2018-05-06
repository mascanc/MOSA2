package com.spirit.togaf.bb.dependencies;

/**
 * This class implements an IHE transaction. A transaction is a triple, defined as (From, name, To), where
 * From and To are two actors, and name is the name of the transaction. 
 * @author max
 */
public class Transaction {
    
    /** Actor from. */
    private Actor a1;
    
    /** Actor to. */
    private Actor a2;
    
    private String name;

    private String associatedProfile;
    
    public Transaction(Actor from, String name, Actor to) {
        this.a1 = from;
        this.a2 = to;
        this.name = name;
        
        if (name.contains("(")) {
            int val = name.indexOf("(");
            int end = name.indexOf(")");
            this.associatedProfile = name.substring(val+1, end);
        }
    }

    /**
     * @return the a1
     */
    public Actor getActorFrom() {
        return a1;
    }

    /**
     * @return the a2
     */
    public Actor getActorTo() {
        return a2;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    public String dump() {
        return "(\""+a1.getName() + "\",\"" + name + "\",\"" + a2.getName()+"\")";
    }

    @Override
    public String toString() {
        return dump();
    }
    public String getAssociatedProfile() {
        return this.associatedProfile;
    }

}
