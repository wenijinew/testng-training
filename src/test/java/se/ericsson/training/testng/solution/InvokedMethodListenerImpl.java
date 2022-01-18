package se.ericsson.training.testng.solution;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import se.ericsson.training.testng.demo.LogUtils;

/**
 * <p>Implementation of the interface {@link IInvokedMethodListener} to show how to handle the business logic before
 * and after all <b>IInvokedMethod</b> execution. <b>IInvokedMethod</b> includes both test method and configuration
 * method.
 * </p>
 */
public class InvokedMethodListenerImpl implements IInvokedMethodListener {

    @Override public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        LogUtils.info('[' + getClass().getSimpleName() + " - beforeInvocation] - isTestMethod: " + method.isTestMethod()
                + " - ITestResult:" + testResult.getName());
    }

    @Override public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        LogUtils.info('[' + getClass().getSimpleName() + " - afterInvocation] - isTestMethod: " + method.isTestMethod()
                + " - ITestResult:" + testResult.getName());
    }
}
