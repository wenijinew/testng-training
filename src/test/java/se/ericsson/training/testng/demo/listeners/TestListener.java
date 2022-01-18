package se.ericsson.training.testng.demo.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import se.ericsson.training.testng.demo.LogUtils;


/**
 *
 */
public class TestListener implements ITestListener {

    public void onTestStart(ITestResult result) {
        LogUtils.info("[Listener: Test Start] " + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        LogUtils.info("[Listener: Test Success] " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        LogUtils.info("[Listener: Test Failure] " + result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        LogUtils.info("[Listener: Test Skipped] " + result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        LogUtils.info("[Listener: Test Failed with Success Percentage] " + result.getName());
    }

    public void onStart(ITestContext context) {
        LogUtils.info("[Listener: Test Context Start] " + context.getName());
    }

    public void onFinish(ITestContext context) {
        LogUtils.info("[Listener: Test Context Finish] " + context.getName());
    }
}
