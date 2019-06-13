package com.spirit.sample.generated.centralregistry;
        
import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.Transaction;
import com.spirit.ihe.language.bb.dependencies.SecurityRequirement;
        
public class Clinic {
    private ABB clinic;
        
    private void initP() {
        clinic = new ABB("CLINIC", "Portal used by the doctors to consume and provide clinical documents. It also authenticates users", "", "Consume and Provide clinical documents");
                                                
                Actor contentcreator = new Actor("ContentCreator");
		        	clinic.addActor(contentcreator);
                Actor contentconsumer = new Actor("ContentConsumer");
		        	clinic.addActor(contentconsumer);
                Actor contentrecipient = new Actor("ContentRecipient");
		        	clinic.addActor(contentrecipient);
        	
        	Transaction consume = new Transaction(contentconsumer, "consume", contentrecipient);
        	clinic.addTransaction(consume);
        	                
        	Transaction provide = new Transaction(contentcreator, "provide", contentrecipient);
        	clinic.addTransaction(provide);
        	                
        	
        	Domain application = new Domain() { 
        	    private String name = "Application";
        	    public String getName() { return name; }
        	};
        	clinic.addDomain(application);
        		
        		
        		SecurityRequirement prtl1 = new SecurityRequirement() {
        			private String form = "Electronic";
        			private String sensitivity = "Confidential";
        			private String location = "Controlled";
        			private String state = "Transit";
        			private String goal = "Authentication";
        			private String descr = "The portal authenticates user via a login screen";
        			private String category = "User Authentication";
        			private String name = "prtl1";
        			
        			@Override
        			public String getName() {
        				return this.name;	
        			}

							@Override
        			public String getForm() {
        				return this.form;	
        			}
        			@Override
        			public String getGoal() {
        				return this.goal;	
        			}
        			@Override
        			public String getLocation() {
        				return this.location;	
        			}
        			@Override
        			public String getSensitivity() {
        				return this.sensitivity;	
        			}
        			@Override
        			public String getState() {
        				return this.state;	
        			}
        			@Override
        			public String getDescription() {
        				return this.descr;	
        			}
        			@Override
        			public String getCategory() {
        				return this.category;	
        			}

        		};
        		clinic.addSecurityRequirements(prtl1);
        		
        			
    			}
    			
    			public Clinic() {
    				    initP();
    			
    			}
    			
    			public ABB getABB() {
    				return this.clinic;
			}
			}
