package com.spirit.sample.generated.centralregistry;
        
import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.SecurityRequirement;
import com.spirit.ihe.language.bb.dependencies.Transaction;
        
public class XDS {
    private ABB xds;
        
    private void initP() {
        xds = new ABB("XDS", "Cross Enterprise Document Sharing - IHE TF Vol2.a", "Clinical document handling", "Cross Enterprise Document Sharing");
                                                
                Actor consumer = new Actor("Consumer");
		        	xds.addActor(consumer);
                Actor source = new Actor("Source");
		        	xds.addActor(source);
                Actor registry = new Actor("Registry");
		        	xds.addActor(registry);
                Actor repository = new Actor("Repository");
		        	xds.addActor(repository);
        	
        	Transaction submit = new Transaction(source, "Submit", repository);
        	xds.addTransaction(submit);
        	                
        	Transaction register = new Transaction(repository, "Register", registry);
        	xds.addTransaction(register);
        	                
        	Transaction query = new Transaction(consumer, "Query", registry);
        	xds.addTransaction(query);
        	                
        	Transaction retrieves = new Transaction(consumer, "Retrieves", repository);
        	xds.addTransaction(retrieves);
        	                
        	
        	Domain infrastructure = new Domain() { 
        	    private String name = "Infrastructure";
        	    public String getName() { return name; }
        	};
        	xds.addDomain(infrastructure);
        		
        		
        		SecurityRequirement xds1 = new SecurityRequirement() {
        			private String goal = "";
        			private String level = "-1";
        			private String location = "Any";
        			private String state = "";
        			private String descr = "";
        			private String category = "";
        			private String name = "xds1";
        			
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
        		xds.addSecurityRequirements(xds1);
        		
        			
    			}
    			
    			public XDS() {
    				    initP();
    			
    			}
    			
    			public ABB getABB() {
    				return this.xds;
			}
			}
