package org.testng.training.listeners;

import java.io.PrintStream;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


/**
 *
 */
public class TestListener implements ITestListener {

    PrintStream out = System.out;

    public void onTestStart(ITestResult result) {
        out.println("Listener: Test Start - " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        out.println("Listener: Test Success - " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        out.println("Listener: Test Failure - " + result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        out.println("Listener: Test Skipped - " + result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        out.println("Listener: Test Failed with success percentage - " + result.getName());
    }

    public void onStart(ITestContext context) {
        out.println("Listener: Test Context Start - " + context.getName());
    }

    public void onFinish(ITestContext context) {
        out.println("Listener: Test Context Finish - " + context.getName());
    }

}
