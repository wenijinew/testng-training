package org.testng.training.testng.demo.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.training.testng.Calculator;
import org.testng.training.testng.CalculatorImpl;
import org.testng.training.testng.demo.Constants;
import org.testng.training.testng.demo.DemoTestBase;
import org.testng.training.testng.demo.LogUtils;

public class TestD extends DemoTestBase {
    TestD() {
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
}
