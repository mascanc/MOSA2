package com.spirit.sample.generated.centralregistry;
import com.spirit.ihe.language.bb.SAT;
import com.spirit.ihe.language.bb.dependencies.TFRule;

public class CentralRegistry {
	private SAT centralregistry;
	
	private void initSAT( XDS xds,  ATNA atna,  XUA xua,  Portal portal,  ExtSource extsource,  int fake) {
		centralregistry = new SAT("ProjectCentralRegistry", "0.1", "EXPERIMENTAL", "Provides central registry for document sharing in sample project");
		centralregistry.addRule(new TFRule("*/XDS->SN/ATNA"));
		centralregistry.addRule(new TFRule("*/Portal->XServiceUser/XUA"));
		centralregistry.addRule(new TFRule("*/Portal->SN/ATNA"));
		centralregistry.addRule(new TFRule("*/ExtSource->SN/ATNA"));
		centralregistry.addSolutionPattern(xds.getABB());
		centralregistry.addSolutionPattern(atna.getABB());
		centralregistry.addSolutionPattern(xua.getABB());
		centralregistry.addSolutionPattern(portal.getABB());
		centralregistry.addSolutionPattern(extsource.getABB());
	}
	
	public CentralRegistry(XDS xds, ATNA atna, XUA xua, Portal portal, ExtSource extsource,  int fake) {
	    initSAT( xds,  atna,  xua,  portal,  extsource,  0);
	                    	
	}
	public SAT getSAT() {
	    return this.centralregistry;
	}
}

