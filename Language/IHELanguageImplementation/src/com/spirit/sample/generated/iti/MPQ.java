package com.spirit.sample.generated.iti;
        
import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.Transaction;
        
public class MPQ {
    private ABB mpq;
        
    private void initP() {
        mpq = new ABB("MPQ", "The Multi-Patient Queries Profile defines a mechanism to enable aggregated queries to a 6155 Document Registry based on certain criteria needed by areas related to data analysis", "Query Demographics of many patients", "Multi-Patient Queries (MPQ)");
                                                
                Actor documentconsumer = new Actor("DocumentConsumer");
                        mpq.addActor(documentconsumer);
                Actor documentregistry = new Actor("DocumentRegistry");
                        mpq.addActor(documentregistry);
                
                Transaction iti_51_multi_patient_stored_query = new Transaction(documentconsumer, "ITI_51_Multi_Patient_Stored_Query", documentregistry);
                        mpq.addTransaction(iti_51_multi_patient_stored_query);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        mpq.addDomain(infrastructure);
                
                
                
    }
    
    public MPQ() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.mpq;
		}
}
