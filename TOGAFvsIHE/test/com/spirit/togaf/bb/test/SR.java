package com.spirit.togaf.bb.test;
        
import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.Actor;
import com.spirit.togaf.bb.dependencies.Domain;
import com.spirit.togaf.bb.dependencies.QualityAttribute;
import com.spirit.togaf.bb.dependencies.Transaction;
        
public class SR {
    private ABB sr;
        
    private void initP() {
        sr = new ABB("SR", "Security Requirements", "Provides Security", "Security");
                                                
                Actor sconn = new Actor("SConn");
                        sr.addActor(sconn);
                
                Transaction connect = new Transaction(sconn, "Connect", sconn);
                        sr.addTransaction(connect);
                        
                
                Domain security = new Domain() { 
                    private String name = "Security";
                    public String getName() { return name; }
                };
                        sr.addDomain(security);
                
                QualityAttribute att1 = new QualityAttribute() {
                private String value = "sr.hw.hs_sec<3000";
                            
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
                        sr.addQualityAttribute(att1);
                QualityAttribute att2 = new QualityAttribute() {
                private String value = "sr.sw.hs_sec<1000";
                            
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
                        sr.addQualityAttribute(att2);
                
                
    }
    
    public SR() {
            initP();
        
        }
        
        public ABB getABB() {
            return this.sr;
        }
}
