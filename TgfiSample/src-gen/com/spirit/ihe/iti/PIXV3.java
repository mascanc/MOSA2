package com.spirit.ihe.iti;
        
import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.Actor;
import com.spirit.togaf.bb.dependencies.Domain;
import com.spirit.togaf.bb.dependencies.QualityAttribute;
import com.spirit.togaf.bb.dependencies.Transaction;
        
public class PIXV3 {
    private ABB pixv3;
        
    private void initP() {
        pixv3 = new ABB("PIXV3", "Supports the cross-referencing of patient identifiers from multiple Patient Identifier Domains in HL7V3", "Patient Identification", "Patient Identifier Cross-referencing");
                                                
                Actor patientidentifiercrossreferencemanager = new Actor("PatientIdentifierCrossReferenceManager");
                        pixv3.addActor(patientidentifiercrossreferencemanager);
                Actor patientidentitysource = new Actor("PatientIdentitySource");
                        pixv3.addActor(patientidentitysource);
                Actor patientidentifiercrossreferenceconsumer = new Actor("PatientIdentifierCrossReferenceConsumer");
                        pixv3.addActor(patientidentifiercrossreferenceconsumer);
                
                Transaction iti_44_patient_identity_feed_hl7v3 = new Transaction(patientidentitysource, "ITI_44_Patient_Identity_Feed_HL7V3", patientidentifiercrossreferencemanager);
                        pixv3.addTransaction(iti_44_patient_identity_feed_hl7v3);
                        
                Transaction iti_45_pixv3_query = new Transaction(patientidentifiercrossreferenceconsumer, "ITI_45_PIXV3_Query", patientidentifiercrossreferencemanager);
                        pixv3.addTransaction(iti_45_pixv3_query);
                        
                Transaction iti_46_pixv3_update_notification = new Transaction(patientidentifiercrossreferencemanager, "ITI_46_PIXV3_Update_Notification", patientidentifiercrossreferenceconsumer);
                        pixv3.addTransaction(iti_46_pixv3_update_notification);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        pixv3.addDomain(infrastructure);
                
                
                
    }
    
    public PIXV3() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.pixv3;
		}
}
