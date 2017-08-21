package se.ericsson.mje.training.testng;

import java.io.PrintStream;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Level 3: Groups
 */
@Test(groups = "calculator-test")
public class CalculatorTestLevel31 {

    PrintStream out = System.out;

    /**
     * 
     */
    @Test(groups = { "basic", "positive" })
    public void testBasicSumPositive() {
        out.println("Test Level 31: Basic Positive");

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
        out.println("Test Level 31: Basic Negative");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(-1, -1);
        int expectedResult = -2;

        Assert.assertEquals(actualResult, expectedResult, "-2 is not the result of -1 plus -1!");
    }

    /**
     * 
     */
    @Test(groups = { "advanced", "positive" })
    public void testAdvancedSumPositive() {
        out.println("Test Level 31: Advanced Positive");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(10, 10);
        int expectedResult = 20;

        Assert.assertEquals(actualResult, expectedResult, "20 is not the result of 10 plus 10!");
    }

    /**
     * 
     */
    @Test(groups = { "advanced", "negative" })
    public void testAdvancedSumNegative() {
        out.println("Test Level 31: Advanced Negative");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(-10, -10);
        int expectedResult = -20;

        Assert.assertEquals(actualResult, expectedResult, "-20 is not the result of -10 plus -10!");
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
    @BeforeClass(groups = { "basic" })
    public void beforeTestClass() {
        out.println("\t\t\tBefore Test Class");
    }

    /**
     * 
     */
    @AfterClass(groups = { "advanced" })
    public void afterTestClass() {
        out.println("\t\t\tAfter Test Class");
    }

    /**
     * 
     */
    @BeforeTest(groups = { "basic" })
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

    /**
     * 
     */
    @BeforeGroups(groups = { "basic" })
    public void beforeBasicTestGroup() {
        out.println("\tBefore Test Group: Basic");
    }

    /**
     * 
     */
    @AfterGroups(groups = { "basic" })
    public void afterBasicTestGroup() {
        out.println("\tAfter Test Group: Basic");
    }

    /**
     * 
     */
    @BeforeGroups(groups = { "advanced" })
    public void beforeAdvancedTestGroups() {
        out.println("\tBefore Test Group: Advanced");
    }

    /**
     * 
     */
    @AfterGroups(groups = { "advanced" })
    public void afterAdvancedTestGroups() {
        out.println("\tAfter Test Group: Advanced");
    }

    /**
     * 
     */
    @BeforeGroups(groups = { "positive" })
    public void beforePositiveTestGroups() {
        out.println("\tBefore Test Group: Positive");
    }

    /**
     * 
     */
    @AfterGroups(groups = { "positive" })
    public void afterPositiveTestGroups() {
        out.println("\tAfter Test Group: Positive");
    }

    /**
     * 
     */
    @BeforeGroups(groups = { "negative" })
    public void beforeNegativeTestGroups() {
        out.println("\tBefore Test Group: Negative");
    }

    /**
     * 
     */
    @AfterGroups(groups = { "negative" })
    public void afterNegativeTestGroups() {
        out.println("\tAfter Test Group: Negative");
    }
}
