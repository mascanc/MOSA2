package com.spirit.togaf.bb.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.BorderLayout;
import java.util.HashMap;
import java.util.HashSet;

import javax.swing.JFrame;

import org.junit.BeforeClass;
import org.junit.Test;

import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.SAT;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.Group;
import com.spirit.ihe.language.bb.dependencies.Requirement;
import com.spirit.ihe.language.bb.dependencies.Requirement.PRESCRIPTION_LEVEL;
import com.spirit.ihe.language.bb.dependencies.ResolveDependency;
import com.spirit.ihe.language.bb.dependencies.TFRule;
import com.spirit.ihe.language.bb.dependencies.Transaction;
import com.spirit.ihe.language.bb.graph.TouchgraphPanel;

/**
 * This is a test for the paper submitted for Smart Grid Communication 2018. 
 * It groups the profiles defined by the IES project (iesaustria.at), and the 
 * newly created crosscutting concern on security, ENA. 
 */
public class TestPaperSG2018 {

    private static ABB fsch, mmxu, ena;
    
    @BeforeClass
    public static void init() {
        Requirement fsch11 = new Requirement("REQ1", PRESCRIPTION_LEVEL.MAY, "Provide the Functional Schedule to the DEU");

        Actor fschi = new Actor("FSCHI");
        Actor fschr = new Actor("FSCHR");

        Transaction provideFsch = new Transaction(fschi, "VPP_1_ProvideFSCH", fschr);
        Transaction readCurrentFsch = new Transaction(fschi, "VPP_2_ReadCurrentFSCH", fschr);
        Transaction vldReq = new Transaction(fschi, "VPP_3_ValidateRequest", fschr);
        Transaction enaReq = new Transaction(fschi, "VPP_4_EnableRequest", fschr);
        Transaction disReq = new Transaction(fschi, "VPP_5_DisableRequest", fschr);

        
        Domain information = new Domain() {
            private String name = "Information";

            public String getName() {
                return name;
            }
        };

        TFRule fschRule1 = new TFRule("*/FSCH->SN/ENA");
        TFRule fschRule2 = new TFRule("*/FSCH->*/MMS");

        fsch = new ABB("FSCH", "Functional Schedule", "Provide Functional Schedule", "VPPOP");
        fsch.addActor(fschi);
        fsch.addActor(fschr);
        fsch.addDomain(information);
        fsch.addRequirement(fsch11);
        fsch.addTransaction(provideFsch);
        fsch.addTransaction(readCurrentFsch);
        fsch.addTransaction(vldReq);
        fsch.addTransaction(enaReq);
        fsch.addTransaction(disReq);

        Requirement mmxu1 = new Requirement("REQ2", PRESCRIPTION_LEVEL.MUST, "Provide current DEU measurements to the VPPOP");

        Actor mmxuc = new Actor("MMXUC");
        Actor mmxup = new Actor("MMXUP");
       
        Transaction provideMmxu = new Transaction(mmxup, "VPP_6_ProvideMMXU",mmxuc);

        Domain semantics = new Domain() {
            private String name = "Information";

            public String getName() {
                return name;
            }
        };

        TFRule mmxuRule1 = new TFRule("*/MMXU->*/MMS");
        TFRule mmxuRule2 = new TFRule("*/MMXU->SN/ENA");

        mmxu = new ABB("MMXU", "Provide Measurement", "Measurements","Measure Management");
        mmxu.addActor(mmxuc);
        mmxu.addActor(mmxup);
        mmxu.addDomain(information);
        mmxu.addDomain(semantics);
        mmxu.addRequirement(mmxu1);
        mmxu.addTransaction(provideMmxu);
        
       
        
        
        Requirement ena1 = new Requirement("REQ3", PRESCRIPTION_LEVEL.MUST, "Security");
        Actor sn = new Actor("SN");
        Actor evSto = new Actor("ES");
        
        Transaction connect = new Transaction(sn, "VPP_7_Connect(GOOSE)", sn);
        Transaction connectMms = new Transaction(sn, "VPP_8_Connect(MMS)", sn);

        Transaction provideEvidence = new Transaction(sn, "VPP_9_ProvideEvidence", evSto);

        Domain security = new Domain() {
            private String name = "Security";

            public String getName() {
                return name;
            }
        };

        ena = new ABB("ENA", "Security Requirements", "Provides Secure Access and Channel Authentication", "Security");
        ena.addActor(sn);
        ena.addActor(evSto);

        ena.addTransaction(connect);
        ena.addTransaction(connectMms);

        ena.addTransaction(provideEvidence);

        ena.addDomain(security);
        ena.addRequirement(ena1);

        SAT vppBasic = new SAT("vppBasic", "1.0", "Development", "Manages a basic VPP Scenario");

        vppBasic.addRule(fschRule1);
        vppBasic.addRule(fschRule2);
        vppBasic.addRule(mmxuRule1);
        vppBasic.addRule(mmxuRule2);

        vppBasic.addSolutionPattern(fsch);
        vppBasic.addSolutionPattern(mmxu);
        vppBasic.addSolutionPattern(ena);
        
        fsch.addParentSAT(vppBasic);
        mmxu.addParentSAT(vppBasic);
        ena.addParentSAT(vppBasic);
        
       

    }

    /**
     * This is the test for the paper scenario, with three profiles.
     */
    @Test
    public void testPaperScenarioOnlyDependency() {
        HashMap<String, ABB> abbList = new HashMap<>();
        abbList.put(ena.getName(), ena);
        abbList.put(mmxu.getName(), mmxu);
        abbList.put(fsch.getName(), fsch);
        
        ResolveDependency res = new ResolveDependency(abbList);
        HashSet<ABB> abbs = res.resolve(fsch);
        assertEquals(1, abbs.size());
        assertEquals("ENA", abbs.iterator().next().getName());
        
    }
    
    @Test
    public void testPaperScenarioGrouping() {
        HashMap<String, ABB> abbList = new HashMap<>();
        abbList.put(ena.getName(), ena);
        abbList.put(mmxu.getName(), mmxu);
        abbList.put(fsch.getName(), fsch);
        
        Group g = new Group();
        g.setAvailableABBs(abbList);
        ABB groupedABB = g.group(mmxu,fsch);
        assertNotNull(groupedABB);
        System.out.println(groupedABB.dump());
        assertEquals(4,g.getRuleList().size());
        assertEquals(6,groupedABB.getActors().size());
        assertEquals(9,groupedABB.getTransactions().size());
        assertEquals(3,groupedABB.getDomains().size());

        g.getRuleList().stream().forEach(x -> System.out.println(x.getRule()));

        JFrame frame = new JFrame("Graph for ABB " + groupedABB);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TouchgraphPanel<>(g.createGraph(groupedABB,g.getRuleList()), true), BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);        
    }
    

    
    /**
     * In this test, I add the inverse rule
     */
    @Test
    public void testWithInverseRule() {
        HashMap<String, ABB> abbList = new HashMap<>();
        abbList.put(ena.getName(), ena);
        abbList.put(mmxu.getName(), mmxu);
        abbList.put(fsch.getName(), fsch);
        
        ena.getParentSAT().get(0).addRule(new TFRule("<<-/MMS"));

        Group g = new Group();
        g.setAvailableABBs(abbList);
        ABB groupedABB = g.group(mmxu,fsch);
        assertNotNull(groupedABB);
        System.out.println(groupedABB.dump());
        assertEquals(5,g.getRuleList().size());
        assertEquals(6,groupedABB.getActors().size());
        assertEquals(8,groupedABB.getTransactions().size());
        assertEquals(3,groupedABB.getDomains().size());
  
    }

}
