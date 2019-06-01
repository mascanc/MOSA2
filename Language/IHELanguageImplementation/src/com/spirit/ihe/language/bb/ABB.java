package com.spirit.ihe.language.bb;

import java.util.LinkedList;
import java.util.List;

import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.Requirement;
import com.spirit.ihe.language.bb.dependencies.SecurityRequirement;
import com.spirit.ihe.language.bb.dependencies.Transaction;


/**
 * Represents an architectural building block (ABB) from the e-SENS metamodel.
 * @author max
 */

public class ABB implements ArchitecturalAsset {


    /** The name of the ABB. */
    private String                          name;

    /** A string description. */
    private String                          description;

    /** The Function, related to the SGAM. */
    private String                          function;

    /** The list of SATs linked by this ABB. */
    private LinkedList<SAT>                 parentSat            = new LinkedList<>();

    /** The list of the requirements implemented. */
    private LinkedList<Requirement>         requirements         = new LinkedList<>();

    private String                          features;
    private LinkedList<Actor>               actors               = new LinkedList<>();

    private LinkedList<Transaction>         transactions         = new LinkedList<>();

    private LinkedList<Domain>              domains              = new LinkedList<>();

    private LinkedList<QualityAttribute>    qualityAttributes    = new LinkedList<>();

    private LinkedList<SecurityRequirement> securityRequirements = new LinkedList<>();

    public ABB(String name, String description, String features, String function) {
        this.name = name;
        this.description = description;
        this.features = features;
        this.setFunction(function);
    }

    public List<SAT> getParentSAT() {
        return parentSat;
    }

    /**
     * Add another SAT to which this ABB belongs to
     * @param sat
     */
    public void addParentSAT(SAT sat) {
        parentSat.add(sat);
    }

    public void addActor(Actor a) {
        actors.add(a);
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public void addDomain(Domain d) {
        domains.add(d);
    }

    public void addQualityAttribute(QualityAttribute a) {
        qualityAttributes.add(a);
    }

    public void addSecurityRequirements(SecurityRequirement a) {
        securityRequirements.add(a);
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the requirements
     */
    public List<Requirement> getRequirements() {
        return requirements;
    }

    public void addRequirement(Requirement r) {
        requirements.add(r);
    }

    /**
     * @return the features
     */
    public String getFeatures() {
        return features;
    }

    /**
     * @return the actors
     */
    public List<Actor> getActors() {
        return actors;
    }

    /**
     * @return the transactions
     */
    public List<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * @return the domains
     */
    public List<Domain> getDomains() {
        return domains;
    }

    /**
     * @return the qualityAttributes
     */
    public List<QualityAttribute> getQualityAttributes() {
        return qualityAttributes;
    }
    
    public List<SecurityRequirement> getSecurityRequirements() {
        return securityRequirements;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        this.getActors().stream().forEach(x -> sb.append(" " + x.getName()));
        return "Name: " + this.name + " Actors: " + sb.toString();
    }

    //    /**
    //     * Dump the actor in the format of the paper.
    //     */
    //    public String dump() {
    //        StringBuilder sb = new StringBuilder();
    //        sb.append("<");
    //        sb.append("["+name+"],");
    //        sb.append("[");
    //        sb.append(String.join(",",this.getActors().stream().map(x -> x.getName()).collect(Collectors.toList())));
    //        sb.append("],");
    //        sb.append("[");
    //        sb.append(String.join(",",this.getTransactions().stream().map(x -> x.dump()).collect(Collectors.toList())));
    //        sb.append("],");
    //        sb.append("[");
    //        sb.append(String.join(",",this.getDomains().stream().map(x -> x.getName()).collect(Collectors.toList())));
    //        sb.append("],");
    //        sb.append("[");
    //        sb.append(String.join(",",this.getQualityAttributes().stream().map(x -> x.getValue()).collect(Collectors.toList())));
    //        sb.append("]>");
    //        return sb.toString();
    //        
    //    }

    public String dump() {
        StringBuilder sb = new StringBuilder();

        sb.append("Profile " + name.replace(",", "").replace(" ", "") + " {" + System.lineSeparator());
        sb.append("  Name: \"" + name + "\"" + System.lineSeparator());
        sb.append("  Description: \"" + this.getDescription() + "\"" + System.lineSeparator());
        sb.append("  Features: \"" + this.getFeatures() + "\"" + System.lineSeparator());
        sb.append("  Function: \"" + this.getFunction() + "\"" + System.lineSeparator());
        sb.append("  actors: " + System.lineSeparator());
        this.getActors().stream().forEach(x -> sb.append("    \"" + x.getName() + "\"" + System.lineSeparator()));
        sb.append("  transactions: " + System.lineSeparator());
        this.getTransactions().stream().forEach(x -> sb.append("    " + x.dump() + System.lineSeparator()));
        sb.append("  domains: " + System.lineSeparator());
        this.getDomains().stream().forEach(x -> sb.append("    \"" + x.getName() + "\"" + System.lineSeparator()));
        sb.append("  quality_attributes: " + System.lineSeparator());

        for (int i = 0; i < this.getQualityAttributes().size(); i++) {
            sb.append("att" + i + " [\"" + this.getQualityAttributes().get(i).getValue() + "\"]" + System.lineSeparator());
        }

        //        this.getQualityAttributes().stream().forEach(x -> sb.append("att"+ incr(i) +" [\""+x.getValue()+"\"]" + System.lineSeparator()));
        sb.append("}" + System.lineSeparator());
        return sb.toString();
    }

    /**
     * Removes a transaction for a TF Rule inverse
     * @param x
     */
    public void removeTransaction(Transaction x) {
        if (x != null) {
            System.out.println("REMOVING " + x);
            transactions.remove(x);
        }



    }


}
