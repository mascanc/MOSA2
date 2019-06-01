package com.spirit.sample.generated.centralregistry;
        
import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.SecurityRequirement;
import com.spirit.ihe.language.bb.dependencies.Transaction;
        
public class XUA {
    private ABB xua;
        
    private void initP() {
        xua = new ABB("XUA", "Cross Enterprise User Assertion", "Provides Strong authentication based on SAMLv2", "Strong Authentication");
                                                
                Actor xserviceuser = new Actor("XServiceUser");
		        	xua.addActor(xserviceuser);
                Actor xserviceprovider = new Actor("XServiceProvider");
		        	xua.addActor(xserviceprovider);
        	
        	Transaction providersuserassertion = new Transaction(xserviceuser, "ProvidersUserAssertion", xserviceprovider);
        	xua.addTransaction(providersuserassertion);
        	                
        	
        	Domain security = new Domain() { 
        	    private String name = "Security";
        	    public String getName() { return name; }
        	};
        	xua.addDomain(security);
        		
        		QualityAttribute att1 = new QualityAttribute() {
        			private String value = "xua.authn.sec<100";
        						
        			@Override
        			public void addRule(String value) {
        			this.value = value;
        			}
        						
        			@Override
        			public String getValue() {
        			return this.value;
        			}
        						            
        			@Override
        			public void evaluate(ABB y, ABB y2) {
        			// place your implementation here
        			}
        		};
        		xua.addQualityAttribute(att1);
        		
        		SecurityRequirement xua1 = new SecurityRequirement() {
        			private String goal = "Authentication";
        			private String level = "2";
        			private String location = "Zone1";
        			private String state = "Transit";
        			private String descr = "SAML with passwords";
        			private String category = "User Authentication";
        			private String name = "xua1";
        			
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
        		xua.addSecurityRequirements(xua1);
        		
        			
    			}
    			
    			public XUA() {
    				    initP();
    			
    			}
    			
    			public ABB getABB() {
    				return this.xua;
			}
			}
