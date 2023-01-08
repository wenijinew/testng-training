package org.testng.training.testng.demo.ca;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.training.testng.Calculator;
import org.testng.training.testng.CalculatorImpl;
import org.testng.training.testng.demo.DemoTestBase;
import org.testng.training.testng.demo.LogUtils;

/**
 * <p>
 * Demo test class having methods annotated with <code>@BeforeSuite</code> and
 * <code>@AfterSuite</code>.
 * </p>
 * <p>
 * Methods annotated with <code>@BeforeSuite</code> and <code>@AfterSuite</code> will run before and
 * after <b>ALL</b>
 * test methods execution, if they are in the same <code>&lt;suite&gt;</code> and the class(es)
 * having those methods
 * annotated with <code>@BeforeSuite</code> and <code>@AfterSuite</code> is(are) also in the same
 * <code>&lt;suite&gt;
 * </code>.
 * </p>
 */
public abstract class CaTestS extends DemoTestBase {

    static final String BEFORE_SUITE = "[Before Suite]";
    static final String AFTER_SUITE = "[After Suite]";
    private String showme;
    protected String initMeInSubclass;

    public CaTestS() {
    }

    protected abstract void initMe();

    @BeforeSuite
    public void beforeSuite() {
        info(this + BEFORE_SUITE);
        showme = "Initialized in beforeSuite - CaTestS";
        initMe();
        info("Does it work? " + initMeInSubclass);
    }

    @AfterSuite
    public void afterSuite() {
        info(this + AFTER_SUITE);
        info(showme);
    }

    @Test
    public void testTC1() {
        info(this + ": TC1");
        info(showme);

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

    @Test
    public void testTC3() {
        info(this + ": TC3");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 2);
    }
}
