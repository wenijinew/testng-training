package org.testng.forum.i1934;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AccountTests {
	@Parameters({ "Username", "Password" })
	@Test
	public void login(String username, String password) {
		System.out.println(
				"Method: " + "login()" + "\n Login using username: " + username + " with password " + password);
	}

	@Parameters({ "CurrentPassword", "NewPassword" })
	@Test
	public void changePassword(String oldPass, String newPass) {
		System.out.println("Method: " + "changePassword()" + "\n Updated the new password as " + newPass);
	}

	@Test
	public void logout() {
		System.out.println("Method: " + "logout()" + "\n Logged out successfully");
	}
}
