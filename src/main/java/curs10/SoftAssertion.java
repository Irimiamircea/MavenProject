package curs10;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test
	public void softAssertion() {
		
		System.out.println("Soft Assert start");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(false);
		System.out.println("Soft Assert continues");
		sa.assertEquals(10, 16);
		sa.assertEquals("Text", "Nimic");
		System.out.println("Soft Assert stop");
		sa.assertAll();   //fara assertAll nu executa celelalte asserturi
	}
	
	
	@Test
	public void hardAssertion() {
		System.out.println("hard Assert start");
		
		assertTrue(false);
		System.out.println("hard Assert continues");
		assertEquals(10, 16);
		assertEquals("Text", "Nimic");
		System.out.println("Softhard");
		
	}
	
	
	

}
