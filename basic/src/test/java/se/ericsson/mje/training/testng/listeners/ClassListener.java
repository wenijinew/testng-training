package se.ericsson.mje.training.testng.listeners;

import java.io.PrintStream;

import org.testng.IClassListener;
import org.testng.ITestClass;


/**
 *
 */
public class ClassListener implements IClassListener {

    PrintStream out = System.out;

    public void onBeforeClass(ITestClass testClass) {
        out.println("\t\t\t\t\t\t Listener: Before Class - " + testClass.getName());
    }

    public void onAfterClass(ITestClass testClass) {
        out.println("\t\t\t\t\t\t Listener: After Class - " + testClass.getName());
    }

}
