package org.testng.training.forum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Runner {
	@Test
	public void run() {
		// create suite
		XmlSuite suite = new XmlSuite();
		suite.setName("Smoke Suite");

		// create test
		XmlTest test = new XmlTest(suite);
		test.setName("Happy path test");

		// create classes
		XmlClass testClass1 = new XmlClass(PaymentTests.class);
		List<XmlInclude> methodsToRun1 = new ArrayList<XmlInclude>();
		List<XmlInclude> methodsToRun2 = new ArrayList<XmlInclude>();
		Map<String, String> parameters = new HashMap<String, String>();

		// create methods and set params for testClass1
		XmlInclude method11 = new XmlInclude("login", 0);
		parameters.put("Username", "RegUser");
		parameters.put("Password", "j2#l7Kcgl");
		method11.setParameters(parameters);
		methodsToRun1.add(method11);

		XmlInclude method12 = new XmlInclude("searchProduct", 1);
		parameters.clear();
		parameters.put("ProductName", "iPhoneX");
		method12.setParameters(parameters);
		methodsToRun1.add(method12);

		XmlInclude method13 = new XmlInclude("checkOut", 2);
		methodsToRun1.add(method13);

		XmlInclude method14 = new XmlInclude("payment", 3);
		methodsToRun1.add(method14);

		XmlInclude method15 = new XmlInclude("logout", 4);
		methodsToRun1.add(method15);

		// set methods for testClass1 i.e PaymentTests
		testClass1.setIncludedMethods(methodsToRun1);

		// add created classes
		List<XmlClass> classes = new ArrayList<XmlClass>();

		classes.add(testClass1);

		XmlClass testClass2 = new XmlClass(AccountTests.class);
		// XmlClass testClass = new XmlClass();
		// testClass.setName(className);

		// create methods and set params for testClass2
		XmlInclude method21 = new XmlInclude("login", 0);
		parameters.put("Username", "ProUser");
		parameters.put("Password", "admin@123");
		method21.setParameters(parameters);
		methodsToRun2.add(method21);

		XmlInclude method22 = new XmlInclude("changePassword", 1);
		parameters.clear();
		parameters.put("CurrentPassword", "admin@123");
		parameters.put("NewPassword", "root@321");
		method22.setParameters(parameters);
		methodsToRun2.add(method22);

		XmlInclude method23 = new XmlInclude("logout", 2);
		methodsToRun2.add(method23);

		// set methods for testClass2 i.e. AccountTests
		testClass2.setIncludedMethods(methodsToRun2);

		classes.add(testClass2);

		// set classes {PaymentTests,AccountTests}
		test.setXmlClasses(classes);

		TestNG testng = new TestNG();
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		testng.setXmlSuites(suites);
		System.out.println(suite.toXml());
		testng.run();
	}

}
