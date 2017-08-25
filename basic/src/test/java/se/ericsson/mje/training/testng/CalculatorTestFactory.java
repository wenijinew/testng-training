package se.ericsson.mje.training.testng;

import org.testng.annotations.Factory;

/**
 */
public class CalculatorTestFactory {

    static final int LENGTH = 100;

    /**
     * @return Object[]
     */
    @Factory
    public Object[] createInstances() {
        Object[] instances = new Object[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            instances[i] = new CalculatorTestLevel1();
        }
        return instances;
    }
}
