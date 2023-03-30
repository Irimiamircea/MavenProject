package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {

	public WebDriver driver;
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//locatori - am construit un locator
	public By loginLink =  By.linkText("Login");
	public By contactsLink = By.linkText("CONTACTS");
	
	//driver.findElement(By.linkText("Login")).click();
	//   identificare element                 + actiune pe element
	//metoda find element + locator (By.linkText("Login"))
	//driver.findElement(locator) ==> locator == loginLink ==> driver.findElement(loginLink)

	public void navigateTo(By locator) {
		driver.findElement(locator).click();
		
		//MenuPage = new MenuPage(driver;
		//menu.navigateTo(menu.loginLink);
		//menu.navigateTo(menu.contactsLink);
	}
}
