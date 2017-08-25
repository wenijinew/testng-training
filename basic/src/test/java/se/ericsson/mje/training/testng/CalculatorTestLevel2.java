package se.ericsson.mje.training.testng;

import java.io.PrintStream;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Level2: Configuration Methods except for Groups
 */
public class CalculatorTestLevel2 {

    PrintStream out = System.out;

    /**
     * 
     */
    @Test
    public void testBasicSumPositive() {
        out.println("Test Level 2 - Positive");

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
        out.println("Test Level 2 - Negative");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(-1, -1);
        int expectedResult = -2;

        // assert actualResult == expectedResult;

        Assert.assertEquals(actualResult, expectedResult, "-2 is not the result of -1 plus -1!");
    }

    /**
     * 
     */
    @BeforeMethod
    public void beforeTestMethod() {
        out.println("Before Test Method");
    }

    /**
     * 
     */
    @AfterMethod
    public void afterTestMethod() {
        out.println("After Test Method");
    }

    /**
     * 
     */
    @BeforeClass
    public void beforeTestClass() {
        out.println("Before Test Class");
    }

    /**
     * 
     */
    @AfterClass
    public void afterTestClass() {
        out.println("After Test Class");
    }

    /**
     * 
     */
    @BeforeTest
    public void beforeTest() {
        out.println("Before Test");
    }

    /**
     * 
     */
    @AfterTest
    public void afterTest() {
        out.println("After Test");
    }

    /**
     * 
     */
    @BeforeSuite
    public void beforeTestSuite() {
        out.println("Before Test Suite");
    }

    /**
     * 
     */
    @AfterSuite
    public void afterTestSuite() {
        out.println("After Test Suite");
    }

}
