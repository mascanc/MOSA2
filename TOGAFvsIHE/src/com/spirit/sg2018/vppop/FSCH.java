package com.spirit.sg2018.vppop;
        
import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.Actor;
import com.spirit.togaf.bb.dependencies.Domain;
import com.spirit.togaf.bb.dependencies.QualityAttribute;
import com.spirit.togaf.bb.dependencies.Transaction;
        
public class FSCH {
    private ABB fsch;
        
    private void initP() {
        fsch = new ABB("FSCH", "Functional Schedule", "Provide the Functional Schedule to the DEU", "Functional Schedule");
                                                
                Actor fschinitiator = new Actor("FSCHInitiator");
                        fsch.addActor(fschinitiator);
                Actor fschresponder = new Actor("FSCHResponder");
                        fsch.addActor(fschresponder);
                
                Transaction vppop_1_providefschmms = new Transaction(fschinitiator, "VPPOP_1_ProvideFSCH(MMS)", fschresponder);
                        fsch.addTransaction(vppop_1_providefschmms);
                        
                Transaction vppop_2_readcurrentfschmms = new Transaction(fschinitiator, "VPPOP_2_ReadCurrentFSCH(MMS)", fschresponder);
                        fsch.addTransaction(vppop_2_readcurrentfschmms);
                        
                Transaction vppop_3_validaterequestmms = new Transaction(fschinitiator, "VPPOP_3_ValidateRequest(MMS)", fschresponder);
                        fsch.addTransaction(vppop_3_validaterequestmms);
                        
                Transaction vppop_4_enablerequestmms = new Transaction(fschinitiator, "VPPOP_4_EnableRequest(MMS)", fschresponder);
                        fsch.addTransaction(vppop_4_enablerequestmms);
                        
                Transaction vppop_5_disablerequestmms = new Transaction(fschinitiator, "VPPOP_5_DisableRequest(MMS)", fschresponder);
                        fsch.addTransaction(vppop_5_disablerequestmms);
                        
                
                Domain information = new Domain() { 
                    private String name = "Information";
                    public String getName() { return name; }
                };
                        fsch.addDomain(information);
                
                
                
    }
    
    public FSCH() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.fsch;
		}
}
