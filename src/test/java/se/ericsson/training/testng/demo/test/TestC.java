package se.ericsson.training.testng.demo.test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import se.ericsson.training.testng.Calculator;
import se.ericsson.training.testng.CalculatorImpl;
import se.ericsson.training.testng.demo.DemoTestBase;
import se.ericsson.training.testng.demo.LogUtils;

@Test
public class TestC extends DemoTestBase {

    TestC() {
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
        if (result != 3) {
            throw new SkipException("I want to skip the test TC2!");
        }
        Assert.assertEquals(result, 2);
    }

    // TestNG: 6.14.3, 7.3.0 bugs:
    // This method cannot be shown in TestNG report.
    @Test(successPercentage = 50)
    public void testTC3() {
        info(this + ": TC3");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 2);
        Assert.assertEquals(result, 2);
        result = calculator.add(1, 2);
        Assert.assertEquals(result, 2);
    }

    public void haveToRun() {
        info(this + ": Have to Run because ... ");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 2);
    }
}
