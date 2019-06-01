package com.spirit.sample.generated.iti;

import java.util.HashMap;

import com.spirit.ihe.language.bb.ABB;

public class AllABBs {
	// instantiate all the ABBs
	private final EUA eua = new EUA();
	private final PIX pix = new PIX();
	private final PSA psa = new PSA();
	private final CT ct = new CT();
	private final PDQ pdq = new PDQ();
	private final ATNA atna = new ATNA();
	private final XDS xds = new XDS();
	private final PWP pwp = new PWP();
	private final XUA xua = new XUA();
	private final PAM pam = new PAM();
	private final XDR xdr = new XDR();
	private final XDM xdm = new XDM();
	private final RFD rfd = new RFD();
	private final XCA xca = new XCA();
	private final BPPC bppc = new BPPC();
	private final XDSSD xdssd = new XDSSD();
	private final SVS svs = new SVS();
	private final PIXV3 pixv3 = new PIXV3();
	private final PDQV3 pdqv3 = new PDQV3();
	private final MPQ mpq = new MPQ();
	private final DSUB dsub = new DSUB();
	private final XCPD xcpd = new XCPD();
	private final XDW xdw = new XDW();
	private final DSG dsg = new DSG();
	private final HashMap<String, ABB> abbList = new HashMap<>();
	
	// Constructor. Here I instantiate the ABBs
	public AllABBs() {
		
		// Instantiate the SAT
		IHE_ITI_TF_v13 ihe_iti_tf_v13 = new IHE_ITI_TF_v13(eua, pix, psa, ct, pdq, atna, xds, pwp, xua, pam, xdr, xdm, rfd, xca, bppc, xdssd, svs, pixv3, pdqv3, mpq, dsub, xcpd, xdw, dsg,  0);
		
		// Add this SAT as parent SAT
		eua.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(eua.getABB().getName(), eua.getABB());
		pix.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(pix.getABB().getName(), pix.getABB());
		psa.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(psa.getABB().getName(), psa.getABB());
		ct.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(ct.getABB().getName(), ct.getABB());
		pdq.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(pdq.getABB().getName(), pdq.getABB());
		atna.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(atna.getABB().getName(), atna.getABB());
		xds.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(xds.getABB().getName(), xds.getABB());
		pwp.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(pwp.getABB().getName(), pwp.getABB());
		xua.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(xua.getABB().getName(), xua.getABB());
		pam.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(pam.getABB().getName(), pam.getABB());
		xdr.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(xdr.getABB().getName(), xdr.getABB());
		xdm.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(xdm.getABB().getName(), xdm.getABB());
		rfd.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(rfd.getABB().getName(), rfd.getABB());
		xca.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(xca.getABB().getName(), xca.getABB());
		bppc.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(bppc.getABB().getName(), bppc.getABB());
		xdssd.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(xdssd.getABB().getName(), xdssd.getABB());
		svs.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(svs.getABB().getName(), svs.getABB());
		pixv3.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(pixv3.getABB().getName(), pixv3.getABB());
		pdqv3.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(pdqv3.getABB().getName(), pdqv3.getABB());
		mpq.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(mpq.getABB().getName(), mpq.getABB());
		dsub.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(dsub.getABB().getName(), dsub.getABB());
		xcpd.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(xcpd.getABB().getName(), xcpd.getABB());
		xdw.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(xdw.getABB().getName(), xdw.getABB());
		dsg.getABB().addParentSAT(ihe_iti_tf_v13.getSAT());
		abbList.put(dsg.getABB().getName(), dsg.getABB());
	}
	
	public HashMap<String, ABB> getAbbList() {
		return abbList;
	}
	
}
