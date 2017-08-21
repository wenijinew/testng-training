package se.ericsson.mje.training.testng;

import java.io.PrintStream;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Level 32: Partial Groups
 */
@Test(groups = "calculator-test")
public class CalculatorTestLevel32 {

    PrintStream out = System.out;

    /**
     * 
     */
    @Test(groups = { "basic" })
    public void testBasicSumPositive() {
        out.println("Test Level 32: Basic Positive");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(2, 2);
        int expectedResult = 4;

        Assert.assertEquals(actualResult, expectedResult, "4 is not the result of 2 plus 2!");
    }

    /**
     * 
     */
    @Test(groups = { "invalid" })
    public void testInvalid1() {
        out.println("Test Level 31: Invalid1");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(Integer.MAX_VALUE, Integer.MAX_VALUE);
        int expectedResult = -2;

        Assert.assertEquals(actualResult, expectedResult,
                "-2 is not the result of Integer.MAX_VALUE plus Integer.MAX_VALUE!");
    }

    /**
     * 
     */
    @Test
    public void testInvalid2() {
        out.println("Test Level 31: Invalid2");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.minus(Integer.MIN_VALUE, Integer.MAX_VALUE);
        int expectedResult = 1;

        Assert.assertEquals(actualResult, expectedResult,
                "1 is not the result of Integer.MIN_VALUE minus Integer.MAX_VALUE!");
    }
}
