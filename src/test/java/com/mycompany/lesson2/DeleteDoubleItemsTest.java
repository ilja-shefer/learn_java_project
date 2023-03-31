
package com.mycompany.lesson2;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

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
     * this is a helper method providing the caller method with its name
     * @return the name of the calling method
     */
    public static String getMethodName() {
        String methodName = new Exception().getStackTrace()[1].getMethodName();
        return methodName;
    }
    
    
    /**
     * Test of deleteDouble method, of class DeleteDoubleItems.
     */
    @Test
    public void testDeleteDouble() {
    	ArrayList<String> expectedOutput, actualOutput;
    	String[] input;
    	int testNumber = 1;
    	
        // Test case 1: primary test case
        input = new String[]                          {"cat", "dog", "cat", "fish", "cat", "dog", "bird" };
        expectedOutput = new ArrayList<>(Arrays.asList("cat", "dog", "fish", "bird"));
        actualOutput = DeleteDoubleItems.deleteDouble(input);
        assertEquals(expectedOutput, actualOutput);
        System.out.printf("%s::%s: Test %d ok \n", this.getClass().getName(), getMethodName(), testNumber++);

        // Test case 2: primary test case - no repeats
        input = new String[]                          {"cat", "dog", "", "fish" };
        expectedOutput = new ArrayList<>(Arrays.asList("cat", "dog", "", "fish"));
        actualOutput = DeleteDoubleItems.deleteDouble(input);
        assertEquals(expectedOutput, actualOutput);
        System.out.printf("%s::%s: Test %d ok \n", this.getClass().getName(), getMethodName(), testNumber++);

        // Test case 3: empty input array
        input = new String[0];
        expectedOutput = new ArrayList<>();
        actualOutput = DeleteDoubleItems.deleteDouble(input);
        assertEquals(expectedOutput, actualOutput);
        System.out.printf("%s::%s: Test %d ok \n", this.getClass().getName(), getMethodName(), testNumber++);

        // Test case 4: input array containing nulls
        // We expect the deleteDouble function to throw a NullPointerException when given an input array containing nulls.
        // If the deleteDouble function throws a NullPointerException, the test passes; if it does not throw an exception, the test fails.
        // In the real world I wouldn't create this test case - I know that the method is not expected to handle nulls
        final String[] input1 = new String[] { "cat", null, "dog" };
        assertThrows(NullPointerException.class, () -> { DeleteDoubleItems.deleteDouble(input1); }   );
        System.out.printf("%s::%s: Test %d ok \n", this.getClass().getName(), getMethodName(), testNumber++);
    }

    
    //   original test method
    //@Test
    public void testDeleteDouble_Original() {
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
