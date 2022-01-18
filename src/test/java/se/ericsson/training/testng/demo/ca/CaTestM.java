package se.ericsson.training.testng.demo.ca;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;
import se.ericsson.training.testng.Calculator;
import se.ericsson.training.testng.CalculatorImpl;
import se.ericsson.training.testng.demo.DemoTestBase;
import se.ericsson.training.testng.demo.LogUtils;

/**
 * <p>Demo test class having methods annotated with <code>@BeforeMethod</code> and <code>@AfterMethod</code>.</p>
 * <p>
 * Methods annotated with <code>@BeforeMethod</code> and <code>@AfterMethod</code> will run before and after
 * <b>EACH</b> test method execution, if those test methods are defined in the same class with the methods annotated
 * with <code>@BeforeMethod</code> and <code>@AfterMethod</code>. <br />
 * <b>Note: </b>it'simple allowed to define multiple methods with the
 * annotation <code>@BeforeGroup</code> or <code>@AfterGroup</code> That also applies to other Configuration
 * Annotations(CA).
 * </p>
 *
 */
public class CaTestM extends DemoTestBase {

    static final String BEFORE_METHOD = "[Before Method]";
    static final String AFTER_METHOD = "[After Method]";

    /**
     *
     */
    public CaTestM() {
    }

    @BeforeMethod
    public void beforeMethod1() {
        info(this + BEFORE_METHOD);
    }

    @AfterMethod
    public void afterMethod1() {
        info(this + AFTER_METHOD);
    }

    // Question: can we define multiple methods with annotation @BeforeMethod or @AfterMethod?

    @AfterMethod
    public void afterMethod2() {
        info(this + " : this @AfterMethod will be skipped and all subsequent configuration methods and test methods "
                + "will also be skipped.");
        throw new SkipException("I want to skip the test!");
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
