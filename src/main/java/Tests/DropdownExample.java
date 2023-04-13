package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utils.BaseTest;
import Utils.TestNgListener;
import pageObjects.MenuPage;
import pageObjects.ShopPage;

@Listeners(TestNgListener.class)
public class DropdownExample extends BaseTest {
	
	
	@Test
	public void selectByValueTest() {
		MenuPage menu = new MenuPage(driver);  //intram pe menu
		ShopPage shop = new ShopPage(driver);  // intram pe shop
		
		menu.navigateTo(menu.shopLink); //construim logica
		shop.selectByValue("price");
		assertEquals(shop.getSelectedOption(), "Sort by price: low to high");
	}
	
	@Test
	public void selectByIndex() {
		MenuPage menu = new MenuPage(driver);  //intram pe menu
		ShopPage shop = new ShopPage(driver);  // intram pe shop
		
		menu.navigateTo(menu.shopLink);
		shop.selectByIndex(3);
		assertEquals(shop.getSelectedOption(), "Sort by latest");
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/?orderby=date");
	}
	@Test
	public void selectByVisibleText() {
		MenuPage menu = new MenuPage(driver);  //intram pe menu
		ShopPage shop = new ShopPage(driver);  // intram pe shop
		
		menu.navigateTo(menu.shopLink);
		shop.selectByVisibleText("Sort by popularity");
	}
}
