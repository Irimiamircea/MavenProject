package Utils;

import java.time.Duration;

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://keybooks.ro/");
	}
	
	
	@AfterClass
	public void tearDown() throws InterruptedException{
		Thread.sleep(5000);
		driver.quit();
	}
}