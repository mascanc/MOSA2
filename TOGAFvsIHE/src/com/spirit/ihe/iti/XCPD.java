package com.spirit.ihe.iti;
        
import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.Actor;
import com.spirit.togaf.bb.dependencies.Domain;
import com.spirit.togaf.bb.dependencies.QualityAttribute;
import com.spirit.togaf.bb.dependencies.Transaction;
        
public class XCPD {
    private ABB xcpd;
        
    private void initP() {
        xcpd = new ABB("XCPD", "The Cross-Community Patient Discovery (XCPD) Profile supports the means to locate communities that hold patient relevant health data and the translation of patient identifiers across communities holding the same patient’s data", "Cross Community Data Exchange", "Cross-Community Access (XCA)");
                                                
                Actor initiatinggateway = new Actor("InitiatingGateway");
                        xcpd.addActor(initiatinggateway);
                Actor respondinggateway = new Actor("RespondingGateway");
                        xcpd.addActor(respondinggateway);
                
                Transaction iti_55_cross_gateway_patient_discovery = new Transaction(initiatinggateway, "ITI_55_Cross_Gateway_Patient_Discovery", respondinggateway);
                        xcpd.addTransaction(iti_55_cross_gateway_patient_discovery);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        xcpd.addDomain(infrastructure);
                
                
                
    }
    
    public XCPD() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.xcpd;
		}
}
