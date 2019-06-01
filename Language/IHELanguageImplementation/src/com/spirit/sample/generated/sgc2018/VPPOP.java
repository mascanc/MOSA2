package com.spirit.sample.generated.sgc2018;
import com.spirit.ihe.language.bb.SAT;
import com.spirit.ihe.language.bb.dependencies.TFRule;

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

