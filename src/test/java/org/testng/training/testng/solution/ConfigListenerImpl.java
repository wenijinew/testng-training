package org.testng.training.testng.solution;

import org.testng.IConfigurationListener2;
import org.testng.ITestResult;
import org.testng.training.testng.demo.LogUtils;

/**
 * <p>Implementation class of IConfigurationListener2 used to show how to handle the required business logic before
 * configuration method execution, when configuration method executed successfully, when configuration method
 * executed failed, and when configuration method is skipped.</p>
 */
public class ConfigListenerImpl implements IConfigurationListener2 {

    @Override public void beforeConfiguration(ITestResult itr) {
        LogUtils.info('[' + getClass().getSimpleName() + " - beforeConfiguration] - ITestResult:" + itr.getName());
    }

    @Override public void onConfigurationSuccess(ITestResult itr) {
        LogUtils.info('[' + getClass().getSimpleName() + " - onConfigurationSuccess] - ITestResult:" + itr.getName());
    }

    @Override public void onConfigurationFailure(ITestResult itr) {
        LogUtils.info('[' + getClass().getSimpleName() + " - onConfigurationFailure] - ITestResult:" + itr.getName());
    }

    @Override public void onConfigurationSkip(ITestResult itr) {
        LogUtils.info('[' + getClass().getSimpleName() + " - onConfigurationSkip] - ITestResult:" + itr.getName());
    }
}
