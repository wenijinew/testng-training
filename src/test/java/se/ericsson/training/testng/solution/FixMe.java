package se.ericsson.training.testng.solution;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import se.ericsson.training.testng.Calculator;
import se.ericsson.training.testng.CalculatorImpl;
import se.ericsson.training.testng.demo.LogUtils;

/*
 * <p>
 * It's a bad practice to use one class to do more things, it breaks Single Responsibility Principle.
 * In this example, <code>FixMe</code> is a test class and meanwhile it's an implementation class of {@ITestListener}.
 * TestNG will create different instances for test class and Listeners in different lifecycle phases. Then, methods
 * belong to test class and listener interface will be called in different phases also. That means,
 * <code>startTime</code> is initialized in <code>@BeforeMethod</code>:<code>init()</code> but <code>init()</code>
 * method will not be called for Listener instance: <code>startTime</code> will never be initialized for Listener
 * instance - <code>startTime</code> will be null always in Listener instance. Check the following TeatNG code for
 * details:
 * <ul>
 *     <li>org.testng.TestRunner#init()</li>
 *     <li>org.testng.TestRunner#initMethods()</li>
 *     <li>org.testng.TestRunner#initListeners()</li>
 * </ul>
 * </p>
 * <p>
 *     To solve the problem, we have to rethink the requirement and solution. The requirement is to calculate the
 *     method execution duration when test is failed. We can use dedicated listener implementation class to do that
 *     for <b>all</b> test methods. But we cannot fetch the field <code>testID</code> of the specific test class
 *     because Listener is for generic business logic, unless we want to have specific business logic handler.
 *
 *     Thus, if it's enough to calculate test method execution duration and print out the test method name. We can do
 *     it like this:
 *     <ul>
 *         <li>Decouple <code>FixMe</code> from ITestListener</li>
 *         <li>Create a new class to implement ITestListener</li>
 *         <li>Create field <code>startTime</code> in listener implementation class. Initialize it in
 *         <code>onTestStart</code> method and calculate it in <code>onTestFailure</code>.</li>
 *     </ul>
 * </p>
 */
@Listeners(TestListenerCalculateFailedTestDuration.class)
public class FixMe {

    private String testID;
    private String testHeading;

    public FixMe() {
    }

    @BeforeMethod
    public void init() {
        testID = "TC_001";
        testHeading = "TC Fix Me";
    }

    @Test
    public void testMe() {
        LogUtils.info(testID + ':' + testHeading);
        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 2);
        Assert.assertEquals(result, 2);
    }
}
