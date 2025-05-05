package com.ibm.juint.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("before ALL");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("after all");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("before each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after each");
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		int expected =6;
		Calculator calculator = new Calculator();
		int actual =calculator.sum(4,2);
		assertEquals(expected, actual);
	}
	@Test
	void testdivide() {
		//fail("Not yet implemented");
		int expected =2;
		Calculator calculator = new Calculator();
		int actual =calculator.divide(4,2);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDivideByZeroException() {
		System.out.println("divide");
		
		Calculator calculator = new Calculator();
		ArithmeticException exception = assertThrows(ArithmeticException.class,()-> calculator.divide(10,0),
				"Expected divide()to throw,but it didn't");
		assertEquals("\by zero", exception.getMessage());
		}

}
