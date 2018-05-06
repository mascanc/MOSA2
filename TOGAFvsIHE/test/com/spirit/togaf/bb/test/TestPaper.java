package com.spirit.togaf.bb.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.BorderLayout;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

import javax.swing.JFrame;

import org.junit.BeforeClass;
import org.junit.Test;

import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.SAT;
import com.spirit.togaf.bb.dependencies.Actor;
import com.spirit.togaf.bb.dependencies.Domain;
import com.spirit.togaf.bb.dependencies.Group;
import com.spirit.togaf.bb.dependencies.QualityAttribute;
import com.spirit.togaf.bb.dependencies.Requirement;
import com.spirit.togaf.bb.dependencies.Requirement.PRESCRIPTION_LEVEL;
import com.spirit.togaf.bb.dependencies.ResolveDependency;
import com.spirit.togaf.bb.dependencies.TFRule;
import com.spirit.togaf.bb.dependencies.Transaction;
import com.spirit.togaf.bb.graph.TouchgraphPanel;


public class TestPaper {

    private static ABB sr, pi, ds;
    
    @BeforeClass
    public static void init() {
        Requirement pi1 = new Requirement("REQ1", PRESCRIPTION_LEVEL.MAY, "Identify uniquely a patient");

        Actor pic = new Actor("PIC");
        Actor pis = new Actor("PIS");

        Transaction feed = new Transaction(pic, "Feed", pis);
        Transaction discovery = new Transaction(pic, "Discovery", pis);

        Domain information = new Domain() {
            private String name = "Information";

            public String getName() {
                return name;
            }
        };

        TFRule piRule = new TFRule("*/PI->SConn/SR");

        pi = new ABB("PI", "Patient Identification", "Patient Match", "Patient Management");
        pi.addActor(pis);
        pi.addActor(pic);
        pi.addDomain(information);
        pi.addRequirement(pi1);
        pi.addTransaction(feed);
        pi.addTransaction(discovery);

        Requirement ds1 = new Requirement("REQ2", PRESCRIPTION_LEVEL.MUST, "Search a document");

        Actor dsAct = new Actor("DS");
        Actor dc = new Actor("DC");
        Actor dsto = new Actor("DSto");

        Transaction query = new Transaction(dc, "Query", dsto);
        Transaction insert = new Transaction(dsAct, "Insert", dsto);

        Domain semantics = new Domain() {
            private String name = "Semantics";

            public String getName() {
                return name;
            }
        };

        TFRule dsRule = new TFRule("*/DS->SConn/SR");
        ds = new ABB("DS", "Document Sharing", "Shares documents","Document Management");
        ds.addActor(dsAct);
        ds.addActor(dc);
        ds.addActor(dsto);
        ds.addDomain(information);
        ds.addDomain(semantics);
        ds.addRequirement(ds1);
        ds.addTransaction(insert);
        ds.addTransaction(query);
        
        QualityAttribute att1 = new QualityAttribute() {
            
            private String value;
            @Override
            public void addRule(String value) {
                this.value = value;
            }
            @Override
            public String getValue() {
                return this.value;
            }
            
            @Override
            public void evaluate(ABB y, ABB y2) {
                // place implementation here
            }
        };
        Requirement sr1 = new Requirement("REQ3", PRESCRIPTION_LEVEL.MUST, "Security");
        Actor sconn = new Actor("SConn");

        Transaction connect = new Transaction(sconn, "Connect", sconn);
        Domain security = new Domain() {
            private String name = "Security";

            public String getName() {
                return name;
            }
        };

        sr = new ABB("SR", "Security Requirements", "Provides security", "Security");
        sr.addActor(sconn);
        sr.addTransaction(connect);
        sr.addDomain(security);
        sr.addRequirement(sr1);

        SAT eHealthBasic = new SAT("eHealthBasic", "1.0", "Development", "Manages a basic eHealth scenario with one clinic");

        eHealthBasic.addRule(dsRule);
        eHealthBasic.addRule(piRule);
        eHealthBasic.addSolutionPattern(sr);
        eHealthBasic.addSolutionPattern(ds);
        eHealthBasic.addSolutionPattern(pi);
        
        sr.addParentSAT(eHealthBasic);
        pi.addParentSAT(eHealthBasic);
        ds.addParentSAT(eHealthBasic);
        
       

    }

    /**
     * This is the test for the paper scenario, with three profiles.
     */
    @Test
    public void testPaperScenarioOnlyDependency() {
        HashMap<String, ABB> abbList = new HashMap<>();
        abbList.put(sr.getName(), sr);
        abbList.put(ds.getName(), ds);
        abbList.put(pi.getName(), pi);
        
        ResolveDependency res = new ResolveDependency(abbList);
        HashSet<ABB> abbs = res.resolve(pi);
        assertEquals(1, abbs.size());
        assertEquals("SR", abbs.iterator().next().getName());
        
    }
    
    @Test
    public void testPaperScenarioGrouping() {
        HashMap<String, ABB> abbList = new HashMap<>();
        abbList.put(sr.getName(), sr);
        abbList.put(ds.getName(), ds);
        abbList.put(pi.getName(), pi);
        
        Group g = new Group();
        g.setAvailableABBs(abbList);
        ABB groupedABB = g.group(pi,ds);
        assertNotNull(groupedABB);
        System.out.println(groupedABB.dump());
        assertEquals(2,g.getRuleList().size());
        assertEquals(6,groupedABB.getActors().size());
        assertEquals(5,groupedABB.getTransactions().size());
        assertEquals(3,groupedABB.getDomains().size());

        g.getRuleList().stream().forEach(x -> System.out.println(x.getRule()));

        JFrame frame = new JFrame("Graph for ABB " + groupedABB);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TouchgraphPanel<>(g.createGraph(groupedABB,g.getRuleList()), true), BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);        
    }
    
    /*
     * It would be nice to evaluate the following. I have my profile, PI that provides 
     * the service of feed and discovery, and DS having query and insert. But here I 
     * just provide an architecture for a client approach, thus I just need the
     * query and discovery. 
     */
    
    /**
     * In this test, I extend the paper with an additional content profile
     */
    @Test
    public void testFourDependenciesOnlyDependency() {
        Requirement bppc1 = new Requirement("REQ4", PRESCRIPTION_LEVEL.MUST, "BPPC");
        Actor ccons = new Actor("CCons");
        Actor ccrea = new Actor("CCrea");

        Transaction provide = new Transaction(ccrea, "ProvideBPPC", ccons);
        Domain semantics = new Domain() {
            private String name = "Semantics";

            public String getName() {
                return name;
            }
        };

        ABB bppc = new ABB("BPPC", "Patient Consent Management", "Provides basic privacy patient consent", "Consent");
        bppc.addActor(ccons);
        bppc.addActor(ccrea);
        
        bppc.addTransaction(provide);
        bppc.addDomain(semantics);
        bppc.addRequirement(bppc1);
        
        SAT eHealthBasic = new SAT("eHealthBasic", "1.0", "Development", "Manages a basic eHealth scenario with one clinic");

        
        TFRule dsRule = new TFRule("*/DS->SConn/SR");
        TFRule piRule = new TFRule("*/PI->SConn/SR");
        TFRule bppcRule1 = new TFRule("CCrea/BPPC->DS/DS");
        TFRule bppcRule2 = new TFRule("CCons/BPPC->DC/DS");

        eHealthBasic.addRule(dsRule);
        eHealthBasic.addRule(piRule);
        eHealthBasic.addRule(bppcRule1);
        eHealthBasic.addRule(bppcRule2);

        eHealthBasic.addSolutionPattern(sr);
        eHealthBasic.addSolutionPattern(ds);
        eHealthBasic.addSolutionPattern(pi);
        
        sr.addParentSAT(eHealthBasic);
        pi.addParentSAT(eHealthBasic);
        ds.addParentSAT(eHealthBasic);
        bppc.addParentSAT(eHealthBasic);
        
        HashMap<String, ABB> abbList = new HashMap<>();
        abbList.put(sr.getName(), sr);
        abbList.put(ds.getName(), ds);
        abbList.put(pi.getName(), pi);
        abbList.put(bppc.getName(), bppc);

        
        ResolveDependency res = new ResolveDependency(abbList);
        HashSet<ABB> abbs = res.resolve(pi);
        assertEquals(1, abbs.size());
        assertEquals("SR", abbs.iterator().next().getName());
        
        ResolveDependency res1 = new ResolveDependency(abbList);
        HashSet<ABB> abbs1 = res1.resolve(bppc);
        assertEquals(2, abbs1.size());
        Long a = abbs1.stream().filter(x -> x.getName().equals("SR")).collect(Collectors.counting());
        Long b = abbs1.stream().filter(x -> x.getName().equals("DS")).collect(Collectors.counting());
        assertEquals(2, a+b);
  
    }

}
