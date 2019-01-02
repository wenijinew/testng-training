/**
 * 
 */
package org.testng.training;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.training.listeners.ClassListener;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

/**
 * @author egugwen
 *
 */
public class TestNgRunner {

    /**
     * 
     */
    public TestNgRunner() {
        // TODO Auto-generated constructor stub
    }

    void run() {
        TestNG testng = new TestNG();

        // tell what to run
        testng.setTestClasses(new Class[] { CalculatorTestLevel1.class });

        // set listeners
        testng.addListener(new ClassListener());

        testng.run();
    }

    void runXmlSuite() {
        TestNG testng = new TestNG();

        XmlSuite suite = new XmlSuite();
        suite.setName("CalculatorSuite");

        XmlTest test = new XmlTest(suite);
        test.setName("CalculatorTestLevel1 Test");
        List<XmlClass> classes = new ArrayList<XmlClass>();
        classes.add(new XmlClass("org.testng.training.CalculatorTestLevel1"));
        test.setXmlClasses(classes);

        // set test suite
        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);
        testng.setXmlSuites(suites);

        testng.run();
    }

    public static void main(String[] strs) {
        TestNgRunner runner = new TestNgRunner();
        runner.run();
        runner.runXmlSuite();
    }
}
