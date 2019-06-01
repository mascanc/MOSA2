package com.spirit.ihe.language.bb.dependencies;

/**
 * This class implements an IHE actor. 
 * 
 * @author max
 */
public class Actor {
    private String name;
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    public Actor(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
     
        return this.name;
    }
    
}
