package se.ericsson.mje.training.junit;

import junit.framework.Test;
import junit.framework.TestSuite;


public class CalculatorJunit3TestSuite extends TestSuite {

    public static Test suite() {
        // it can return a TestSuite instance or a TestCase instance
        CalculatorJunit3TestSuite suite = new CalculatorJunit3TestSuite();
        suite.addTest(new CalculatorJunit3TestCase("testBasicSumPositive"));
        suite.addTest(new CalculatorJunit3TestCase("testBasicSumNegative"));
        return suite;

        // it doesn't work by using constructor without argument
        //        return new CalculatorJunit3TestCase();

        // it must use constructor with String argument to specify test method to run
        //        return new CalculatorJunit3TestCase("testBasicSumPositive");
    }
}
