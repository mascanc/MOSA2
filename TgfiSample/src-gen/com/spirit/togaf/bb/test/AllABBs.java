package com.spirit.togaf.bb.test;

import java.util.HashMap;

import com.spirit.togaf.bb.ABB;

public class AllABBs {
	// instantiate all the ABBs
	private final PI pi = new PI();
	private final DS ds = new DS();
	private final SR sr = new SR();
	private final HashMap<String, ABB> abbList = new HashMap<>();
	
	// Constructor. Here I instantiate the ABBs
	public AllABBs() {
		
		// Instantiate the SAT
		SecurePIX securepix = new SecurePIX(pi, ds, sr,  0);
		
		// Add this SAT as parent SAT
		pi.getABB().addParentSAT(securepix.getSAT());
		abbList.put(pi.getABB().getName(), pi.getABB());
		ds.getABB().addParentSAT(securepix.getSAT());
		abbList.put(ds.getABB().getName(), ds.getABB());
		sr.getABB().addParentSAT(securepix.getSAT());
		abbList.put(sr.getABB().getName(), sr.getABB());
	}
	
	public HashMap<String, ABB> getAbbList() {
		return abbList;
	}
	
}
