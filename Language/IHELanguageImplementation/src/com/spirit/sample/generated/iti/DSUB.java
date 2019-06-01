package com.spirit.sample.generated.iti;
        
import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.Transaction;
        
public class DSUB {
    private ABB dsub;
        
    private void initP() {
        dsub = new ABB("DSUB", "This profile describes the use of subscription and notification mechanism for use within an XDS Affinity Domain and across communities", "Subscription mechanism for XDS registries", "Document Metadata Subscription (DSUB)");
                                                
                Actor documentmetadatapublisher = new Actor("DocumentMetadataPublisher");
                        dsub.addActor(documentmetadatapublisher);
                Actor documentmetadatanotificationbroker = new Actor("DocumentMetadataNotificationBroker");
                        dsub.addActor(documentmetadatanotificationbroker);
                Actor documentmetadatanotificationrecipient = new Actor("DocumentMetadataNotificationRecipient");
                        dsub.addActor(documentmetadatanotificationrecipient);
                Actor documentmetadatasubscriber = new Actor("DocumentMetadataSubscriber");
                        dsub.addActor(documentmetadatasubscriber);
                
                Transaction iti_54_document_metadata_publish = new Transaction(documentmetadatapublisher, "ITI_54_Document_Metadata_Publish", documentmetadatanotificationbroker);
                        dsub.addTransaction(iti_54_document_metadata_publish);
                        
                Transaction iti_52_document_metadata_subscribe = new Transaction(documentmetadatasubscriber, "ITI_52_Document_Metadata_Subscribe", documentmetadatanotificationbroker);
                        dsub.addTransaction(iti_52_document_metadata_subscribe);
                        
                Transaction iti_53_document_metadata_notify = new Transaction(documentmetadatanotificationbroker, "ITI_53_Document_Metadata_Notify", documentmetadatanotificationrecipient);
                        dsub.addTransaction(iti_53_document_metadata_notify);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        dsub.addDomain(infrastructure);
                
                
                
    }
    
    public DSUB() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.dsub;
		}
}
