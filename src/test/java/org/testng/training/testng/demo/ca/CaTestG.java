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
 * Demo test class having methods annotated with <code>$BeforeGroup</code> and
 * <code>@AfterGroup</code>.
 * </p>
 * <p>
 * <b>Methods</b> annotated with <code>@BeforeGroup</code> and <code>@AfterGroup</code> will run
 * before and after <b>Any</b>
 * test methods execution, if those test methods are defined in the <code>group(s)</code> with the
 * attribute
 * <code>groups</code> of annotation <code>@Test</code> and that <code>group(s)</code> is also
 * specified with the
 * attribute <code>value</code> of the annotation <code>@BeforeGroup</code> or
 * <code>@AfterGroup</code> of the
 * <b>methods</b>.
 * </p>
 */
public class CaTestG extends DemoTestBase {

    static final String BEFORE_GROUP = "[Before Group]";
    static final String AFTER_GROUP = "[After Group]";

    public CaTestG() {
    }

    @BeforeGroups(value = { Constants.GROUP_CA1 })
    public void beforeCa1() {
        info(this + BEFORE_GROUP + Constants.GROUP_CA1);
    }

    @AfterGroups(value = { Constants.GROUP_CA1 })
    public void afterCa1() {
        info(this + AFTER_GROUP + Constants.GROUP_CA1);
    }

    @BeforeGroups(value = { Constants.GROUP_CA2 })
    public void beforeCa2() {
        info(this + BEFORE_GROUP + Constants.GROUP_CA2);
    }

    @AfterGroups(value = { Constants.GROUP_CA2 })
    public void afterCa2() {
        info(this + AFTER_GROUP + Constants.GROUP_CA2);
    }

    @BeforeGroups(value = { Constants.GROUP_S1 })
    public void beforeS1() {
        info(this + BEFORE_GROUP + Constants.GROUP_S1);
    }

    @AfterGroups(value = { Constants.GROUP_S1 })
    public void afterS1() {
        info(this + AFTER_GROUP + Constants.GROUP_S1);
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

    @Test(groups = { Constants.GROUP_S1 })
    public void testTC3() {
        info(this + ": TC3");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 2);
    }

    @Test(groups = { Constants.GROUP_S1 })
    public void testTC4() {
        info(this + ": TC4");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 3);
    }
}
