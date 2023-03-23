package Curs9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstScript {
	public WebDriver driver;
	@BeforeClass
	public void setup() {
		ChromeOptions chopt = new ChromeOptions();
		chopt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chopt);
	}
	
	
	@Test
	public void openBrowser() throws InterruptedException {
		
		driver.get("https://keybooks.ro/");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(4000);
		
	
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
