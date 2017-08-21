package org.testng.training;

import java.io.PrintStream;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 */
@Test(groups = "calculator-test")
public class CalculatorTestNgAddonTest {

    PrintStream out = System.out;

    /**
     * 
     */
    @Test(groups = { "addon" })
    public void testBasicSumPositiveNumbersOneAndOne() {
        Calculator calculator = new CalculatorImpl();
        Assert.assertEquals(calculator.add(Integer.MAX_VALUE, Integer.MAX_VALUE), -2);
        out.println("\t\t\t\t\tTest Method - Integer.MAX_VALUE plus 1");
    }
}
