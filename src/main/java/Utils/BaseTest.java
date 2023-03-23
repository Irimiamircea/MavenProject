package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	public WebDriver driver;
	@BeforeClass
	public void setup() {
		ChromeOptions chopt = new ChromeOptions();
		chopt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chopt);
		driver.manage().window().maximize();
		driver.get("https://keybooks.ro/");
	}
	
	
	@AfterClass
	public void tearDown() throws InterruptedException{
		Thread.sleep(5000);
		driver.quit();
	}
}