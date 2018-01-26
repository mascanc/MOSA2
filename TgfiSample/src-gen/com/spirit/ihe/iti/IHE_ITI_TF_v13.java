package com.spirit.ihe.iti;
import com.spirit.togaf.bb.SAT;
import com.spirit.togaf.bb.dependencies.TFRule;

public class IHE_ITI_TF_v13 {
	private SAT ihe_iti_tf_v13;
	
	private void initSAT( EUA eua,  PIX pix,  PSA psa,  CT ct,  PDQ pdq,  ATNA atna,  XDS xds,  PWP pwp,  XUA xua,  PAM pam,  XDR xdr,  XDM xdm,  RFD rfd,  XCA xca,  BPPC bppc,  XDSSD xdssd,  SVS svs,  PIXV3 pixv3,  PDQV3 pdqv3,  MPQ mpq,  DSUB dsub,  XCPD xcpd,  XDW xdw,  DSG dsg,  int fake) {
		ihe_iti_tf_v13 = new SAT("IHE ITI Technical Framework", "13", "Released", "IHE ITI actor library");
		ihe_iti_tf_v13.addRule(new TFRule("*/PIX->SecureNode/ATNA"));
		ihe_iti_tf_v13.addRule(new TFRule("*/PSA->SecureNode/ATNA"));
		ihe_iti_tf_v13.addRule(new TFRule("*/PDQ->SecureNode/ATNA"));
		ihe_iti_tf_v13.addRule(new TFRule("*/XDS->SecureNode/ATNA"));
		ihe_iti_tf_v13.addRule(new TFRule("*/XUA->SecureNode/ATNA"));
		ihe_iti_tf_v13.addRule(new TFRule("*/XDR->SecureNode/ATNA"));
		ihe_iti_tf_v13.addRule(new TFRule("*/RFD->SecureNode/ATNA"));
		ihe_iti_tf_v13.addRule(new TFRule("*/XCA->SecureNode/ATNA"));
		ihe_iti_tf_v13.addRule(new TFRule("*/PIXV3->SecureNode/ATNA"));
		ihe_iti_tf_v13.addRule(new TFRule("*/PDQV3->SecureNode/ATNA"));
		ihe_iti_tf_v13.addRule(new TFRule("*/MPQ->SecureNode/ATNA"));
		ihe_iti_tf_v13.addRule(new TFRule("*/DSUB->SecureNode/ATNA"));
		ihe_iti_tf_v13.addRule(new TFRule("*/XCPD->SecureNode/ATNA"));
		ihe_iti_tf_v13.addRule(new TFRule("*/XDW->SecureNode/ATNA"));
		ihe_iti_tf_v13.addRule(new TFRule("*/XDM->SecureNode/ATNA"));
		ihe_iti_tf_v13.addRule(new TFRule("*/EUA->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/PIX->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/PSA->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/PDQ->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/PWP->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/XDS->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/XUA->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/PAM->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/XDR->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/XDM->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/RFD->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/XCA->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/BPPC->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/XDSSD->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/SVS->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/PIXV3->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/PDQV3->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/MPQ->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/DSUB->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/XCPD->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("*/XDW->TimeClient/CT"));
		ihe_iti_tf_v13.addRule(new TFRule("ContentCreator/BPPC->DocumentSource/XDS"));
		ihe_iti_tf_v13.addRule(new TFRule("ContentCreator/BPPC->PortableMediaCreator/XDM"));
		ihe_iti_tf_v13.addRule(new TFRule("ContentCreator/BPPC->DocumentSource/XDR"));
		ihe_iti_tf_v13.addRule(new TFRule("ContentConsumer/BPPC->DocumentConsumer/XDS"));
		ihe_iti_tf_v13.addRule(new TFRule("ContentConsumer/BPPC->PortableMediaImporter/XDM"));
		ihe_iti_tf_v13.addRule(new TFRule("ContentConsumer/BPPC->DocumentRecipient/XDR"));
		ihe_iti_tf_v13.addRule(new TFRule("ContentConsumer/BPPC->ContentConsumer/XDSSD"));
		ihe_iti_tf_v13.addRule(new TFRule("ContentCreator/XDSSD->DocumentSource/XDS"));
		ihe_iti_tf_v13.addRule(new TFRule("ContentCreator/XDSSD->PortableMediaCreator/XDM"));
		ihe_iti_tf_v13.addRule(new TFRule("ContentCreator/XDSSD->DocumentSource/XDR"));
		ihe_iti_tf_v13.addRule(new TFRule("ContentConsumer/XDSSD->DocumentConsumer/XDS"));
		ihe_iti_tf_v13.addRule(new TFRule("ContentConsumer/XDSSD->PortableMediaImporter/XDM"));
		ihe_iti_tf_v13.addRule(new TFRule("ContentConsumer/XDSSD->DocumentRecipient/XDR"));
		ihe_iti_tf_v13.addSolutionPattern(eua.getABB());
		ihe_iti_tf_v13.addSolutionPattern(pix.getABB());
		ihe_iti_tf_v13.addSolutionPattern(psa.getABB());
		ihe_iti_tf_v13.addSolutionPattern(ct.getABB());
		ihe_iti_tf_v13.addSolutionPattern(pdq.getABB());
		ihe_iti_tf_v13.addSolutionPattern(atna.getABB());
		ihe_iti_tf_v13.addSolutionPattern(xds.getABB());
		ihe_iti_tf_v13.addSolutionPattern(pwp.getABB());
		ihe_iti_tf_v13.addSolutionPattern(xua.getABB());
		ihe_iti_tf_v13.addSolutionPattern(pam.getABB());
		ihe_iti_tf_v13.addSolutionPattern(xdr.getABB());
		ihe_iti_tf_v13.addSolutionPattern(xdm.getABB());
		ihe_iti_tf_v13.addSolutionPattern(rfd.getABB());
		ihe_iti_tf_v13.addSolutionPattern(xca.getABB());
		ihe_iti_tf_v13.addSolutionPattern(bppc.getABB());
		ihe_iti_tf_v13.addSolutionPattern(xdssd.getABB());
		ihe_iti_tf_v13.addSolutionPattern(svs.getABB());
		ihe_iti_tf_v13.addSolutionPattern(pixv3.getABB());
		ihe_iti_tf_v13.addSolutionPattern(pdqv3.getABB());
		ihe_iti_tf_v13.addSolutionPattern(mpq.getABB());
		ihe_iti_tf_v13.addSolutionPattern(dsub.getABB());
		ihe_iti_tf_v13.addSolutionPattern(xcpd.getABB());
		ihe_iti_tf_v13.addSolutionPattern(xdw.getABB());
		ihe_iti_tf_v13.addSolutionPattern(dsg.getABB());
	}
	
	public IHE_ITI_TF_v13(EUA eua, PIX pix, PSA psa, CT ct, PDQ pdq, ATNA atna, XDS xds, PWP pwp, XUA xua, PAM pam, XDR xdr, XDM xdm, RFD rfd, XCA xca, BPPC bppc, XDSSD xdssd, SVS svs, PIXV3 pixv3, PDQV3 pdqv3, MPQ mpq, DSUB dsub, XCPD xcpd, XDW xdw, DSG dsg,  int fake) {
	    initSAT( eua,  pix,  psa,  ct,  pdq,  atna,  xds,  pwp,  xua,  pam,  xdr,  xdm,  rfd,  xca,  bppc,  xdssd,  svs,  pixv3,  pdqv3,  mpq,  dsub,  xcpd,  xdw,  dsg,  0);
	                    	
	}
	public SAT getSAT() {
	    return this.ihe_iti_tf_v13;
	}
}

