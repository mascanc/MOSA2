package com.spirit.sample.generated.sgc2018;
        
import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.Transaction;
        
public class MMXU {
    private ABB mmxu;
        
    private void initP() {
        mmxu = new ABB("MMXU", "DEU Measurements", "Provide current DEU measurements to the VPPOP", "Read measurements");
                                                
                Actor mmxuconsumer = new Actor("MMXUConsumer");
                        mmxu.addActor(mmxuconsumer);
                Actor mmxuprovider = new Actor("MMXUProvider");
                        mmxu.addActor(mmxuprovider);
                
                Transaction vppop_6_providemmxumms = new Transaction(mmxuprovider, "VPPOP_6_ProvideMMXU(MMS)", mmxuconsumer);
                        mmxu.addTransaction(vppop_6_providemmxumms);
                        
                
                Domain information = new Domain() { 
                    private String name = "Information";
                    public String getName() { return name; }
                };
                        mmxu.addDomain(information);
                
                
                
    }
    
    public MMXU() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.mmxu;
		}
}
