package com.spirit.sample.generated.centralregistry;

import java.util.HashMap;

import com.spirit.ihe.language.bb.ABB;

public class AllABBs {
	// instantiate all the ABBs
	private final XDS xds = new XDS();
	private final ATNA atna = new ATNA();
	private final XUA xua = new XUA();
	private final Clinic clinic = new Clinic();
	private final ExtSource extsource = new ExtSource();
	private final HashMap<String, ABB> abbList = new HashMap<>();
	
	// Constructor. Here I instantiate the ABBs
	public AllABBs() {
		
		// Instantiate the SAT
		CentralRegistry centralregistry = new CentralRegistry(xds, atna, xua, clinic, extsource,  0);
		
		// Add this SAT as parent SAT
		xds.getABB().addParentSAT(centralregistry.getSAT());
		abbList.put(xds.getABB().getName(), xds.getABB());
		atna.getABB().addParentSAT(centralregistry.getSAT());
		abbList.put(atna.getABB().getName(), atna.getABB());
		xua.getABB().addParentSAT(centralregistry.getSAT());
		abbList.put(xua.getABB().getName(), xua.getABB());
		clinic.getABB().addParentSAT(centralregistry.getSAT());
		abbList.put(clinic.getABB().getName(), clinic.getABB());
		extsource.getABB().addParentSAT(centralregistry.getSAT());
		abbList.put(extsource.getABB().getName(), extsource.getABB());
	}
	
	public HashMap<String, ABB> getAbbList() {
		return abbList;
	}
	
}
