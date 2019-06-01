package com.spirit.sample.generated.iti;
        
import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.Transaction;
        
public class XDM {
    private ABB xdm;
        
    private void initP() {
        xdm = new ABB("XDM", "Cross-Enterprise Document Media Interchange (XDM) provides document interchange using a common file and directory structure over several standard media types", "Document Exchange", "Cross-Enterprise Document Media Interchange (XDM)");
                                                
                Actor portablemediacreator = new Actor("PortableMediaCreator");
                        xdm.addActor(portablemediacreator);
                Actor portablemediaimporter = new Actor("PortableMediaImporter");
                        xdm.addActor(portablemediaimporter);
                
                Transaction iti_32_distribute_document_set_on_media = new Transaction(portablemediacreator, "ITI_32_Distribute_Document_Set_on_Media", portablemediaimporter);
                        xdm.addTransaction(iti_32_distribute_document_set_on_media);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        xdm.addDomain(infrastructure);
                
                
                
    }
    
    public XDM() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.xdm;
		}
}
