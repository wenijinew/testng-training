package org.testng.training.testng.demo.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.training.testng.demo.LogUtils;


/**
 * @author egugwen
 */
public class SuiteListener implements ISuiteListener {


    public void onStart(ISuite suite) {
        LogUtils.info("[Listener: Suite Start]" + suite.getName());
    }

    public void onFinish(ISuite suite) {
        LogUtils.info("[Listener: Suite End]" + suite.getName());
    }

}
