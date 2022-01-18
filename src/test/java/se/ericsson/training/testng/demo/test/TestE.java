package se.ericsson.training.testng.demo.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;
import se.ericsson.training.testng.Calculator;
import se.ericsson.training.testng.CalculatorImpl;
import se.ericsson.training.testng.demo.Constants;
import se.ericsson.training.testng.demo.DemoTestBase;
import se.ericsson.training.testng.demo.LogUtils;

public class TestE extends DemoTestBase {
    static final String BEFORE_METHOD = "[Before Method]";
    static final String AFTER_GROUP = "[After Method]";
    TestE() {
    }

    /**
     * Note: <code>groups</code> attribute cannot help us filter the before and after method to the groups specified
     * here.
     * see https://github.com/cbeust/testng/issues/549 and https://github
     * .com/cbeust/testng/wiki/Issue549:-Groups-in-@BeforeMethod-and-@AfterMethod-don't-work-as-expected for details.
     */
    @BeforeMethod(groups={Constants.GROUP_S1})
    public void beforeS1(){
        info(this + BEFORE_METHOD + Constants.GROUP_S1);
    }

    @AfterGroups(groups={Constants.GROUP_S1})
    public void afterS1(){
        info(this + AFTER_GROUP + Constants.GROUP_S1);
    }

    @Test(groups={Constants.GROUP_S1})
    public void testTC1() {
        info(this+": TC1");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result,2);
    }

    @Test(groups={Constants.GROUP_S2})
    public void testTC2() {
        info(this+": TC2");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result,2);
    }

    @Test
    public void testTC3() {
        info(this+": TC3");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result,2);
    }
}
