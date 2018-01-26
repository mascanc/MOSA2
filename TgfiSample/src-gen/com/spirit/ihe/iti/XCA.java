package com.spirit.ihe.iti;
        
import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.Actor;
import com.spirit.togaf.bb.dependencies.Domain;
import com.spirit.togaf.bb.dependencies.QualityAttribute;
import com.spirit.togaf.bb.dependencies.Transaction;
        
public class XCA {
    private ABB xca;
        
    private void initP() {
        xca = new ABB("XCA", "The Cross-Community Access Profile supports the means to query and retrieve patient relevant medical data held by other communities", "Cross Community Data Exchange", "Cross-Community Access (XCA)");
                                                
                Actor initiatinggateway = new Actor("InitiatingGateway");
                        xca.addActor(initiatinggateway);
                Actor respondinggateway = new Actor("RespondingGateway");
                        xca.addActor(respondinggateway);
                
                Transaction iti_38_cross_gateway_query = new Transaction(initiatinggateway, "ITI_38_Cross_Gateway_Query", respondinggateway);
                        xca.addTransaction(iti_38_cross_gateway_query);
                        
                Transaction iti_39_cross_gateway_retrieve = new Transaction(initiatinggateway, "ITI_39_Cross_Gateway_Retrieve", respondinggateway);
                        xca.addTransaction(iti_39_cross_gateway_retrieve);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        xca.addDomain(infrastructure);
                
                
                
    }
    
    public XCA() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.xca;
		}
}
