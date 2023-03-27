package curs11;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class JSAlertExample extends BaseTest{
	
	@Test
	public void simpleJSalert() throws InterruptedException {
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.cssSelector("button[onclick*='jsAlert()']")).click();
		
		Thread.sleep(3000);
		
		//driver.switchTo().alert().accept(); -varianta scurta
		Alert alertJS = driver.switchTo().alert();  // -varianta lunga
		alertJS.accept();
		
		WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
		assertEquals(result.getText(), "You successfully clicked an alert");
	}
	

}
