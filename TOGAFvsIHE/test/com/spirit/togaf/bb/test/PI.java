package com.spirit.togaf.bb.test;
        
import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.Actor;
import com.spirit.togaf.bb.dependencies.Domain;
import com.spirit.togaf.bb.dependencies.QualityAttribute;
import com.spirit.togaf.bb.dependencies.Transaction;
        
public class PI {
    private ABB pi;
        
    private void initP() {
        pi = new ABB("PI", "Patient Identification", "Patient Match", "Patient Management");
                                                
                Actor pic = new Actor("PIC");
                        pi.addActor(pic);
                Actor pis = new Actor("PIS");
                        pi.addActor(pis);
                
                Transaction feed = new Transaction(pic, "Feed", pis);
                        pi.addTransaction(feed);
                        
                Transaction query = new Transaction(pic, "Query", pis);
                        pi.addTransaction(query);
                        
                
                Domain information = new Domain() { 
                    private String name = "Information";
                    public String getName() { return name; }
                };
                        pi.addDomain(information);
                
                QualityAttribute att1 = new QualityAttribute() {
                private String value = "pi.levenstein.match_score<.9";
                            
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
                        pi.addQualityAttribute(att1);
                QualityAttribute att2 = new QualityAttribute() {
                private String value = "pi.levenstein.match_sec<200";
                            
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
                        pi.addQualityAttribute(att2);
                QualityAttribute att3 = new QualityAttribute() {
                private String value = "pi.soundex.match_score<.83";
                            
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
                        pi.addQualityAttribute(att3);
                QualityAttribute att4 = new QualityAttribute() {
                private String value = "pi.soundex.match_sec<400";
                            
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
                        pi.addQualityAttribute(att4);
                
                
    }
    
    public PI() {
            initP();
        
        }
        
        public ABB getABB() {
            return this.pi;
        }
}
