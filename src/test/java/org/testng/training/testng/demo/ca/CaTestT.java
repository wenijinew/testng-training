package org.testng.training.testng.demo.ca;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.training.testng.Calculator;
import org.testng.training.testng.CalculatorImpl;
import org.testng.training.testng.demo.DemoTestBase;
import org.testng.training.testng.demo.LogUtils;

/**
 * <p>Demo test class having methods annotated with <code>@BeforeTest</code> and <code>@AfterTest</code>.</p>
 * <p>
 * Method annotated with <code>@BeforeTest</code> and <code>@AfterTest</code> will run before and after <b>ALL</b>
 * test methods execution, if they are in the same <code>&lt;test&gt;</code> and the class(es) having those methods
 * annotated with <code>@BeforeTest</code> and <code>@AfterTest</code> is(are) also in the same  <code>&lt;test&gt;</code>.
 * </p>
 */
public class CaTestT extends DemoTestBase {

    static final String BEFORE_TEST = "[Before Test]";
    static final String AFTER_TEST = "[After Test]";

    /**
     *
     */
    public CaTestT() {
    }

    @BeforeTest
    public void beforeTest() {
        info(this + BEFORE_TEST);
    }

    @AfterTest
    public void afterTest() {
        info(this + AFTER_TEST);
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
