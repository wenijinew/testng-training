package se.ericsson.training.testng.demo;

import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
import se.ericsson.training.testng.demo.test.TestA;

public class FactoryTest2 {

    /**
     * How many test class instance will be created? Configure parameter <code>instanceTotal<code/> in suite file to
     * specify it.
     */
    public static final String PARAMETER_NAME_TEST_INSTANCE_TOTAL="instanceTotal";

    /**
     * @return Object[]
     */
    @Factory
    @Parameters(PARAMETER_NAME_TEST_INSTANCE_TOTAL)
    public Object[] createInstances(int length) {
        Object[] instances = new Object[length];
        for (int i = 0; i < length; i++) {
            instances[i] = new TestA();
        }
        return instances;
    }
}
