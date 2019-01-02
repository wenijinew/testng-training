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
	public void beforeMethod(Object[] obs) {
		skippedColor = System.getProperty("SkippedColor");
		String currentColor = obs[0].toString();
		try {
			if (currentColor.equals(skippedColor)) {
				throw new SkipException("Skip:" + skippedColor);
			}
		} catch (SkipException se) {
			se.printStackTrace();
			throw se;
		}
	}

	@Test(dataProvider = "colors")
	public void show(String color) {
		try {
			Assert.assertNotEquals(color, skippedColor);
		} catch (AssertionError ae) {
			ae.printStackTrace();
			System.err.println("Is this TestNg bug?");
		}
		System.out.println(color + " -> " + this.getClass() + "'s instance:" + this.hashCode());
	}

	@DataProvider(name = "colors")
	public Object[][] get() {
		return new String[][] { { "Red" }, { "White" }, { "Black" } };
	}
}
