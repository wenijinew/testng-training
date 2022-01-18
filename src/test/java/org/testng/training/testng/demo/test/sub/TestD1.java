package org.testng.training.testng.demo.test.sub;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.training.testng.Calculator;
import org.testng.training.testng.CalculatorImpl;
import org.testng.training.testng.demo.DemoTestBase;
import org.testng.training.testng.demo.LogUtils;

public class TestD1 extends DemoTestBase {
    public void testTC1() {
        info(this + ": TC1");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 2);
    }

    @Test(dependsOnMethods={})
    public void testTC2() {
        info(this + ": TC2");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 2);
    }

    public void testTC3() {
        info(this + ": TC3");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 2);
    }

    public void testTC4() {
        info(this + ": TC4");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 2);
    }

    public void testTC5() {
        info(this + ": TC5");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 2);
    }
}
