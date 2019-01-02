package org.testng.training.forum;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentTests {
	@Parameters({ "Username", "Password" })
	@Test
	public void login(String username, String password) {
		System.out.println("Method: "+"login()"+"\n Login using username: " + username + " with password " + password);
	}

	@Parameters({ "ProductName" })
	@Test
	public void searchProduct(String name) {
		System.out.println("Method: "+"searchProduct()"+"\n Search product: " + name);
	}

	@Test
	public void checkOut() {
		System.out.println("Method: "+"checkOut()"+"\n Product checked out");
	}

	@Test
	public void payment() {
		System.out.println("Method: "+"payment()"+"\n Payment successful");
	}
	@Test
	public void logout() {
		System.out.println("Method: "+"logout()"+"\n Logged out successfully");
	}
}
