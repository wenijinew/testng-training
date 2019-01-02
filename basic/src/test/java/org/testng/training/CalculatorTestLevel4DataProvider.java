package org.testng.training;

import org.testng.annotations.DataProvider;
import org.testng.training.CalculatorTestLevel4.People;

/**
 *
 */
public class CalculatorTestLevel4DataProvider {

    /**
     * @return Object[][]
     */
    @DataProvider(name="staticDataProvider")
    public static Object[][] myDataProvider(){
        return new Object[][] {
                { new People(62), new People(65) }, { new People(64), new People(66) }
        };
    }
}
