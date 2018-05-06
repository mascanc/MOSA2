package com.spirit.togaf.bb.dependencies;

/**
 * This class implements a generic Requirement for the e-SENS metamodel.
 * A requirement is composed by an ID, e.g. [REQ1], a prescription level (as per rfc 2119), e.g. MUST, and a
 * description.
 * 
 * @author max
 */
public class Requirement {

    /** The identifier of the requiremnt. */
    private String             identifier;

    /** The prescription level. */
    private PRESCRIPTION_LEVEL prescription;

    /** The description. */
    private String             description;

    /** The prescription level of the requirement, as per rfc 2119. */
    public enum PRESCRIPTION_LEVEL {
        MUST,
        MUST_NOT,
        REQUIRED,
        SHALL,
        SHALL_NOT,
        SHOULD,
        SHOULD_NOT,
        RECOMMENDED,
        MAY,
        OPTIONAL

    }

    /**
     * Constructor. 
     * 
     * @param reqIdentifier the requirement identifier e.g., REQ1
     * @param prescriptionLevel its prescription level @see {@link PRESCRIPTION_LEVEL}
     * @param reqDescription the description
     */
    public Requirement(String reqIdentifier, PRESCRIPTION_LEVEL prescriptionLevel, String reqDescription) {
        this.prescription = prescriptionLevel;
        this.identifier = reqIdentifier;
        this.description = reqDescription;
        
    }
    /**
     * @return the identifier of the requirement
     */
    public String getIdentifier() {
        return identifier;
    }


    /**
     * @return the prescription level of the requirement
     */
    public PRESCRIPTION_LEVEL getPrescription() {
        return prescription;
    }

   
    /**
     * @return the description of the use case
     */
    public String getDescription() {
        return description;
    }

  


}
