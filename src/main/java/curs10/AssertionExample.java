package curs10;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class AssertionExample {
	
	String expectedTitle = "Test";
	String actualTitle = "Altceva";
	
	@Test
	public void checkTitle() {
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Test is passed");
		} else {
			System.out.println("Test is failled");
		}
	}
	@Test
	public void checkTitle2() {
		assertEquals(expectedTitle, actualTitle);
	}
}
