
package com.mycompany.lesson2;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class DeleteDoubleItemsTest {

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
        
        String[] array = {"hello", "hello", "big", "big","hello", "sell", "sell"};
        ArrayList <String> expectedArray = new ArrayList <>();
        expectedArray.add("hello");
        expectedArray.add("big");
        expectedArray.add("sell");
        ArrayList <String> resultArray = DeleteDoubleItems.deleteDouble(array);
        for(String s : resultArray) {
            System.out.println(s);
        }
        assertEquals(expectedArray.toString(), resultArray.toString());
        //Test cases: empty array, with some strings without duplicates, null, null like item from array
        
    }
    
}
