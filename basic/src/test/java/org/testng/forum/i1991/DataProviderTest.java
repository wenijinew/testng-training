package org.testng.forum.i1991;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.Version;

public class DataProviderTest {
	static {
		System.out.println("TestNG:" + Version.VERSION);
	}
	private String skippedColor;

	public DataProviderTest() {
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod(Object[] objs) {
		if (objs != null && objs.length > 0) {
			skippedColor = System.getProperty("SkippedColor");
			String currentColor = objs[0].toString();
			try {
				if (currentColor.equals(skippedColor)) {
					throw new SkipException("BeforeMethod: Skip Color:" + skippedColor);
				}
			} catch (SkipException se) {
				se.printStackTrace();
				throw se;
			}
			System.out.println("BeforeMethod: Not Skipped Color:" + currentColor);
		}
	}

	@Test(dataProvider = "colors")
	public void show(String color) {
		System.out.println("Test Method: show(String color): " + color + " -> " + this.getClass() + "'s instance:"
				+ this.hashCode());
		try {
			Assert.assertNotEquals(color, skippedColor);
		} catch (AssertionError ae) {
			ae.printStackTrace();
			System.err.println("Is this TestNg bug?");
		}
	}

	@DataProvider(name = "colors")
	public Object[][] get() {
		return new String[][] { { "Red" }, { "White" }, { "Black" } };
	}
}
