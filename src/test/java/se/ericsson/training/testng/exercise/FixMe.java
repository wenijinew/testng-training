package org.testng.training.testng.exercise;

import org.testng.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.training.testng.Calculator;
import org.testng.training.testng.CalculatorImpl;
import org.testng.training.testng.demo.LogUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

@Listeners(FixMe.class)
public class FixMe implements ITestListener {
    private static final SimpleDateFormat format = new SimpleDateFormat("yyyyMMDD:HHmmss.SSS");
    private String testID;
    private String testHeading;
    private Date startTime;

    public FixMe() {
    }

    @BeforeMethod
    public void init(){
        testID = "TC_001";
        testHeading = "TC Fix Me";
        startTime = new Date();
        LogUtils.info("Start:"+format.format(startTime));
    }

    @Test
    public void testMe(){
        LogUtils.info(testID+':'+testHeading);
        Calculator calculator = new CalculatorImpl();
        int result = calculator.add(1, 2);
        Assert.assertEquals(result,2);
    }

    public void onTestStart(ITestResult result) {

    }

    public void onTestSuccess(ITestResult result) {

    }

    public void onTestFailure(ITestResult result) {
        Date now = new Date();
        LogUtils.info("Time to onTestFailure:"+format.format(now));
        /* the following line will throw java.lang.NullPointerException. please analyze the root cause and do code refactoring to fix the problem*/
        LogUtils.info(testID+": Duration = "+(now.getTime() - startTime.getTime()));
    }

    public void onTestSkipped(ITestResult result) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {

    }
}
