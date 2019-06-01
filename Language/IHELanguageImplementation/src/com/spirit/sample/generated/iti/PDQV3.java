package com.spirit.sample.generated.iti;
        
import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.Transaction;
        
public class PDQV3 {
    private ABB pdqv3;
        
    private void initP() {
        pdqv3 = new ABB("PDQV3", "The Patient Demographics Query Integration Profile (PDQ) provides ways for multiple distributed applications to query a patient information server V3", "Query Demographics of a patient", "Patient Demographics Query V3");
                                                
                Actor patientdemographicssupplier = new Actor("PatientDemographicsSupplier");
                        pdqv3.addActor(patientdemographicssupplier);
                Actor patientdemographicsconsumer = new Actor("PatientDemographicsConsumer");
                        pdqv3.addActor(patientdemographicsconsumer);
                
                Transaction iti_47_patient_demographics_query_hl7v3 = new Transaction(patientdemographicsconsumer, "ITI_47_Patient_Demographics_Query_HL7V3", patientdemographicssupplier);
                        pdqv3.addTransaction(iti_47_patient_demographics_query_hl7v3);
                        
                Transaction iti_47_patient_demographics_and_visit_query_hl7v3 = new Transaction(patientdemographicsconsumer, "ITI_47_Patient_Demographics_and_visit_Query_HL7V3", patientdemographicssupplier);
                        pdqv3.addTransaction(iti_47_patient_demographics_and_visit_query_hl7v3);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        pdqv3.addDomain(infrastructure);
                
                
                
    }
    
    public PDQV3() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.pdqv3;
		}
}
