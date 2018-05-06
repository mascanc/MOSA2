package com.spirit.ihe.iti;
        
import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.Actor;
import com.spirit.togaf.bb.dependencies.Domain;
import com.spirit.togaf.bb.dependencies.QualityAttribute;
import com.spirit.togaf.bb.dependencies.Transaction;
        
public class PDQ {
    private ABB pdq;
        
    private void initP() {
        pdq = new ABB("PDQ", "The Patient Demographics Query Integration Profile (PDQ) provides ways for multiple distributed applications to query a patient information server", "Query Demographics of a patient", "Patient Demographics Query");
                                                
                Actor patientdemographicssupplier = new Actor("PatientDemographicsSupplier");
                        pdq.addActor(patientdemographicssupplier);
                Actor patientdemographicsconsumer = new Actor("PatientDemographicsConsumer");
                        pdq.addActor(patientdemographicsconsumer);
                
                Transaction iti_21_patient_demographics_query = new Transaction(patientdemographicsconsumer, "ITI_21_Patient_Demographics_Query", patientdemographicssupplier);
                        pdq.addTransaction(iti_21_patient_demographics_query);
                        
                Transaction iti_22_patient_demographics_and_visit_query = new Transaction(patientdemographicsconsumer, "ITI_22_Patient_Demographics_and_visit_Query", patientdemographicssupplier);
                        pdq.addTransaction(iti_22_patient_demographics_and_visit_query);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        pdq.addDomain(infrastructure);
                
                
                
    }
    
    public PDQ() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.pdq;
		}
}
