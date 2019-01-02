package org.testng.training.listeners;

import java.io.PrintStream;

import org.testng.IConfigurationListener;
import org.testng.ITestResult;


/**
 *
 */
public class ConfigurationListener implements IConfigurationListener {

   PrintStream out = System.out;

   public void onConfigurationSuccess(ITestResult itr) {
        out.println("Listener: Configuration Success -" + itr.getName());
   }

   public void onConfigurationFailure(ITestResult itr) {
        out.println("Listener: Configuration Failure -" + itr.getName());
   }

   public void onConfigurationSkip(ITestResult itr) {
        out.println("Listener: Configuration Skip -" + itr.getName());
   }

}
