package Tests;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import Utils.BaseTest;
import Utils.Log;
import pageObjects.LoginPage;
import pageObjects.MenuPage;

public class LoginTest extends BaseTest {
	
	
	@Parameters({"user", "pass"})
	@Test
	public void loginTest(String username, String password) {   
		
		//assertTrue(false);
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.contactsLink);
		menu.navigateTo(menu.loginLink);
		
		Log.info("Test logging");
		
		LoginPage login = new LoginPage(driver);
		login.loginInApp(username, password);
		
		assertTrue(login.successMsgisDisplayed());
	}
	
	
}
 