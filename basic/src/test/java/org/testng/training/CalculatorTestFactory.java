package org.testng.training;

import org.testng.annotations.DataProvider;
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

    /**
     * @param length
     * @return Object[]
     */
    @Factory(dataProvider = "dp")
    public Object[] createInstances(int length) {
        Object[] instances = new Object[length];
        for (int i = 0; i < length; i++) {
            instances[i] = new CalculatorTestLevel1();
        }
        return instances;
    }

    @DataProvider(name="dp")
    Object[][] dataProvider(){
        return new Object[][]{
                new Object[] { 10 }, new Object[] { 40 }
        };
    }
}
