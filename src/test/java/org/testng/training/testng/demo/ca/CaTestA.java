package org.testng.training.testng.demo.ca;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.training.testng.Calculator;
import org.testng.training.testng.CalculatorImpl;
import org.testng.training.testng.demo.Constants;
import org.testng.training.testng.demo.DemoTestBase;
import org.testng.training.testng.demo.LogUtils;

/**
 * <p>
 * Demo test class having methods annotated with all Configuration Annotations(CA).
 * </p>
 */
public class CaTestA extends DemoTestBase {

    /**
     *
     */
    public CaTestA() {
    }

    @BeforeSuite
    public void beforeSuite() {
        info(this + CaTestS.BEFORE_SUITE);
    }

    @AfterSuite
    public void afterSuite() {
        info(this + CaTestS.AFTER_SUITE);
    }

    @BeforeTest
    public void beforeTest() {
        info(this + CaTestT.BEFORE_TEST);
    }

    @AfterTest
    public void afterTest() {
        info(this + CaTestT.AFTER_TEST);
    }

    @BeforeClass
    public void beforeClass() {
        info(this + CaTestC.BEFORE_CLASS);
    }

    @AfterClass
    public void afterClass() {
        info(this + CaTestC.AFTER_CLASS);
    }

    @BeforeMethod
    public void beforeMethod() {
        info(this + CaTestM.BEFORE_METHOD);
    }

    @AfterMethod
    public void afterMethod() {
        info(this + CaTestM.AFTER_METHOD);
    }

    @BeforeGroups(value = { Constants.GROUP_CA1 })
    public void beforeGroups() {
        info(this + CaTestG.BEFORE_GROUP);
    }

    @AfterGroups(value = { Constants.GROUP_CA1 })
    public void afterGroups() {
        info(this + CaTestG.AFTER_GROUP);
    }

    @Test(groups = { Constants.GROUP_CA1 })
    public void testTC1() {
        info(this + ": TC1");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 2);
    }

    @Test(groups = { Constants.GROUP_CA2 })
    public void testTC2() {
        info(this + ": TC2");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void testTC3() {
        info(this + ": TC3");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 2);
    }

    @Test(groups = { Constants.GROUP_CA1 })
    public void testTC4() {
        info(this + ": TC4");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 2);
    }
}
