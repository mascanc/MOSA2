package com.spirit.togaf.bb.test;
import com.spirit.togaf.bb.SAT;
import com.spirit.togaf.bb.dependencies.TFRule;

public class SecurePIX {
    private SAT securepix;
    
    private void initSAT( PI pi,  DS ds,  SR sr,  int fake) {
        securepix = new SAT("Secure PIX", "1.0", "Released", "Provides a Secure PIX connection");
        securepix.addRule(new TFRule("*/PI->Sconn/SR"));
        securepix.addRule(new TFRule("*/DS->SConn/SR"));
        securepix.addSolutionPattern(pi.getABB());
        securepix.addSolutionPattern(ds.getABB());
        securepix.addSolutionPattern(sr.getABB());
    }
    
    public SecurePIX(PI pi, DS ds, SR sr,  int fake) {
        initSAT( pi,  ds,  sr,  0);
                            
    }
    public SAT getSAT() {
        return this.securepix;
    }
}

