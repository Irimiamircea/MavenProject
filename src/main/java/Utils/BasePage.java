package Utils;

import pageObjects.ContactPage;
import pageObjects.MenuPage;
import pageObjects.ShopPage;

public class BasePage extends BaseTest {
	
	public MenuPage menu = new MenuPage(driver);
	public ShopPage shop = new ShopPage(driver);
	public ContactPage contact = new ContactPage(driver);
	

}
