package com.spirit.ihe.iti;
        
import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.Actor;
import com.spirit.togaf.bb.dependencies.Domain;
import com.spirit.togaf.bb.dependencies.QualityAttribute;
import com.spirit.togaf.bb.dependencies.Transaction;
        
public class XDSSD {
    private ABB xdssd;
        
    private void initP() {
        xdssd = new ABB("XDSSD", "A variety of legacy paper, film, electronic and scanner outputted formats are used to store and exchange clinical documents. It provide a mechanism that allows such source metadata to be stored with the document", "Scanned documents", "Cross-Enterprise Sharing of Scanned Documents (XDS-SD)");
                                                
                Actor contentcreator = new Actor("ContentCreator");
                        xdssd.addActor(contentcreator);
                Actor contentconsumer = new Actor("ContentConsumer");
                        xdssd.addActor(contentconsumer);
                
                Transaction iti_xx_share_data = new Transaction(contentcreator, "ITI_XX_Share_Data", contentconsumer);
                        xdssd.addTransaction(iti_xx_share_data);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        xdssd.addDomain(infrastructure);
                
                
                
    }
    
    public XDSSD() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.xdssd;
		}
}
