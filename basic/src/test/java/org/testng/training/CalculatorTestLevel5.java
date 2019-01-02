package org.testng.training;

import java.io.PrintStream;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.training.Calculator;
import org.testng.training.CalculatorImpl;

/**
 * Dependency
 */
public class CalculatorTestLevel5 {

    PrintStream out = System.out;

    /**
     * 
     */
    @Test(groups = { "basic", "positive" })
    public void testBasicSumPositive() {
        out.println("Test Level 5: Basic Positive");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(1, 1);
        int expectedResult = 2;

        Assert.assertEquals(actualResult, expectedResult, "2 is not the result of 1 plus 1!");
    }

    /**
     * 
     */
    @Test(groups = { "basic", "negative" })
    public void testBasicSumNegative() {
        out.println("Test Level 5: Basic Negative");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(-1, -1);
        int expectedResult = -2;

        Assert.assertEquals(actualResult, expectedResult, "-2 is not the result of -1 plus -1!");
    }

    /**
     * 
     */
    @Test(groups = { "advanced", "positive" }, dependsOnMethods = { "testBasicSumPositive" })
    public void testAdvancedSumPositive() {
        out.println("Test Level 5: Advanced Positive");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(10, 10);
        int expectedResult = 20;

        Assert.assertEquals(actualResult, expectedResult, "20 is not the result of 10 plus 10!");
    }

    /**
     * 
     */
    @Test(groups = { "advanced", "negative" }, dependsOnMethods = {
            "testBasicSumNegative" }, alwaysRun = true)
    public void testAdvancedSumNegative() {
        out.println("Test Level 5: Advanced Negative");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(-10, -10);
        int expectedResult = -20;

        Assert.assertEquals(actualResult, expectedResult, "-20 is not the result of -10 plus -10!");
    }

    /**
     * @param a
     * @param b
     */
    @Parameters({ "a", "b" })
    @Test(groups = { "parameter" }, dependsOnGroups = { "basic", "advanced" })
    public void testWithParameters(int a, @Optional("1") int b) {
        out.println("Test Level 4: Parameter from TestNg XML");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(a, b);
        int expectedResult = a + b;

        Assert.assertEquals(actualResult, expectedResult);
    }
}
