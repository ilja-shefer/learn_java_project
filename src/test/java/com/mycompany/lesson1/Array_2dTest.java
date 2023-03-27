
package com.mycompany.lesson1;

import static org.junit.jupiter.api.Assertions.*;

public class Array_2dTest {
    
    public Array_2dTest() {
    }

    // TODO: MP: you have imports, don't specify full names here
    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of lineArrayFrom2d method, of class Array_2d.
     */
    /* old code
    @org.junit.jupiter.api.Test
    public void testLineArrayFrom2d() {
        String[] arr1 = {"data", "day", "month"};
        String[] arr2 = {"one", "two", "three"};
        String[] arr3 = {"bear", "rabbit", "litle", "big"};
        String[][] complexArr = {arr1, arr2, arr3};
        
        String[] oneFromThree = lineArrayFrom2d(complexArr);
        
        for(int i = 0; i < oneFromThree.length; i++) {
            for(String s1 : args) {
                if(s1.equals(oneFromThree[i])){
                    oneFromThree[i] = null;
                }
            }
        }
        
        for(String s1 : oneFromThree) {
            System.out.print(s1 + " ");
        }
    }
   */

    /**
     * Test of main method, of class Array_2d.
     */
    @org.junit.jupiter.api.Test
    public void testIsFound() {
        System.out.println("testIsFound");

        
        System.out.println("test 1");
        String[] args = { "111" };
        boolean result = Array_2d.isFound(args);
        assertFalse(result, "test 1 failed");

        System.out.println("test 2");
        args = new String[] { "bear" };
        result = Array_2d.isFound(args);
        assertTrue(result, "test 2 failed");

        System.out.println("test 3");
        args = new String[] { "111", "bear" } ;
        result = Array_2d.isFound(args);
        assertTrue(result, "test 3 failed");
        
       

    }
    
}
