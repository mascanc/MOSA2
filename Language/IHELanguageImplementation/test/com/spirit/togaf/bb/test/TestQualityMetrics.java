package com.spirit.togaf.bb.test;

import java.util.HashMap;

import org.junit.BeforeClass;
import org.junit.Test;

import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.SAT;
import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Domain;
import com.spirit.ihe.language.bb.dependencies.Group;
import com.spirit.ihe.language.bb.dependencies.Requirement;
import com.spirit.ihe.language.bb.dependencies.TFRule;
import com.spirit.ihe.language.bb.dependencies.Transaction;
import com.spirit.ihe.language.bb.dependencies.Requirement.PRESCRIPTION_LEVEL;
import com.spirit.ihe.language.bb.metrics.Availability;


public class TestQualityMetrics {
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
        
        Availability a = new Availability();
        a.setProbability(Double.valueOf(1e-3));
        a.addRule("PI/SR->AND/Failure, the PI is not secure");
        
        pi.addQualityAttribute(a);
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
        ds = new ABB("DS", "Document Sharing", "Shares documents", "Document Management");
        ds.addActor(dsAct);
        ds.addActor(dc);
        ds.addActor(dsto);
        ds.addDomain(information);
        ds.addDomain(semantics);
        ds.addRequirement(ds1);
        ds.addTransaction(insert);
        ds.addTransaction(query);
        
        Availability ads = new Availability();
        ads.setProbability(Double.valueOf(1e-3));
        ads.addRule("DS/PI->AND/Failure, can't query a document without patient identification");
        ads.addRule("DS/SR->AND/Failure, the DS is not secure");

        ds.addQualityAttribute(ads);
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

    @Test
    public void testAvailabilityCreateFaultTree() {
        HashMap<String, ABB> abbList = new HashMap<>();
        abbList.put(sr.getName(), sr);
        abbList.put(ds.getName(), ds);
        abbList.put(pi.getName(), pi);
        
        Group g = new Group();
        g.setAvailableABBs(abbList);
        ABB back = g.group(pi, ds);
        System.out.println(back.dump());
        
    }

}
