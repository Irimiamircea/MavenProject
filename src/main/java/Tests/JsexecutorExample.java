package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class JsexecutorExample extends BaseTest{
	
	//@Test
	public void manageBrowserPage() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.location = 'http://emag.ro'");
		jse.executeScript("window.history.go(-1)");
	}
	
	@Test
	public void jsScroll() throws InterruptedException {
		JavascriptExecutor jse =  (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 1000)");
		
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		
		WebElement signUpButton = driver.findElement(By.cssSelector("input[value='Sign up']"));
		jse.executeScript("arguments[0].scrollIntoView", signUpButton);   //arguments[0] e indexul 
		Actions action = new Actions(driver);
		action.moveToElement(signUpButton).perform();
		
		
	}
	
	@Test
	public void jsExample()	{
		WebElement searchIcon = driver.findElement(app.menu.searchIcon);
		WebElement searchField = driver.findElement(app.menu.searchField);
		
		JavascriptExecutor jse =  (JavascriptExecutor) driver;
		
		//1. click
		
		jse.executeScript("arguments[0].click()", searchIcon);
		
		//2. sendkeys
		
		jse.executeScript("arguments[0].value='cooking'", searchField);
		jse.executeScript("arguments[0].click()", searchIcon);

	}

}
