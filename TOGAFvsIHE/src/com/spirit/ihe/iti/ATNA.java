package com.spirit.ihe.iti;
        
import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.Actor;
import com.spirit.togaf.bb.dependencies.Domain;
import com.spirit.togaf.bb.dependencies.QualityAttribute;
import com.spirit.togaf.bb.dependencies.Transaction;
        
public class ATNA {
    private ABB atna;
        
    private void initP() {
        atna = new ABB("ATNA", "The Audit Trail and Node Authentication (ATNA) Profile specifies the foundational elements needed by all forms of secure systems", "Secure Connection and Audit Trail", "Audit Trail and Node Authentication");
                                                
                Actor secureapplication = new Actor("SecureApplication");
                        atna.addActor(secureapplication);
                Actor securenode = new Actor("SecureNode");
                        atna.addActor(securenode);
                Actor auditrecordrepository = new Actor("AuditRecordRepository");
                        atna.addActor(auditrecordrepository);
                Actor auditrecordforwarder = new Actor("AuditRecordForwarder");
                        atna.addActor(auditrecordforwarder);
                
                Transaction iti_19_node_authentication = new Transaction(secureapplication, "ITI_19_Node_Authentication", securenode);
                        atna.addTransaction(iti_19_node_authentication);
                        
                Transaction iti_20_record_audit_event = new Transaction(secureapplication, "ITI_20_Record_Audit_Event", auditrecordrepository);
                        atna.addTransaction(iti_20_record_audit_event);
                        
                Transaction iti_20_record_audit_forward = new Transaction(auditrecordforwarder, "ITI_20_Record_Audit_Forward", auditrecordrepository);
                        atna.addTransaction(iti_20_record_audit_forward);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        atna.addDomain(infrastructure);
                
                
                
    }
    
    public ATNA() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.atna;
		}
}
