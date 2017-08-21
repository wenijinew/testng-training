package se.ericsson.mje.training.testng;


/**
 * Basic implementation of Calculator
 */
public class CalculatorImpl implements Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }
}
