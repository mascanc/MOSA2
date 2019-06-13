package com.spirit.sample.generated.centralregistry;
import com.spirit.ihe.language.bb.SAT;
import com.spirit.ihe.language.bb.dependencies.TFRule;

public class CentralRegistry {
	private SAT centralregistry;
	
	private void initSAT( XDS xds,  ATNA atna,  XUA xua,  Clinic clinic,  ExtSource extsource,  int fake) {
		centralregistry = new SAT("ProjectCentralRegistry", "0.1", "EXPERIMENTAL", "Provides central registry for document sharing in sample project");
		centralregistry.addRule(new TFRule("*/XDS->SN/ATNA"));
		centralregistry.addRule(new TFRule("*/Clinic->XServiceUser/XUA"));
		centralregistry.addRule(new TFRule("*/Clinic->SN/ATNA"));
		centralregistry.addRule(new TFRule("*/ExtSource->SN/ATNA"));
		centralregistry.addSolutionPattern(xds.getABB());
		centralregistry.addSolutionPattern(atna.getABB());
		centralregistry.addSolutionPattern(xua.getABB());
		centralregistry.addSolutionPattern(clinic.getABB());
		centralregistry.addSolutionPattern(extsource.getABB());
	}
	
	public CentralRegistry(XDS xds, ATNA atna, XUA xua, Clinic clinic, ExtSource extsource,  int fake) {
	    initSAT( xds,  atna,  xua,  clinic,  extsource,  0);
	                    	
	}
	public SAT getSAT() {
	    return this.centralregistry;
	}
}

