package com.spirit.ihe.iti;
        
import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.Actor;
import com.spirit.togaf.bb.dependencies.Domain;
import com.spirit.togaf.bb.dependencies.QualityAttribute;
import com.spirit.togaf.bb.dependencies.Transaction;
        
public class SVS {
    private ABB svs;
        
    private void initP() {
        svs = new ABB("SVS", "The Sharing Value Sets (SVS) Profile provides a means through which healthcare systems producing clinical or administrative data", "Shares Value Set", "Sharing Value Sets (SVS)");
                                                
                Actor valuesetconsumer = new Actor("ValueSetConsumer");
                        svs.addActor(valuesetconsumer);
                Actor valuesetrepository = new Actor("ValueSetRepository");
                        svs.addActor(valuesetrepository);
                
                Transaction iti_48_retrieve_value_set = new Transaction(valuesetconsumer, "ITI_48_Retrieve_Value_Set", valuesetrepository);
                        svs.addTransaction(iti_48_retrieve_value_set);
                        
                Transaction iti_60_retrieve_multiple_value_set = new Transaction(valuesetconsumer, "ITI_60_Retrieve_Multiple_Value_Set", valuesetrepository);
                        svs.addTransaction(iti_60_retrieve_multiple_value_set);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        svs.addDomain(infrastructure);
                
                
                
    }
    
    public SVS() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.svs;
		}
}
