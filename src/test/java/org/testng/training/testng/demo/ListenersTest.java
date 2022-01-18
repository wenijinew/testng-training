package org.testng.training.testng.demo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.training.testng.Calculator;
import org.testng.training.testng.CalculatorImpl;
import org.testng.training.testng.demo.listeners.ExecutionListener;
import org.testng.training.testng.demo.listeners.SuiteListener;

@Listeners(value = { ExecutionListener.class, SuiteListener.class })
public class ListenersTest extends DemoTestBase {

    public ListenersTest() {
    }

    @Test
    public void testWithListenrs() {
        info(this + ": TC1");

        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 1);
        Assert.assertEquals(result, 2);
    }
}
