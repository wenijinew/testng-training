package org.testng.training.testng.demo.test;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.training.testng.Calculator;
import org.testng.training.testng.CalculatorImpl;
import org.testng.training.testng.demo.DemoTestBase;
import org.testng.training.testng.demo.LogUtils;

public class TestB extends DemoTestBase {
    TestB() {
    }

    @Test
    public void testTC1() {
        info(this+": TC1");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result,2);
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
        info(this + ": TC3");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result,2);
    }

    public void willNotRun(){
        info(this + ": Will Not Run");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result,2);
    }
}
