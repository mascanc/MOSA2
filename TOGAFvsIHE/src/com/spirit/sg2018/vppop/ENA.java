package com.spirit.sg2018.vppop;
        
import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.Actor;
import com.spirit.togaf.bb.dependencies.Domain;
import com.spirit.togaf.bb.dependencies.QualityAttribute;
import com.spirit.togaf.bb.dependencies.Transaction;
        
public class ENA {
    private ABB ena;
        
    private void initP() {
        ena = new ABB("ENA", "Provide Secure Access and Channel Authentication", "Secure Connections", "Security");
                                                
                Actor securenode = new Actor("SecureNode");
                        ena.addActor(securenode);
                Actor evidencestorage = new Actor("EvidenceStorage");
                        ena.addActor(evidencestorage);
                
                Transaction vppop_7_establishconnection = new Transaction(securenode, "VPPOP_7_EstablishConnection", securenode);
                        ena.addTransaction(vppop_7_establishconnection);
                        
                Transaction vppop_8_provideevidencemms = new Transaction(securenode, "VPPOP_8_ProvideEvidence(MMS)", evidencestorage);
                        ena.addTransaction(vppop_8_provideevidencemms);
                        
                Transaction vppop_8_provideevidencegoose = new Transaction(securenode, "VPPOP_8_ProvideEvidence(GOOSE)", evidencestorage);
                        ena.addTransaction(vppop_8_provideevidencegoose);
                        
                
                Domain security = new Domain() { 
                    private String name = "Security";
                    public String getName() { return name; }
                };
                        ena.addDomain(security);
                
                
                
    }
    
    public ENA() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.ena;
		}
}
