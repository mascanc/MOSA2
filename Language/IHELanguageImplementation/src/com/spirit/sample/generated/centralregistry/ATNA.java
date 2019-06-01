package com.spirit.sample.generated.centralregistry;
        
import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.QualityAttribute;
import com.spirit.ihe.language.bb.dependencies.SecurityRequirement;
import com.spirit.ihe.language.bb.dependencies.Transaction;
        
public class ATNA {
    private ABB atna;
        
    private void initP() {
        atna = new ABB("ATNA", "Audit Trail and Node Authentication", "Provides encryption and node authentication for data in transit", "Security");
                                                
                Actor sn = new Actor("SN");
		        	atna.addActor(sn);
                Actor arr = new Actor("ARR");
		        	atna.addActor(arr);
        	
        	Transaction logeventtcps = new Transaction(sn, "LogEvent(TCPS)", arr);
        	atna.addTransaction(logeventtcps);
        	                
        	Transaction logeventudp = new Transaction(sn, "LogEvent(UDP)", arr);
        	atna.addTransaction(logeventudp);
        	                
        	Transaction connecttcps = new Transaction(sn, "Connect(TCPS)", sn);
        	atna.addTransaction(connecttcps);
        	                
        	
        	Domain security = new Domain() { 
        	    private String name = "Security";
        	    public String getName() { return name; }
        	};
        	atna.addDomain(security);
        		
        		QualityAttribute att1 = new QualityAttribute() {
        			private String value = "atna.hw.hs_sec<3000";
        						
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
        		atna.addQualityAttribute(att1);
        		QualityAttribute att2 = new QualityAttribute() {
        			private String value = "atna.sw.hs_sec<1000";
        						
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
        		atna.addQualityAttribute(att2);
        		
        		SecurityRequirement satna1 = new SecurityRequirement() {
        			private String goal = "Confidentiality";
        			private String level = "2";
        			private String location = "Zone1";
        			private String state = "Transit";
        			private String descr = "TLS Channels";
        			private String category = "Data confidentiality transfer protection";
        			private String name = "satna1";
        			
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
        		atna.addSecurityRequirements(satna1);
        		
        		SecurityRequirement satna2 = new SecurityRequirement() {
        			private String goal = "Accountability";
        			private String level = "1";
        			private String location = "Zone1";
        			private String state = "Transit";
        			private String descr = "rfc5424 syslog and DICOM PS A.5";
        			private String category = "Accountability";
        			private String name = "satna2";
        			
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
        		atna.addSecurityRequirements(satna2);
        		
        			
    			}
    			
    			public ATNA() {
    				    initP();
    			
    			}
    			
    			public ABB getABB() {
    				return this.atna;
			}
			}
