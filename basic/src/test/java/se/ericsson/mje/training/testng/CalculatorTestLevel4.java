package se.ericsson.mje.training.testng;

import java.io.PrintStream;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Parameterization
 */
public class CalculatorTestLevel4 extends CalculatorTestLevel4ParentClass {

    PrintStream out = System.out;

    /**
     * @param a
     * @param b
     */
    @Parameters({ "a", "b" })
    @Test(groups = { "parameter" })
    public void testWithParameters(int a, @Optional("1") int b) {
        out.println("Test Level 4: Parameter from TestNg XML");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(a, b);
        int expectedResult = a + b;

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * @param p1
     * @param p2
     */
    @Test(dataProvider = "my-data", groups = "parameter")
    public void testWithDataProvider(People p1, People p2) {
        out.println("Test Level 4: Parameter from DataProvider");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(p1.age, p2.age);
        int expectedResult = p1.age + p2.age;

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     *
     */
    public static class People {
        int age;

        People(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "My Age is:" + this.age;
        }
    }

    /**
     * @return Object[][]
     */
    @DataProvider(name = "my-data")
    public Object[][] myDataProvider() {
        return new Object[][] {
                { new People(30), new People(37) }, { new People(23), new People(24) },
                { new People(41), new People(45) }
        };
    }

    /**
     * @param p1
     * @param p2
     */
    @Test(dataProvider = "parentDataProvider", dataProviderClass = CalculatorTestLevel4ParentClass.class, groups = "parameter")
    public void testWithParentDataProvider(People p1, People p2) {
        out.println("Test Level 4: Parameter from Parent Class's DataProvider");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(p1.age, p2.age);
        int expectedResult = p1.age + p2.age;

        Assert.assertEquals(actualResult, expectedResult);
    }

    /**
     * @param p1
     * @param p2
     */
    @Test(dataProvider = "staticDataProvider", dataProviderClass = CalculatorTestLevel4DataProvider.class, groups = "parameter")
    public void testWithStaticDataProvider(People p1, People p2) {
        out.println("Test Level 4: Parameter from Static DataProvider");

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(p1.age, p2.age);
        int expectedResult = p1.age + p2.age;

        Assert.assertEquals(actualResult, expectedResult);
    }

}
