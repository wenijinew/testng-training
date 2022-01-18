package se.ericsson.training.testng.demo.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import se.ericsson.training.testng.Calculator;
import se.ericsson.training.testng.CalculatorImpl;
import se.ericsson.training.testng.demo.DemoTestBase;
import se.ericsson.training.testng.demo.LogUtils;

public class TestA extends DemoTestBase {
    public TestA() {
    }

    @Test
    public void testTC1() {
        info(this + ": TC1");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result,2);
    }

    @Test
    public void testTC2() {
        info(this + ": TC2");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(Integer.MAX_VALUE, Integer.MAX_VALUE);
        Assert.assertEquals(result, -2); // why -2?
    }
}
