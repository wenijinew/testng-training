package se.ericsson.training.testng;
public class CalculatorImpl implements Calculator {
    public CalculatorImpl() {
    }

    /* (non-Javadoc)
     * @see se.ericsson.training.testng.basic.Calculator#add(int, int)
     */
    public int add(int a, int b) {
        return a + b;
    }
}
