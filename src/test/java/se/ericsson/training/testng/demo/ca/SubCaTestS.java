package org.testng.training.testng.demo.ca;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.training.testng.Calculator;
import org.testng.training.testng.CalculatorImpl;
import org.testng.training.testng.demo.DemoTestBase;
import org.testng.training.testng.demo.LogUtils;
/**
 * <p>Demo test class having methods annotated with <code>@BeforeSuite</code> and <code>@AfterSuite</code>.</p>
 * <p>
 * Methods annotated with <code>@BeforeSuite</code> and <code>@AfterSuite</code> will run before and after <b>ALL</b>
 * test methods execution, if they are in the same <code>&lt;suite&gt;</code> and the class(es) having those methods
 * annotated with <code>@BeforeSuite</code> and <code>@AfterSuite</code> is(are) also in the same  <code>&lt;suite&gt;
 * </code>.
 * </p>
 */
public class SubCaTestS extends CaTestS{
    static final String BEFORE_SUITE = "[Before Suite]";
    static final String AFTER_SUITE = "[After Suite]";
    private String showme;

    public SubCaTestS() {
    }

    @Override
    protected void initMe(){
        initMeInSubclass="'initMeInSubclass' defined in CaTestS and initialized in '"+this+"'!";
    }

    @BeforeSuite
    public void beforeSuite() {
        showme="'showme' is Initialized in beforeSuite - SubCaTestS";
        super.beforeSuite();
    }

    @Test
    public void testTC1() {
        info(this+": TC1 - access 'showme' in testTC1:"  + showme);

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void testTC2() {
        info(this+": TC2");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void testTC3() {
        info(this+": TC3");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 2);
    }
}
