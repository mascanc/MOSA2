package com.spirit.sample.generated.iti;
        
import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.Transaction;
        
public class PWP {
    private ABB pwp;
        
    private void initP() {
        pwp = new ABB("PWP", "The Personnel White Pages (PWP) Profile provides access to basic directory information on human workforce members to other workforce members within the enterprise", "Directory of Users", "Personnel White Pages");
                                                
                Actor personnelwhitepagesconsumer = new Actor("PersonnelWhitePagesConsumer");
                        pwp.addActor(personnelwhitepagesconsumer);
                Actor dnsserver = new Actor("DNSServer");
                        pwp.addActor(dnsserver);
                Actor personnelwhitepagesdirectory = new Actor("PersonnelWhitePagesDirectory");
                        pwp.addActor(personnelwhitepagesdirectory);
                
                Transaction iti_23_find_personnel_white_pages = new Transaction(personnelwhitepagesconsumer, "ITI_23_Find_Personnel_White_Pages", dnsserver);
                        pwp.addTransaction(iti_23_find_personnel_white_pages);
                        
                Transaction iti_24_query_personnel_white_pages = new Transaction(personnelwhitepagesconsumer, "ITI_24_Query_Personnel_White_Pages", personnelwhitepagesdirectory);
                        pwp.addTransaction(iti_24_query_personnel_white_pages);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        pwp.addDomain(infrastructure);
                
                
                
    }
    
    public PWP() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.pwp;
		}
}
