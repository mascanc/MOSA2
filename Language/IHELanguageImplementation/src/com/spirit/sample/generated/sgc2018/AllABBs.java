package com.spirit.sample.generated.sgc2018;

import java.util.HashMap;

import com.spirit.ihe.language.bb.ABB;

public class AllABBs {
	// instantiate all the ABBs
	private final FSCH fsch = new FSCH();
	private final MMXU mmxu = new MMXU();
	private final ENA ena = new ENA();
	private final HashMap<String, ABB> abbList = new HashMap<>();
	
	// Constructor. Here I instantiate the ABBs
	public AllABBs() {
		
		// Instantiate the SAT
		VPPOP vppop = new VPPOP(fsch, mmxu, ena,  0);
		
		// Add this SAT as parent SAT
		fsch.getABB().addParentSAT(vppop.getSAT());
		abbList.put(fsch.getABB().getName(), fsch.getABB());
		mmxu.getABB().addParentSAT(vppop.getSAT());
		abbList.put(mmxu.getABB().getName(), mmxu.getABB());
		ena.getABB().addParentSAT(vppop.getSAT());
		abbList.put(ena.getABB().getName(), ena.getABB());
	}
	
	public HashMap<String, ABB> getAbbList() {
		return abbList;
	}
	
}
