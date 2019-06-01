package com.spirit.togaf.bb.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.spirit.ihe.language.bb.dependencies.Actor;
import com.spirit.ihe.language.bb.dependencies.Transaction;

public class TestTransaction {

    @Test
    public void test() {
        Actor a1 = new Actor("A1");
        Actor a2 = new Actor("A2");

        Transaction t1 = new Transaction(a1, "t1", a2);
        Transaction t2 = new Transaction(a1, "t2(b)", a2);
        Transaction t3 = new Transaction(a1, "t(bassi)", a2);

        assertEquals("t1", t1.getName());
        assertEquals("t2(b)", t2.getName());
        assertEquals("A1", t1.getActorFrom().getName());
        assertEquals("A2", t1.getActorTo().getName());
        assertNull(t1.getAssociatedProfile());
        assertEquals("b", t2.getAssociatedProfile());
        assertEquals("bassi", t3.getAssociatedProfile());


    }

}
