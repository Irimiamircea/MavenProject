package curs12;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class ImplicitWait extends BaseTest {
	
	@Test
	public void testWait() throws InterruptedException {
		//in linkul de mai jos, elementul exista in pagina si este hidden,
		//astfel Implicit wait il gaseste si nu se activeaza(nu asteapta)
		//driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		//in linkul de mai jos, elementul NU exista in pagina ,
		//astfel Implicit wait nu il gaseste si se activeaza(nu asteapta)
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
				
		//Implicit wait - nu vede elementele ascunse, doar pe cele care apar noi
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("div[id='start']>button")).click();
		//Thread.sleep(10000);   //bad practice
		
		WebElement finish = driver.findElement(By.cssSelector("div[id='finish']>h4"));
		assertEquals(finish.getText(), "Hello World!");
	}
	
	
	

}
