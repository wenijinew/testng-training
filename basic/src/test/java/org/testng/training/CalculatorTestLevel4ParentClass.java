package org.testng.training;

import org.testng.annotations.DataProvider;
import org.testng.training.CalculatorTestLevel4.People;

/**
 *
 */
public class CalculatorTestLevel4ParentClass {

    /**
     * @return Object[][]
     */
    @DataProvider(name = "parentDataProvider")
    public static Object[][] parentDataProvider() {
        return new Object[][] {
                { new People(2), new People(3) }, { new People(4), new People(5) }
        };
    }
}
