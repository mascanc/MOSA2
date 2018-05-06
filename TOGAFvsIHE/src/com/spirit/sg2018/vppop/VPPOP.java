package com.spirit.sg2018.vppop;
import com.spirit.togaf.bb.SAT;
import com.spirit.togaf.bb.dependencies.TFRule;

public class VPPOP {
	private SAT vppop;
	
	private void initSAT( FSCH fsch,  MMXU mmxu,  ENA ena,  int fake) {
		vppop = new SAT("The VPPOP Techinical Framework", "1", "Testing", "Establish the VPP Operator");
		vppop.addRule(new TFRule("*/FSCH->SecureNode/ENA"));
		vppop.addRule(new TFRule("*/MMXY->SecureNode/ENA"));
		vppop.addRule(new TFRule("<<-/MMS"));
		vppop.addSolutionPattern(fsch.getABB());
		vppop.addSolutionPattern(mmxu.getABB());
		vppop.addSolutionPattern(ena.getABB());
	}
	
	public VPPOP(FSCH fsch, MMXU mmxu, ENA ena,  int fake) {
	    initSAT( fsch,  mmxu,  ena,  0);
	                    	
	}
	public SAT getSAT() {
	    return this.vppop;
	}
}

