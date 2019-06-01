package com.spirit.sample.generated.iti;
        
import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.Transaction;
        
public class DSG {
    private ABB dsg;
        
    private void initP() {
        dsg = new ABB("DSG", "The Document Digital Signature (DSG) Profile defines general purpose methods of digitally signing of documents for communication and persistence", "Digital Signature", "Document Digital Signature (DSG)");
                                                
                Actor contentcreator = new Actor("ContentCreator");
                        dsg.addActor(contentcreator);
                Actor contentconsumer = new Actor("ContentConsumer");
                        dsg.addActor(contentconsumer);
                
                Transaction iti_xx_share_data = new Transaction(contentcreator, "ITI_XX_Share_Data", contentconsumer);
                        dsg.addTransaction(iti_xx_share_data);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        dsg.addDomain(infrastructure);
                
                
                
    }
    
    public DSG() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.dsg;
		}
}
