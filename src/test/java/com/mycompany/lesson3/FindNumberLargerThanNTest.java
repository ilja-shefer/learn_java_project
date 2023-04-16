package com.mycompany.lesson3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class FindNumberLargerThanNTest {

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
     * Test of findNumber method, of class FindNumberLargerThanN.
     */

	@Test
	void testFindNumber() {
		int expectedOutput, actualOutput;
		int[] input;
		int n;
		int testNumber = 1;
		
		//Test case 1: primary test case
		input = new int[] {1, 5, 10, 22, 46, 7, 9, 11, 3};
		expectedOutput = 7;
		n = 5;
		actualOutput = FindNumberLargerThanN.findNumber(input, n);
		assertEquals(expectedOutput, actualOutput);
		System.out.printf("%s: Test %d ok \n", getFullMethodName(), testNumber++);
		
		//Test case 2: all numbers in array are less than n
		input = new int[] {1, 5, 10, 22, 46, 7, 9, 11, 3};
		expectedOutput = -1;
		n = 50;
		actualOutput = FindNumberLargerThanN.findNumber(input, n);
		assertEquals(expectedOutput, actualOutput);
		System.out.printf("%s: Test %d ok \n", getFullMethodName(), testNumber++);
	}

}
