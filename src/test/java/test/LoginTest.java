package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pages.LoginPage;
import base.BaseTests;

public class LoginTest extends BaseTests {
	
	@Test
	public void verifySuccessfulLogin() {
		LoginPage loginPage = new LoginPage(driver);
		assertEquals(loginPage.login("jamfinn@gmail.com", "Hatchet25!").getTitle(), "Let's Shop");
		System.out.println("Howya Bob");
	}

}
