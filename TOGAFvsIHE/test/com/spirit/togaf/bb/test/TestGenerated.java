package com.spirit.togaf.bb.test;

import static org.junit.Assert.*;

import java.awt.BorderLayout;
import java.util.HashMap;

import javax.swing.JFrame;

import org.junit.Test;

import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.Group;
import com.spirit.togaf.bb.graph.TouchgraphPanel;


public class TestGenerated {

    @Test
    public void testGroupGeneratedFiles() {
        // In this test I'll do the paper grouping only with generated classes
        AllABBs allAbb = new AllABBs();
        HashMap<String, ABB> abbList = allAbb.getAbbList();
        Group g = new Group();
        g.setAvailableABBs(abbList);
        ABB groupedABB = g.group(abbList.get("PI"), abbList.get("DS"));
        assertNotNull(groupedABB);
        System.out.println(groupedABB.dump());
        assertEquals(2, g.getRuleList().size());
        assertEquals(6, groupedABB.getActors().size());
        assertEquals(5, groupedABB.getTransactions().size());
        assertEquals(3, groupedABB.getDomains().size());

        g.getRuleList().stream().forEach(x -> System.out.println(x.getRule()));

        JFrame frame = new JFrame("Graph for ABB " + groupedABB);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TouchgraphPanel<>(g.createGraph(groupedABB, g.getRuleList()), true), BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

}
