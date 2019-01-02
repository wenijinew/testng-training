package org.testng.forum;

import org.testng.TestNG;

public class RunTestNg {

	public RunTestNg() {
	}

	public static void main(String[] strs) {
		String[] colors = { "Red", "White", "Black" };
		for (String color : colors) {
			System.setProperty("SkippedColor", color);
			try {
				TestNG testng = TestNG.privateMain(strs, null);
				testng.getStatus();
			} catch (Exception e) {
				// do nothing
			}
		}
	}
}
