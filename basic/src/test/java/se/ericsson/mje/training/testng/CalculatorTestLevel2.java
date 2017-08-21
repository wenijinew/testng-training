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
        out.println("\t\t\t\t\t Test Level 2");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(1, 1);
        int expectedResult = 2;

        // assert actualResult == expectedResult;

        Assert.assertEquals(actualResult, expectedResult, "2 is not the result of 1 plus 1!");
    }

    /**
     * 
     */
    @BeforeMethod
    public void beforeTestMethod() {
        out.println("\t\t\t\tBefore Test Method");
    }

    /**
     * 
     */
    @AfterMethod
    public void afterTestMethod() {
        out.println("\t\t\t\tAfter Test Method");
    }

    /**
     * 
     */
    @BeforeClass
    public void beforeTestClass() {
        out.println("\t\t\tBefore Test Class");
    }

    /**
     * 
     */
    @AfterClass
    public void afterTestClass() {
        out.println("\t\t\tAfter Test Class");
    }

    /**
     * 
     */
    @BeforeTest
    public void beforeTest() {
        out.println("\t\tBefore Test");
    }

    /**
     * 
     */
    @AfterTest
    public void afterTest() {
        out.println("\t\tAfter Test");
    }

    /**
     * 
     */
    @BeforeSuite
    public void beforeTestSuite() {
        out.println("\tBefore Test Suite");
    }

    /**
     * 
     */
    @AfterSuite
    public void afterTestSuite() {
        out.println("\tAfter Test Suite");
    }

}
