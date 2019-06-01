package com.spirit.ihe.language.bb.dependencies;

import com.spirit.ihe.language.bb.dependencies.Requirement.PRESCRIPTION_LEVEL;


public class TestAssertion {

    private String                         id;

    private String                         source;

    private Specification                  target;

    private String                         prereq;

    private String                         predicate;

    private Requirement.PRESCRIPTION_LEVEL prescription;

    public TestAssertion(String taid, String tasource, Specification tatarget, String taprereq, String tapredicate, PRESCRIPTION_LEVEL taprescription) {
        this.id = taid;
        this.source = tasource;
        this.prereq = taprereq;
        this.predicate = tapredicate;
        this.prescription = taprescription;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * @return the target
     */
    public Specification getTarget() {
        return target;
    }

    /**
     * @return the prereq
     */
    public String getPrereq() {
        return prereq;
    }

    /**
     * @return the predicate
     */
    public String getPredicate() {
        return predicate;
    }

    /**
     * @return the prescription
     */
    public Requirement.PRESCRIPTION_LEVEL getPrescription() {
        return prescription;
    }
    
    
}
