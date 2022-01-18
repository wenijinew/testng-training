package org.testng.training.testng;
public class CalculatorImpl implements Calculator {
    public CalculatorImpl() {
    }

    /* (non-Javadoc)
     * @see org.testng.training.testng.basic.Calculator#add(int, int)
     */
    public int add(int a, int b) {
        return a + b;
    }
}
