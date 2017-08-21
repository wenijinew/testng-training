package org.testng.training;

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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 */
@Test(groups = "calculator-test")
public class CalculatorTestNgTest {

    PrintStream out = System.out;

    /**
     * 
     */
    @Test(groups = { "basic", "positive" })
    public void testSumPositiveNumbersOneAndOne() {
        Calculator calculator = new CalculatorImpl();
        Assert.assertEquals(calculator.add(1, 1), 2);
        out.println("\t\t\t\t\tTest Method - Basic & Positive");
    }

    /**
     * 
     */
    @Test(groups = { "basic", "negative" })
    public void testSumNegativeNumbersOneAndOne() {
        Calculator calculator = new CalculatorImpl();
        Assert.assertEquals(calculator.add(-1, -1), -2);
        out.println("\t\t\t\t\tTest Method - Basic & Negative");
    }

    /**
     * 
     */
    @Test(groups = { "advanced", "positive" })
    public void testAdvancedSumPositiveNumbersOneAndOne() {
        Calculator calculator = new CalculatorImpl();
        Assert.assertEquals(calculator.add(10, 10), 20);
        out.println("\t\t\t\t\tTest Method - Advanced & Positive");
    }

    /**
     * 
     */
    @Test(groups = { "advanced", "negative" })
    public void testAdvancedSumNegativeNumbersOneAndOne() {
        Calculator calculator = new CalculatorImpl();
        Assert.assertEquals(calculator.add(-10, -10), -20);
        out.println("\t\t\t\t\tTest Method - Advanced & Negative");
    }

    /**
     * @param a
     * @param b
     */
    @Parameters({ "a", "b" })
    @Test(groups = { "parameter" })
    public void testWithParameters(int a, int b) {
        Calculator calculator = new CalculatorImpl();
        Assert.assertEquals(calculator.add(a, b), a + b);
        out.println("\t\t\t\t\tTest Method - Parameterized");
    }

    /**
     * @param a
     * @param b
     */
    @Test(dataProvider = "my-data", groups = "parameter")
    public void testWithDataProvider(int a, int b) {
        Calculator calculator = new CalculatorImpl();
        Assert.assertEquals(calculator.add(a, b), a + b);
        out.println("\t\t\t\t\tTest Method - Data Provider");
    }

    /**
     * @param a
     * @param b
     */
    @Test(dataProvider = "staticDataProvider", dataProviderClass = CalculatorDataProvider.class, groups = "parameter")
    public void testWithStaticDataProvider(int a, int b) {
        Calculator calculator = new CalculatorImpl();
        Assert.assertEquals(calculator.add(a, b), a + b);
        out.println("\t\t\t\t\tTest Method - Static Data Provider");
    }

    /**
     * @return Object[][]
     */
    @DataProvider(name = "my-data")
    public Object[][] myDataProvider() {
        return new Object[][] {
                { 102, 102 }, { 103, 103 }, { 104, 104 }
        };
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
    public void beforeTestGroups() {
        out.println("\tBefore Test Group:Basic");
    }

    /**
     * 
     */
    @AfterGroups(groups = { "basic" })
    public void afterTestGroups() {
        out.println("\tAfter Test Group:Basic");
    }
}
