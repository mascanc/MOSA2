package com.spirit.ihe.iti;
        
import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.Actor;
import com.spirit.togaf.bb.dependencies.Domain;
import com.spirit.togaf.bb.dependencies.QualityAttribute;
import com.spirit.togaf.bb.dependencies.Transaction;
        
public class EUA {
    private ABB eua;
        
    private void initP() {
        eua = new ABB("EUA", "Defines a a means to establish one name per user that can then be used on all of the devices and software that participate in this integration profile", "Authenticate users", "Enterprise User Authentication");
                                                
                Actor kerberosauthenticationserver = new Actor("KerberosAuthenticationServer");
                        eua.addActor(kerberosauthenticationserver);
                Actor kerberizedserver = new Actor("KerberizedServer");
                        eua.addActor(kerberizedserver);
                Actor clientauthenticationagent = new Actor("ClientAuthenticationAgent");
                        eua.addActor(clientauthenticationagent);
                Actor contextmanager = new Actor("ContextManager");
                        eua.addActor(contextmanager);
                Actor usercontextparticipant = new Actor("UserContextParticipant");
                        eua.addActor(usercontextparticipant);
                
                Transaction iti_2_get_user_authentication = new Transaction(clientauthenticationagent, "ITI_2_Get_User_Authentication", kerberosauthenticationserver);
                        eua.addTransaction(iti_2_get_user_authentication);
                        
                Transaction iti_3_get_service_ticket = new Transaction(clientauthenticationagent, "ITI_3_Get_Service_Ticket", kerberosauthenticationserver);
                        eua.addTransaction(iti_3_get_service_ticket);
                        
                Transaction iti_4_kerberized_communication = new Transaction(clientauthenticationagent, "ITI_4_Kerberized_Communication", kerberizedserver);
                        eua.addTransaction(iti_4_kerberized_communication);
                        
                Transaction iti_5_join_context = new Transaction(clientauthenticationagent, "ITI_5_Join_Context", contextmanager);
                        eua.addTransaction(iti_5_join_context);
                        
                Transaction iti_6_change_context = new Transaction(clientauthenticationagent, "ITI_6_Change_Context", contextmanager);
                        eua.addTransaction(iti_6_change_context);
                        
                Transaction iti_7_leave_context = new Transaction(clientauthenticationagent, "ITI_7_Leave_Context", contextmanager);
                        eua.addTransaction(iti_7_leave_context);
                        
                Transaction iti_5_join_context_user = new Transaction(usercontextparticipant, "ITI_5_Join_Context_User", contextmanager);
                        eua.addTransaction(iti_5_join_context_user);
                        
                Transaction iti_6_change_context_user = new Transaction(usercontextparticipant, "ITI_6_Change_Context_User", contextmanager);
                        eua.addTransaction(iti_6_change_context_user);
                        
                Transaction iti_7_leave_context_user = new Transaction(usercontextparticipant, "ITI_7_Leave_Context_User", contextmanager);
                        eua.addTransaction(iti_7_leave_context_user);
                        
                
                Domain infrastructure = new Domain() { 
                    private String name = "Infrastructure";
                    public String getName() { return name; }
                };
                        eua.addDomain(infrastructure);
                
                
                
    }
    
    public EUA() {
    	    initP();
    	
    	}
    	
    	public ABB getABB() {
    		return this.eua;
		}
}
