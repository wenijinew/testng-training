/**
 * 
 */
package org.testng.training.testng.demo.listeners;

import org.testng.IClassListener;
import org.testng.IMethodInstance;
import org.testng.ITestClass;
import org.testng.training.testng.demo.LogUtils;


/**
 * @author egugwen
 *
 */
public class ClassListener implements IClassListener {

    /**
     *
     */
    public ClassListener() {
    }

    public void onBeforeClass(ITestClass testClass) {
        LogUtils.info("[Listener: Before Class]" + testClass.getRealClass().getSimpleName());
    }

    public void onAfterClass(ITestClass testClass) {
        LogUtils.info("[Listener: After Class]" + testClass.getRealClass().getSimpleName());
    }
}
