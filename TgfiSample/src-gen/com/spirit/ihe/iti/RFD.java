package com.spirit.ihe.iti;
        
import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.Actor;
import com.spirit.togaf.bb.dependencies.Domain;
import com.spirit.togaf.bb.dependencies.QualityAttribute;
import com.spirit.togaf.bb.dependencies.Transaction;
        
public class RFD {
    private ABB rfd;
        
    private void initP() {
        rfd = new ABB("RFD", "The Retrieve Form for Data Capture (RFD) Profile provides a method for gathering data within a user’s current application to meet the requirements of an external system", "Retrieve Form Exchange", "Retrieve Form for Data Capture (RFD)");
                                                
                Actor formfiller = new Actor("FormFiller");
                        rfd.addActor(formfiller);
                Actor formarchiver = new Actor("FormArchiver");
                        rfd.addActor(formarchiver);
                Actor formmanager = new Actor("FormManager");
                        rfd.addActor(formmanager);
                Actor formreceiver = new Actor("FormReceiver");
                        rfd.addActor(formreceiver);
                
                Transaction iti_34_retrieve_form = new Transaction(formfiller, "ITI_34_Retrieve_Form", formmanager);
                        rfd.addTransaction(iti_34_retrieve_form);
                        
                Transaction iti_37_retrieve_clarifications = new Transaction(formfiller, "ITI_37_Retrieve_Clarifications", formmanager);
                        rfd.addTransaction(iti_37_retrieve_clarifications);
                        
                Transaction iti_35_submit_form = new Transaction(formfiller, "ITI_35_Submit_Form", formreceiver);
                        rfd.addTransaction(iti_35_submit_form);
                        
                Transaction iti_36_archive_form = new Transaction(formfiller, "ITI_36_Archive_Form", formarchiver);
                        rfd.addTransaction(iti_36_archive_form);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        rfd.addDomain(infrastructure);
                
                
                
    }
    
    public RFD() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.rfd;
		}
}
