package com.spirit.sample.generated.iti;
        
import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.Transaction;
        
public class XUA {
    private ABB xua;
        
    private void initP() {
        xua = new ABB("XUA", "The Cross-Enterprise User Assertion Profile (XUA) provides a means to communicate claims about an authenticated principal (user, application, system...) in transactions that cross enterprise boundaries.", "Authentication of messages", "Cross Enterprise User Assertion");
                                                
                Actor xserviceuser = new Actor("XServiceUser");
                        xua.addActor(xserviceuser);
                Actor xserviceprovider = new Actor("XServiceProvider");
                        xua.addActor(xserviceprovider);
                
                Transaction iti_40_provide_x_user_assertion = new Transaction(xserviceuser, "ITI_40_Provide_X_User_Assertion", xserviceprovider);
                        xua.addTransaction(iti_40_provide_x_user_assertion);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        xua.addDomain(infrastructure);
                
                
                
    }
    
    public XUA() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.xua;
		}
}
