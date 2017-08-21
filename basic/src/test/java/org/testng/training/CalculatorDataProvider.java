package org.testng.training;

import org.testng.annotations.DataProvider;

/**
 *
 */
public class CalculatorDataProvider {

    /**
     * @return Object[][]
     */
    @SuppressWarnings("boxing")
    @DataProvider(name="staticDataProvider")
    public static Object[][] myDataProvider(){
        return new Object[][] {
                { 201, 201 }, { 202, 202 }
        };
    }
}
