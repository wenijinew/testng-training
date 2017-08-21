package se.ericsson.mje.training.testng;

import java.io.PrintStream;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Level 1: Basic Test and Execution
 */
public class CalculatorTestLevel1 {

    PrintStream out = System.out;
    /**
     * 
     */
    @Test
    public void testBasicSumPositive() {
        out.println("Test Level 1: Basic Positive");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(1, 1);
        int expectedResult = 2;

        // assert actualResult == expectedResult;

        Assert.assertEquals(actualResult, expectedResult, "2 is not the result of 1 plus 1!");
    }

    /**
     * 
     */
    @Test
    public void testBasicSumNegative() {
        out.println("Test Level 1: Basic Negative");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(-1, -1);
        int expectedResult = -2;

        Assert.assertEquals(actualResult, expectedResult, "-2 is not the result of -1 plus -1!");
    }

    /**
     * 
     */
    @Test
    public void testAdvancedSumPositive() {
        out.println("Test Level 1: Advanced Positive");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(10, 10);
        int expectedResult = 20;

        Assert.assertEquals(actualResult, expectedResult, "20 is not the result of 10 plus 10!");
    }
}

