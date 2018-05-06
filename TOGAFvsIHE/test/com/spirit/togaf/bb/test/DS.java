package com.spirit.togaf.bb.test;
        
import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.Actor;
import com.spirit.togaf.bb.dependencies.Domain;
import com.spirit.togaf.bb.dependencies.QualityAttribute;
import com.spirit.togaf.bb.dependencies.Transaction;
        
public class DS {
    private ABB ds;
        
    private void initP() {
        ds = new ABB("DS", "Document Sharing", "Shares Document", "Document Management");
                                                
                Actor dsact = new Actor("DSAct");
                        ds.addActor(dsact);
                Actor dc = new Actor("DC");
                        ds.addActor(dc);
                Actor dsto = new Actor("DSto");
                        ds.addActor(dsto);
                
                Transaction query = new Transaction(dc, "Query", dsto);
                        ds.addTransaction(query);
                        
                Transaction insert = new Transaction(dsact, "Insert", dsto);
                        ds.addTransaction(insert);
                        
                
                Domain semantics = new Domain() { 
                    private String name = "Semantics";
                    public String getName() { return name; }
                };
                        ds.addDomain(semantics);
                
                
                
    }
    
    public DS() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.ds;
		}
}
