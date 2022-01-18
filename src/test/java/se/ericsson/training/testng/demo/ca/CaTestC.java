package org.testng.training.testng.demo.ca;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.training.testng.Calculator;
import org.testng.training.testng.CalculatorImpl;
import org.testng.training.testng.demo.DemoTestBase;
import org.testng.training.testng.demo.LogUtils;

/**
 * <p>Demo test class having methods annotated with <code>@BeforeClass</code> and <code>@AfterClass</code>.</p>
 * <p>
 * Methods annotated with <code>@BeforeClass</code> and <code>@AfterClass</code> will run before and after <b>Any</b>
 * test methods execution, if those test methods are defined in the same class with the methods annotated with
 * <code>@BeforeClass</code> and <code>@AfterClass</code>, no matter to which <code>test</code> the methods belong.
 * </p>
 */
public class CaTestC extends DemoTestBase {

    static final String BEFORE_CLASS = "[Before Class]";
    static final String AFTER_CLASS = "[After Class]";

    /**
     *
     */
    public CaTestC() {
    }

    @BeforeClass
    public void beforeClass() {
        info(this + BEFORE_CLASS);
    }

    @AfterClass
    public void afterClass() {
        info(this + AFTER_CLASS);
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
