package com.spirit.sample.generated.centralregistry;
        
import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.SecurityRequirement;
import com.spirit.ihe.language.bb.dependencies.Transaction;
        
public class Portal {
    private ABB portal;
        
    private void initP() {
        portal = new ABB("PORTAL", "Portal used by the doctors to consume and provide clinical documents. It also authenticates users", "", "Consume and Provide clinical documents");
                                                
                Actor contentcreator = new Actor("ContentCreator");
		        	portal.addActor(contentcreator);
                Actor contentconsumer = new Actor("ContentConsumer");
		        	portal.addActor(contentconsumer);
                Actor contentrecipient = new Actor("ContentRecipient");
		        	portal.addActor(contentrecipient);
        	
        	Transaction consume = new Transaction(contentconsumer, "consume", contentrecipient);
        	portal.addTransaction(consume);
        	                
        	Transaction provide = new Transaction(contentcreator, "provide", contentrecipient);
        	portal.addTransaction(provide);
        	                
        	
        	Domain application = new Domain() { 
        	    private String name = "Application";
        	    public String getName() { return name; }
        	};
        	portal.addDomain(application);
        		
        		
        		SecurityRequirement prtl1 = new SecurityRequirement() {
        			private String goal = "Authentication";
        			private String level = "2";
        			private String location = "Zone2";
        			private String state = "Transit";
        			private String descr = "The portal authenticates user via a login screen";
        			private String category = "User Authentication";
        			private String name = "prtl1";
        			
        			@Override
        			public String getName() {
        				return this.name;	
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
        			public String getLevel() {
        				return this.level;	
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
        		portal.addSecurityRequirements(prtl1);
        		
        			
    			}
    			
    			public Portal() {
    				    initP();
    			
    			}
    			
    			public ABB getABB() {
    				return this.portal;
			}
			}
