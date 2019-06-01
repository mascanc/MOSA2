package com.spirit.sample.generated.iti;
        
import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.Transaction;
        
public class PAM {
    private ABB pam;
        
    private void initP() {
        pam = new ABB("PAM", "The Patient Administration Management Integration Profile defines transactions based on message exchanges to support patient identity and encounter information, as well as movements within an acute care encounter", "Patient Administration", "Patient Administration Management");
                                                
                Actor patientdemographicsupplier = new Actor("PatientDemographicSupplier");
                        pam.addActor(patientdemographicsupplier);
                Actor patientdemographicconsumer = new Actor("PatientDemographicConsumer");
                        pam.addActor(patientdemographicconsumer);
                Actor patientencountersupplier = new Actor("PatientEncounterSupplier");
                        pam.addActor(patientencountersupplier);
                Actor patientencounterconsumer = new Actor("PatientEncounterConsumer");
                        pam.addActor(patientencounterconsumer);
                
                Transaction iti_30_patient_identity_management = new Transaction(patientdemographicsupplier, "ITI_30_Patient_Identity_Management", patientdemographicconsumer);
                        pam.addTransaction(iti_30_patient_identity_management);
                        
                Transaction iti_31_patient_encounter_management = new Transaction(patientencountersupplier, "ITI_31_Patient_Encounter_Management", patientencounterconsumer);
                        pam.addTransaction(iti_31_patient_encounter_management);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        pam.addDomain(infrastructure);
                
                
                
    }
    
    public PAM() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.pam;
		}
}
