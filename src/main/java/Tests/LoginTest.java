package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;


import Utils.BaseTest;
import pageObjects.LoginPage;
import pageObjects.MenuPage;

public class LoginTest extends BaseTest {

	@Test
	public void loginTest() {
		
		//assertTrue(false);
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.contactsLink);
		menu.navigateTo(menu.loginLink);
		
		LoginPage login = new LoginPage(driver);
		login.loginInApp("TestUser1", "12345@67890");
		
		assertTrue(login.successMsgisDisplayed());
	}
	
	
}
 