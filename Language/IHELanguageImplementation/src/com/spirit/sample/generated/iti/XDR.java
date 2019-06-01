package com.spirit.sample.generated.iti;
        
import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.Transaction;
        
public class XDR {
    private ABB xdr;
        
    private void initP() {
        xdr = new ABB("XDR", "CrossEnterprise Document Reliable Interchange (XDR) provides document interchange using a 3860 reliable messaging system", "Document Exchange", "CrossEnterprise Document Reliable Interchange");
                                                
                Actor documentsource = new Actor("DocumentSource");
                        xdr.addActor(documentsource);
                Actor metadatalimiteddocumentsource = new Actor("MetadataLimitedDocumentSource");
                        xdr.addActor(metadatalimiteddocumentsource);
                Actor documentrecipient = new Actor("DocumentRecipient");
                        xdr.addActor(documentrecipient);
                
                Transaction iti_41_provide_and_register_document_set = new Transaction(documentsource, "ITI_41_Provide_and_Register_Document_Set", documentrecipient);
                        xdr.addTransaction(iti_41_provide_and_register_document_set);
                        
                Transaction iti_41_provide_and_register_document_set_mld = new Transaction(metadatalimiteddocumentsource, "ITI_41_Provide_and_Register_Document_Set_MLD", documentrecipient);
                        xdr.addTransaction(iti_41_provide_and_register_document_set_mld);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        xdr.addDomain(infrastructure);
                
                
                
    }
    
    public XDR() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.xdr;
		}
}
