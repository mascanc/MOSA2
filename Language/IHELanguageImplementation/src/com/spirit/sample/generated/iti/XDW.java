package com.spirit.sample.generated.iti;
        
import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.Transaction;
        
public class XDW {
    private ABB xdw;
        
    private void initP() {
        xdw = new ABB("XDW", "The Cross-Enterprise Document Workflow (XDW) Profile enables participants in a multi-organizational environment to manage and track the tasks related to patient-centric workflows as the systems hosting workflow management applications coordinate their activities for the health professionals and patients they support.", "Workflow handling", "Cross-Enterprise Document Workflow Content Profile (XDW)");
                                                
                Actor contentcreator = new Actor("ContentCreator");
                        xdw.addActor(contentcreator);
                Actor contentconsumer = new Actor("ContentConsumer");
                        xdw.addActor(contentconsumer);
                
                Transaction iti_xx_share_data = new Transaction(contentcreator, "ITI_XX_Share_Data", contentconsumer);
                        xdw.addTransaction(iti_xx_share_data);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        xdw.addDomain(infrastructure);
                
                
                
    }
    
    public XDW() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.xdw;
		}
}
