package se.ericsson.mje.training.testng.listeners;

import java.io.PrintStream;

import org.testng.IConfigurationListener;
import org.testng.ITestResult;


/**
 *
 */
public class ConfigurationListener implements IConfigurationListener {

   PrintStream out = System.out;

   public void onConfigurationSuccess(ITestResult itr) {
       out.println("\t\t\t\t\t Listener: Configuration Success -" + itr.getName());
   }

   public void onConfigurationFailure(ITestResult itr) {
       out.println("\t\t\t\t\t Listener: Configuration Failure -" + itr.getName());
   }

   public void onConfigurationSkip(ITestResult itr) {
       out.println("\t\t\t\t\t Listener: Configuration Skip -" + itr.getName());
   }

}
