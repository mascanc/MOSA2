package com.spirit.togaf.bb;

import java.util.LinkedList;

import com.spirit.togaf.bb.dependencies.Requirement;
import com.spirit.togaf.bb.dependencies.TFRule;
import com.spirit.togaf.bb.dependencies.UseCase;

public class SAT {
    private String name;
    private String version;
    private String status;
    private String objective;
    private LinkedList<Requirement> genericRequirements = new LinkedList<>();
    private LinkedList<UseCase> useCase = new LinkedList<>();
    
    /*
     * A solution pattern is a set of ABB and ABB specifications. The ABBs are fixed, the 
     * variation points are only in the ABB specifications, thus it is done by instanceof
     */
    private LinkedList<ArchitecturalAsset> solutionPatterns = new LinkedList<>();
    private LinkedList<TFRule> orchestration = new LinkedList<>();
    
    public SAT(String name, String version, String status, String objective) {
        this.name = name;
        this.version = version;
        this.status = status;
        this.objective = objective;
    }
    
    public void addRequirement(Requirement r) {
        genericRequirements.add(r);
    }
    
    public void addUseCase(UseCase uc) {
        useCase.add(uc);
    }
    
    public void addSolutionPattern(ArchitecturalAsset aa) {
        solutionPatterns.add(aa);
    }
    
    public void addRule(TFRule r) {
        orchestration.add(r);
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
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @return the objective
     */
    public String getObjective() {
        return objective;
    }

    /**
     * @return the genericRequirements
     */
    public LinkedList<Requirement> getGenericRequirements() {
        return genericRequirements;
    }

    /**
     * @return the useCase
     */
    public LinkedList<UseCase> getUseCase() {
        return useCase;
    }

    /**
     * @return the solutionPatterns
     */
    public LinkedList<ArchitecturalAsset> getSolutionPatterns() {
        return solutionPatterns;
    }

    /**
     * @return the orchestration
     */
    public LinkedList<TFRule> getOrchestration() {
        return orchestration;
    }
    
    
}
