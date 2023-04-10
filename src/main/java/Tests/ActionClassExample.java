package Tests;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utils.BaseTest;
import pageObjects.ContactPage;
import pageObjects.MenuPage;
import pageObjects.PostFormatsPage;
import pageObjects.ShopPage;

public class ActionClassExample extends BaseTest{

	//@Test(priority = 1)
	public void dragAndDropTest() {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
		ShopPage shop = new ShopPage(driver);
		shop.dragAndDrop(shop.sliderInitialPosition, 100, 0);
		shop.dragAndDrop(shop.sliderFinalPosition, -100, 0);
	}
	//@Test(priority = 2)
	public void hoverExample() {
		MenuPage menu = new MenuPage(driver);
		menu.hoverElement(menu.blogLink);
		menu.hoverElement(menu.postFormatsLink);
		menu.navigateTo(menu.postFormatsLink);
	}
	//@Test(priority = 3)
	public void sendKeysExample() {
		PostFormatsPage postFormat = new PostFormatsPage(driver);
		WebElement searchField = driver.findElement(postFormat.searchField);
		Actions action = new Actions(driver);
		action.moveToElement(searchField)
				.keyDown(Keys.SHIFT)
				.sendKeys(searchField,"abracadabra")
				.perform();
	}
	
	//@Test
	public void sendKeysExample2() throws InterruptedException {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.contactsLink);
		ContactPage contactPage = new ContactPage(driver);
		
		WebElement nameFiled = driver.findElement(contactPage.nameFiled);
		Actions action = new Actions(driver);
		action
			.moveToElement(nameFiled)
			.sendKeys(nameFiled, "Nume")
			.sendKeys(Keys.TAB, "email@email.com")
			.sendKeys(Keys.TAB, "My subject")
			.sendKeys(Keys.TAB, "My message")
			.sendKeys(Keys.TAB, Keys.ENTER)
			.perform();
		Thread.sleep(4000);
	}
	
	@Test
	public void doubleClickExample() throws InterruptedException {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		ShopPage shop = new ShopPage(driver);
		
		
		WebElement addToCart = driver.findElement(shop.addToCartButton);
		
		Actions action = new Actions(driver);
		
		action.doubleClick(addToCart).perform();
		Thread.sleep(4000);
	}
	
}
