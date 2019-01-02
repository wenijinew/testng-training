package org.testng.training.junit;

import java.io.PrintStream;

import org.testng.Assert;
import org.testng.training.Calculator;
import org.testng.training.CalculatorImpl;

import junit.framework.TestCase;

/**
 *
 */
@SuppressWarnings("javadoc")
public class CalculatorJunit3TestCase extends TestCase {

	PrintStream out = System.out;

	/**
	 * 
	 */
	public CalculatorJunit3TestCase() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public CalculatorJunit3TestCase(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setUp() {
		out.println("Test Level 8: Setup");
	}

	public void testBasicSumPositive() {
		out.println("Test Level 8: Basic Positive");

		Calculator calculator = new CalculatorImpl();

		int actualResult = calculator.add(1, 1);
		int expectedResult = 2;

		assert actualResult == expectedResult;

		// Assert.assertEquals(actualResult, expectedResult, "2 is not the result of 1
		// plus 1!");
	}

	public void testBasicSumNegative() {
		out.println("Test Level 8: Basic Negative");

		Calculator calculator = new CalculatorImpl();

		int actualResult = calculator.add(-1, -1);
		int expectedResult = -2;

		Assert.assertEquals(actualResult, expectedResult, "-2 is not the result of -1 plus -1!");
	}

	@Override
	public void tearDown() {
		out.println("Test Level 8: tearDown");
	}
}
