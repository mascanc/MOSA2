package com.spirit.ihe.iti;
        
import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.Actor;
import com.spirit.togaf.bb.dependencies.Domain;
import com.spirit.togaf.bb.dependencies.QualityAttribute;
import com.spirit.togaf.bb.dependencies.Transaction;
        
public class PSA {
    private ABB psa;
        
    private void initP() {
        psa = new ABB("PSA", "The Patient Synchronized Applications Profile (PSA) enables single patient selection for the user working in multiple applications on a workstation desktop.", "Patient Synchronized Applications Profile. Enhance EUA", "Allows patient to use a common context for authentication");
                                                
                Actor patientcontextparticipantactor = new Actor("PatientContextParticipantActor");
                        psa.addActor(patientcontextparticipantactor);
                Actor contextmanageractor = new Actor("ContextManagerActor");
                        psa.addActor(contextmanageractor);
                
                Transaction iti_13_follow_context = new Transaction(contextmanageractor, "ITI_13_Follow_Context", patientcontextparticipantactor);
                        psa.addTransaction(iti_13_follow_context);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        psa.addDomain(infrastructure);
                
                
                
    }
    
    public PSA() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.psa;
		}
}
