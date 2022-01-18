package se.ericsson.training.testng.demo;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import se.ericsson.training.testng.Calculator;
import se.ericsson.training.testng.CalculatorImpl;

/**
 * <p>
 * Data provider is used for test methods which need complex data types which cannot be satisfied by @Parameters.
 * </p>
 */
public class DataProviderTest extends DemoTestBase {

    /**
     * <p>
     * The method with annotation <code>@DataProvider</code> is used as Data Provider. It must return Object[][] array where
     * the first dimension'simple size is the number of times the test method will be invoked and the second dimension
     * contains an array of objects that must be compatible with the parameter types of the test method.
     * </p>
     * <p>
     * The method with annotation <code>@DataProvider</code> can be declared in the current class and its super class
     * . It can also be in any other class, as long as the method is declared as static method. If it'simple defined in
     * other class, then the attribute <code>dataProviderClass</code> of <code>@Test</code> should be used for test method.
     * </p>
     *
     * @return Object[][] - array of array of objects.
     */
    @DataProvider(name = Constants.DATA_PROVIDER_NAME)
    public Object[][] team() {
        return new Object[][] {
                { new People("Steven", 30), new People("Alice", 37) },
                { new People("Bob", 23), new People("Leo", 24) },
                { new People("Li", 41), new People("Tom", 45) }
        };
    }

    /**
     * <p>The attribute <code>dataProvider</code> of <code>@Test</code> is used to specify the data provider. Its
     * value should be same with the value of the attribute <code>name</code> of <code>@DataProvider</code> used for
     * data provider method.
     * </p>
     *
     * @param p1 - first person
     * @param p2 - second person
     */
    @Test(dataProvider = Constants.DATA_PROVIDER_NAME)
    public void testWithDataProvider(People p1, People p2) {
        info(this + ": TC1");

        info(p1);
        info(p2);

        Calculator calculator = new CalculatorImpl();

        int actualResult = calculator.add(p1.age, p2.age);
        int expectedResult = p1.age + p2.age;

        Assert.assertEquals(actualResult, expectedResult);
    }

    static class People {

        String name;
        int age;

        People(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "I am " + this.name + " and I am " + this.age + " years old.";
        }
    }

}
