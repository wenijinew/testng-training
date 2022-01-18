package org.testng.training.testng.demo;

import org.testng.annotations.Factory;
import org.testng.training.testng.demo.test.TestA;

public class FactoryTest1 {
    // QUESTION: how to make this static variable configurable in suite XML file?
    private static final int LENGTH = 10;

    /**
     * @return Object[]
     */
    @Factory
    public Object[] createInstances() {
        Object[] instances = new Object[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            // how to handle those test cases which need parameters?
            instances[i] = new TestA();
        }
        return instances;
    }

}
