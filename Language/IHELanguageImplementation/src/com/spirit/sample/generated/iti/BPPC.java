package com.spirit.sample.generated.iti;
        
import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.Transaction;
        
public class BPPC {
    private ABB bppc;
        
    private void initP() {
        bppc = new ABB("BPPC", "The document sharing infrastructure provided by XD* allow for the publication and use of clinical documents associated with a patient", "Patient Privacy", "Basic Patient Privacy Consents (BPPC)");
                                                
                Actor contentcreator = new Actor("ContentCreator");
                        bppc.addActor(contentcreator);
                Actor contentconsumer = new Actor("ContentConsumer");
                        bppc.addActor(contentconsumer);
                
                Transaction iti_xx_share_data = new Transaction(contentcreator, "ITI_XX_Share_Data", contentconsumer);
                        bppc.addTransaction(iti_xx_share_data);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        bppc.addDomain(infrastructure);
                
                
                
    }
    
    public BPPC() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.bppc;
		}
}
