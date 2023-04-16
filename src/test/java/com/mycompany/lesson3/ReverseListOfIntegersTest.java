package com.mycompany.lesson3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ReverseListOfIntegersTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	/**
     * this is a helper method providing the caller method with its fully qualified
     * name (using format "packageName.className.methodName")
     * @return a fully qualified name of the calling method
     */
    public String getFullMethodName() {
        String unqualifiedMethodName = new Exception().getStackTrace()[1].getMethodName();
        String className = this.getClass().getName();
        return className + "." + unqualifiedMethodName;
    }
    
    
    /**
     * Test of reverseList method, of class ReverseListOfIntegers.
     */

	@Test
	void testReverseList() {
		ArrayList<Integer> expectedOutput;
		List<Integer> actualOutput;
		ArrayList<Integer> input;
		int testNumber = 1;
		
		//Test case 1: primary test case
		input = new ArrayList<>(Arrays.asList(1, 5, 10, 22, 46, 7, 9, 11, 3));
		expectedOutput = new ArrayList<>(Arrays.asList(3, 11, 9, 7, 46, 22, 10, 5, 1));
		actualOutput = ReverseListOfIntegers.reverseList(input);
		assertEquals(expectedOutput, actualOutput);
		System.out.printf("%s: Test %d ok \n", getFullMethodName(), testNumber++);
	}

}
