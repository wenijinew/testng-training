package org.testng.training.testng.demo;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.training.testng.Calculator;
import org.testng.training.testng.CalculatorImpl;

public class ParametersTest extends DemoTestBase {
    private int a;
    private int b;
    private int c;
    private int d;

    @BeforeClass
    @Parameters({"a","b","c","d"})
    public void beforeClass(@Optional("0") final int a,@Optional("0")  final int b,@Optional("0")  final int c,@Optional("0")  final int d){
        showVariables(a,b,c,d,"BeforeClass");
    }

    @BeforeTest
    @Parameters({"a","b","c","d"})
    public void beforeTest(@Optional("0") final int a,@Optional("0")  final int b,@Optional("0")  final int c,@Optional("0")  final int d){
        showVariables(a,b,c,d,"BeforeTest");
    }

    @BeforeMethod
    @Parameters({"a","b","c","d"})
    public void beforeMethod(@Optional("0") final int a,@Optional("0")  final int b,@Optional("0")  final int c,@Optional("0")  final int d){
        showVariables(a,b,c,d,"BeforeMethod");
    }

    private void showVariables(final int a, final int b, final int c, final int d, final String position){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        info(this + ": variables in "+position+": ");
        info("a = " + a);
        info("b = " + b);
        info("c = " + c);
        info("d = " + d);
    }

    /**
     * @param a - first operand
     * @param b - second operand
     */
    @Parameters({ "a", "b" })
    @Test
    public void testTC1(int a, int b) {
        info(this + ": TC1 (a=" + a + "; b=" + b + ")");

        this.a=a;
        this.b=b;
        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(a, b);
        int expectedResult = a + b;

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * @param c - first operand
     * @param d - second operand
     */
    @Parameters({ "testID", "testHeading", "c", "d" })
    @Test
    public void testTC2(@Optional("TC_DEMO_PARAMETERS") String testID,
            @Optional("Show how to use @Parameters in TestNG") String testHeading, int c, int d) {
        info(testID + ':' + testHeading + " (c=" + c + "; d=" + d + ")");

        this.c=c;
        this.d=d;
        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(c, d);
        int expectedResult = c + d;

        Assert.assertEquals(actualResult, expectedResult);
    }
}
