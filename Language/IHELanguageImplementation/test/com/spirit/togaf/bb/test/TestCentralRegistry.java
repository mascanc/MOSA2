package com.spirit.togaf.bb.test;

import static org.junit.Assert.assertNotNull;

import java.awt.BorderLayout;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JFrame;

import org.junit.Test;

import com.spirit.ihe.language.bb.ABB;
import com.spirit.ihe.language.bb.dependencies.Group;
import com.spirit.ihe.language.bb.graph.TouchgraphPanel;
import com.spirit.sample.generated.centralregistry.AllABBs;

import dnl.utils.text.table.TextTable;


/**
 * Entry point to use the IHE library. This is the use case of the central registry.
 * This is also a generic pattern on how to use the language. It works as follows.
 * <ol>
 * <li>Once created the .IHE file in the editor, it generates some classes (see as example {@link AllABBs}).</li>
 * <li>Those classes are divided as follows: AllABBs contains the hashmap of the available ABBs</li>
 * <li>Call the {@link Group} class to start the evaluation of the semantics</li>
 * <li>After calling the {@link Group#group(ABB...)}, it returns the evaluated ABB, representing the <b>solution architecture</b></li>
 * <li>The new ABB is ready to be used</li>
 * </ol>
 * @author max
 */
public class TestCentralRegistry {

    @Test
    public void testGroupGeneratedFiles() throws IOException {

        /*
         * Get the list of available ABBs
         */
        com.spirit.sample.generated.centralregistry.AllABBs allAbb = 
                new com.spirit.sample.generated.centralregistry.AllABBs();
        HashMap<String, ABB> abbList = allAbb.getAbbList();
        
        /*
         * Group them (e.g., implement the IHE methodology)
         */
        Group g = new Group();
        g.setAvailableABBs(abbList);
        ABB groupedABB = g.group(abbList.get("CLINIC"), abbList.get("XDS"), abbList.get("EXTSOURCE"));
        assertNotNull(groupedABB);

        /*
         * First sample: here I show a frame as architecture based on the TF rules
         */
        JFrame frame = new JFrame("Graph for ABB " + groupedABB);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TouchgraphPanel<>(g.createGraph(groupedABB, g.getRuleList()), true), BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        System.out.println("Hit ENTER");
        System.in.read();
        
        /*
         * Show the Generated security requirements
         */
        String[] columnNames = {"ID", "Form", "Sensitivity", "Location", "State", "Goal", "Countermeasure", "Category"};
        Object[][] data = new Object[groupedABB.getSecurityRequirements().size() + 1][8];

        AtomicInteger counter = new AtomicInteger(0);
        groupedABB.getSecurityRequirements().stream().forEach(x -> {
            int i = counter.getAndIncrement();
            data[i] = new Object[] {x.getName(),x.getForm(), x.getSensitivity(), x.getLocation(), x.getState(), x.getGoal(), x.getCountermeasure(), x.getCategory()};

        });
        TextTable tt = new TextTable(columnNames, data);
        tt.setAddRowNumbering(true);
        tt.printTable();


    }
}
