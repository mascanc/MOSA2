package com.spirit.togaf.bb.test;
import static org.junit.Assert.assertNotNull;

import java.awt.BorderLayout;
import java.io.IOException;
import java.util.HashMap;

import javax.swing.JFrame;

import org.junit.Test;

import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Group;
import com.spirit.ihe.language.bb.graph.TouchgraphPanel;
import com.spirit.sample.generated.iti.AllABBs;


/**
 * Generate the full <a href="http://www.ihe.net">ITI Technical Framework</a> dependency and 
 * groups PIX, XDS, PDQ, and XDM. 
 * 
 * For a full account on how to use the library, see for example {@link TestCentralRegistry}.
 * @author max
 */
public class TestITI {

    @Test
    public void testGroupGeneratedFiles() throws IOException {

        AllABBs allAbb = new AllABBs();
        HashMap<String, ABB> abbList = allAbb.getAbbList();
        Group g = new Group();
        g.setAvailableABBs(abbList);
        ABB groupedABB = g.group(abbList.get("PIX"), abbList.get("XDS"),abbList.get("PDQ"),abbList.get("XDM"));
        assertNotNull(groupedABB);
       
        JFrame frame = new JFrame("Graph for ABB " + groupedABB);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TouchgraphPanel<>(g.createGraph(groupedABB, g.getRuleList()), true), BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        System.in.read();
    }
}
