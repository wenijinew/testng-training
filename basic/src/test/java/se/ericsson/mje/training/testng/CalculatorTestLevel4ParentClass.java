package se.ericsson.mje.training.testng;

import org.testng.annotations.DataProvider;

import se.ericsson.mje.training.testng.CalculatorTestLevel4.People;

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
