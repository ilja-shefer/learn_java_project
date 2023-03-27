
package com.mycompany.lesson2;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class deleteDoubleItemsTest {

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    /**
     * Test of deleteDouble method, of class deleteDoubleItems.
     */
    @Test
    public void testDeleteDouble() {
        System.out.println("deleteDouble");
        String[] args = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = deleteDoubleItems.deleteDouble(args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class deleteDoubleItems.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        deleteDoubleItems.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
