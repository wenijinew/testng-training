package org.testng.training.testng.solution;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.training.testng.demo.LogUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Solution for Exercise B - calculate test execution duration for failed test.
 * Solution 1: continue use startTime filed and calculate in onTestFailure method.
 * Solution 2: use TestNG builtin methods of ITestResult to get calculate duration directly.
 */
public class TestListenerCalculateFailedTestDuration implements ITestListener {

    private static final SimpleDateFormat format = new SimpleDateFormat("yyyyMMDD_HHmmss.SSS");
    private static final long FAKE_EXECUTION_TIME = 6 * 1000;
    private Date startTime;

    @Override public void onTestStart(ITestResult result) {
        startTime = new Date();
        LogUtils.info(result.getMethod() + " - Start: " + format.format(startTime));
        try {
            Thread.sleep(FAKE_EXECUTION_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override public void onTestSuccess(ITestResult result) {

    }

    @Override public void onTestFailure(ITestResult result) {
        Date now = new Date();
        LogUtils.info(result.getMethod() + " - Time to onTestFailure: " + format.format(now));
        LogUtils.info(result.getMethod() + " - Duration (Solution 1) = " + (now.getTime() - startTime.getTime()) + " "
                + "milliseconds.");

        // solution 2: TestNG builtin methods for test start and end time in milliseconds.
        LogUtils.info(
                result.getMethod() + " - Duration (Solution 2) = " + (result.getEndMillis() - result.getStartMillis())
                        + " "
                        + "milliseconds.");
    }

    @Override public void onTestSkipped(ITestResult result) {

    }

    @Override public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override public void onStart(ITestContext context) {

    }

    @Override public void onFinish(ITestContext context) {

    }
}
