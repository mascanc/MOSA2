package com.spirit.ihe.language.bb;

import java.util.LinkedList;

import com.spirit.ihe.language.bb.dependencies.ImplementationGuideline;
import com.spirit.ihe.language.bb.dependencies.Specification;
import com.spirit.ihe.language.bb.dependencies.TestAssertion;


/**
 * Implements an ABB specifications, according with the e-SENS metamodel.
 * @author max
 */
public class ABBSpecification implements ArchitecturalAsset {

    private String                              name;

    private String                              version;

    private Specification                       specifications;

    private String                              profiling;

    private LinkedList<TestAssertion>           testAssertions;

    private LinkedList<ImplementationGuideline> implGuideline;

    public ABBSpecification(String name, String version, String profiling, Specification specification) {
        this.name = name;
        this.version = version;
        this.profiling = profiling;
        
   }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @return the specifications
     */
    public Specification getSpecifications() {
        return specifications;
    }

    /**
     * @return the profiling
     */
    public String getProfiling() {
        return profiling;
    }

    /**
     * @return the testAssertions
     */
    public LinkedList<TestAssertion> getTestAssertions() {
        return testAssertions;
    }

    /**
     * @return the implGuideline
     */
    public LinkedList<ImplementationGuideline> getImplGuideline() {
        return implGuideline;
    }

}
