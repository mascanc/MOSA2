package com.spirit.ihe.iti;
        
import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.Actor;
import com.spirit.togaf.bb.dependencies.Domain;
import com.spirit.togaf.bb.dependencies.QualityAttribute;
import com.spirit.togaf.bb.dependencies.Transaction;
        
public class PIX {
    private ABB pix;
        
    private void initP() {
        pix = new ABB("PIX", "Supports the cross-referencing of patient identifiers from multiple Patient Identifier Domains", "Patient Identification", "Patient Identifier Cross-referencing");
                                                
                Actor patientidentifiercrossreferencemanager = new Actor("PatientIdentifierCrossReferenceManager");
                        pix.addActor(patientidentifiercrossreferencemanager);
                Actor patientidentitysource = new Actor("PatientIdentitySource");
                        pix.addActor(patientidentitysource);
                Actor patientidentifiercrossreferenceconsumer = new Actor("PatientIdentifierCrossReferenceConsumer");
                        pix.addActor(patientidentifiercrossreferenceconsumer);
                
                Transaction iti_8_patient_identity_feed = new Transaction(patientidentitysource, "ITI_8_Patient_Identity_Feed", patientidentifiercrossreferencemanager);
                        pix.addTransaction(iti_8_patient_identity_feed);
                        
                Transaction iti_30_patient_identity_management_hl7_v25 = new Transaction(patientidentitysource, "ITI_30_Patient_Identity_Management_Hl7_v25", patientidentifiercrossreferencemanager);
                        pix.addTransaction(iti_30_patient_identity_management_hl7_v25);
                        
                Transaction iti_9_pix_query = new Transaction(patientidentifiercrossreferenceconsumer, "ITI_9_PIX_Query", patientidentifiercrossreferencemanager);
                        pix.addTransaction(iti_9_pix_query);
                        
                Transaction iti_10_pix_update_notification = new Transaction(patientidentifiercrossreferencemanager, "ITI_10_PIX_Update_Notification", patientidentifiercrossreferenceconsumer);
                        pix.addTransaction(iti_10_pix_update_notification);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        pix.addDomain(infrastructure);
                
                
                
    }
    
    public PIX() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.pix;
		}
}
