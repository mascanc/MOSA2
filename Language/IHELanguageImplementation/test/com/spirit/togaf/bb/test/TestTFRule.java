package com.spirit.togaf.bb.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.TFRule;
import com.spirit.ihe.language.bb.dependencies.Transaction;

public class TestTFRule {

  
    @Test
    public void testExampleXDSATNA() throws SecurityException, IOException {
        String tfRule = "*/XDS->SN/ATNA";
        TFRule tf = new TFRule(tfRule);
        
        Actor xds_doc_cons = new Actor("DocCons");
        ABB xds = new ABB("XDS", null, null, null);
        
        String value = tf.match(xds_doc_cons, xds);
        System.out.println(value);

        assertNotNull(value);
        assertEquals("ATNA", value);
    }

    @Test
    public void testExampleSRSconn() {
        String tfRule = "*/DS->SConn/SR";
        TFRule tf = new TFRule(tfRule);
        
        Actor xds_doc_cons = new Actor("SConn");
        ABB xds = new ABB("SR", null, null, null);
        
        String value = tf.match(xds_doc_cons, xds);
        System.out.println(value);
        assertNull(value);
    }
    
    @Test
    public void testExampleInverseRule() {
        String tfRule = "<<-/MMS";
        TFRule tf = new TFRule(tfRule);
        
        Actor sn = new Actor("SecureNode");
        ABB ena = new ABB("ENA", null, null, null);
        Transaction evidence_over_mms = new Transaction(sn, "VPPOP_8_ProvideEvidence(MMS)", sn);
        Transaction evidence_over_goose = new Transaction(sn, "VPPOP_8_ProvideEvidence(GOOSE)", sn);
        
        ena.addTransaction(evidence_over_goose);
        ena.addTransaction(evidence_over_mms);
        String value = tf.match(sn, ena);
        System.out.println(value);

        assertEquals(1, ena.getTransactions().size());
        assertTrue(ena.getTransactions().get(0).equals(evidence_over_mms));
        

    }
}
