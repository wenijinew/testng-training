package org.testng.training.testng.issues.i2714;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;
import org.testng.training.testng.Calculator;
import org.testng.training.testng.CalculatorImpl;
import org.testng.training.testng.demo.DemoTestBase;
import org.testng.training.testng.demo.LogUtils;

public class CaTestM extends DemoTestBase {

    static final String BEFORE_METHOD = "Base [Before Method]";
    static final String AFTER_METHOD = "Base [After Method]";

    /**
     *
     */
    public CaTestM() {
    }

    @BeforeMethod (groups = { "beforeMethod" })
    public void beforeMethod1() {
        info(this + BEFORE_METHOD);
    }

    @AfterMethod
    public void afterMethod1() {
        info(this + AFTER_METHOD);
    }

    @Test
    public void testTC1() {
        info(this + ": TC1");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void testTC2() {
        info(this + ": TC2");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 2);
    }
}
