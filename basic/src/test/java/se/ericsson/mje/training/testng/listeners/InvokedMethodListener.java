package se.ericsson.mje.training.testng.listeners;

import java.io.PrintStream;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;


/**
 *
 */
public class InvokedMethodListener implements IInvokedMethodListener {

    PrintStream out = System.out;

    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        out.println("\t\t\t\t\t\t Listener: Before Invocation -" + method.getTestMethod().toString() + ", "
                + testResult.getName());
    }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        out.println("\t\t\t\t\t\t Listener: After Invocation -" + method.getTestMethod().toString() + ", "
                + testResult.getName());
    }

}
