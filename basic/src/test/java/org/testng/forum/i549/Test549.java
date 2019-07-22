package org.testng.forum.i549;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test549 {
	private static final String GROUP_S1 = "S1";

	public Test549() {

	}

	@BeforeMethod(onlyForGroups = { GROUP_S1 })
	public void beforeTc1() {
		System.out.println("before tc1");
	}

	@AfterMethod(onlyForGroups = { GROUP_S1 })
	public void afterTc1() {
		System.out.println("after tc1");
	}

	@BeforeMethod(groups = { GROUP_S1 })
	public void beforeAny() {
		System.out.println("before any (more like a bug)");
	}

	@AfterMethod(groups = { GROUP_S1 })
	public void afterAny() {
		System.out.println("after any (more like a bug)");
	}

	@BeforeMethod
	public void beforeAnyDefault() {
		System.out.println("before any");
	}

	@AfterMethod
	public void afterAnyDefault() {
		System.out.println("after any");
	}

	@Test(groups = { GROUP_S1 })
	public void testTc1() {
		System.out.println("tc1");
	}

	@Test
	public void testTc2() {
		System.out.println("tc2");
	}
}
