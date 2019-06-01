package com.spirit.sample.generated.iti;
        
import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.Transaction;
        
public class XDS {
    private ABB xds;
        
    private void initP() {
        xds = new ABB("XDS", "The Cross-Enterprise Document Sharing (XDS.b) IHE Integration Profile facilitates the registration, distribution and access across health enterprises of patient electronic health records.", "Document Sharing", "Cross-Enterprise Document Sharing");
                                                
                Actor patientidentitysource = new Actor("PatientIdentitySource");
                        xds.addActor(patientidentitysource);
                Actor documentregistry = new Actor("DocumentRegistry");
                        xds.addActor(documentregistry);
                Actor documentconsumer = new Actor("DocumentConsumer");
                        xds.addActor(documentconsumer);
                Actor documentrepository = new Actor("DocumentRepository");
                        xds.addActor(documentrepository);
                Actor ondemanddocumentsource = new Actor("OnDemandDocumentSource");
                        xds.addActor(ondemanddocumentsource);
                Actor documentsource = new Actor("DocumentSource");
                        xds.addActor(documentsource);
                
                Transaction iti_8_patient_identity_feed = new Transaction(patientidentitysource, "ITI_8_Patient_Identity_Feed", documentregistry);
                        xds.addTransaction(iti_8_patient_identity_feed);
                        
                Transaction iti_44_patient_identity_feed_hl7v3 = new Transaction(patientidentitysource, "ITI_44_Patient_Identity_Feed_HL7V3", documentregistry);
                        xds.addTransaction(iti_44_patient_identity_feed_hl7v3);
                        
                Transaction iti_61_register_ondemand_document_entry = new Transaction(ondemanddocumentsource, "ITI_61_Register_OnDemand_Document_Entry", documentregistry);
                        xds.addTransaction(iti_61_register_ondemand_document_entry);
                        
                Transaction iti_18_registry_stored_query = new Transaction(documentconsumer, "ITI_18_Registry_Stored_Query", documentregistry);
                        xds.addTransaction(iti_18_registry_stored_query);
                        
                Transaction iti_41_provide_and_register_document_set = new Transaction(documentsource, "ITI_41_Provide_and_Register_Document_Set", documentrepository);
                        xds.addTransaction(iti_41_provide_and_register_document_set);
                        
                Transaction iti_42_register_document_set = new Transaction(documentrepository, "ITI_42_Register_document_set", documentregistry);
                        xds.addTransaction(iti_42_register_document_set);
                        
                Transaction iti_43_retrieve_document_set = new Transaction(documentconsumer, "ITI_43_Retrieve_Document_Set", documentrepository);
                        xds.addTransaction(iti_43_retrieve_document_set);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        xds.addDomain(infrastructure);
                
                
                
    }
    
    public XDS() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.xds;
		}
}
