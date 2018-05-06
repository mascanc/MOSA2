package com.spirit.togaf.bb.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.BorderLayout;
import java.util.HashMap;

import javax.swing.JFrame;

import org.junit.Test;

import com.spirit.ihe.iti.AllABBs;
import com.spirit.togaf.bb.ABB;
import com.spirit.togaf.bb.dependencies.Group;
import com.spirit.togaf.bb.graph.TouchgraphPanel;



public class TestITI {

    @Test
    public void testGroupGeneratedFiles() {
        // In this test I'll do the paper grouping only with generated classes
        AllABBs allAbb = new AllABBs();
        HashMap<String, ABB> abbList = allAbb.getAbbList();
        Group g = new Group();
        g.setAvailableABBs(abbList);
        ABB groupedABB = g.group(abbList.get("PIX"), abbList.get("XDS"),abbList.get("PDQ"),abbList.get("XDM"));//,abbList.get("XDR"));
        assertNotNull(groupedABB);
       
        JFrame frame = new JFrame("Graph for ABB " + groupedABB);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TouchgraphPanel<>(g.createGraph(groupedABB, g.getRuleList()), true), BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
