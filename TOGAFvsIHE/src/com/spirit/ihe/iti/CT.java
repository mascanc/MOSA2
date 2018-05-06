package com.spirit.ihe.iti;
        
import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.Actor;
import com.spirit.togaf.bb.dependencies.Domain;
import com.spirit.togaf.bb.dependencies.QualityAttribute;
import com.spirit.togaf.bb.dependencies.Transaction;
        
public class CT {
    private ABB ct;
        
    private void initP() {
        ct = new ABB("CT", "Defines a mechanism to synchronize the time base between multiple actors and computers", "Keep time in sync, using NTP", "Consistent time");
                                                
                Actor timeclient = new Actor("TimeClient");
                        ct.addActor(timeclient);
                Actor timeserver = new Actor("TimeServer");
                        ct.addActor(timeserver);
                
                Transaction iti_1_maintain_time = new Transaction(timeclient, "ITI_1_Maintain_Time", timeserver);
                        ct.addTransaction(iti_1_maintain_time);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        ct.addDomain(infrastructure);
                
                
                
    }
    
    public CT() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.ct;
		}
}
