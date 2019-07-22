package org.testng.forum.i549;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test549 {
	private static final String GROUP_S1 = "S1";

	public Test549() {

	}

	@BeforeMethod(groups = { GROUP_S1 })
	public void beforeTc1() {
		System.out.println("before tc1");
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
