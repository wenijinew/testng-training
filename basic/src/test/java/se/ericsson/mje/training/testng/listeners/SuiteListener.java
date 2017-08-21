package se.ericsson.mje.training.testng.listeners;

import java.io.PrintStream;

import org.testng.ISuite;
import org.testng.ISuiteListener;


/**
 *
 */
public class SuiteListener implements ISuiteListener {

    PrintStream out = System.out;

    public void onStart(ISuite suite) {
        out.println("\t\t Listener: Suite Start - " + suite.getName());
    }

    public void onFinish(ISuite suite) {
        out.println("\t\t Listener: Suite Finish - " + suite.getName());
    }

}
