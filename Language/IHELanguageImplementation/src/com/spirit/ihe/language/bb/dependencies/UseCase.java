package com.spirit.ihe.language.bb.dependencies;

/**
 * Data structure to represent an use case, according with the e-SENS metamodel. 
 * 
 * @author max
 */
public class UseCase {
    
    /** The identifier of the use case. */
    private String identifier;
    
    /** The description of the use case. */
    private String description;
    
    /**
     * Constructor.
     * @param ucIdentifier the identifier, e.g., UC1
     * @param ucDescription the description.
     */
    public UseCase(String ucIdentifier, String ucDescription) {
        this.identifier = ucIdentifier;
        this.description = ucDescription;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getDescription() {
        return description;
    }
    
    
}
