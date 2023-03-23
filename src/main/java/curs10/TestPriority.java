package curs10;

import org.testng.annotations.Test;

public class TestPriority {

	
	@Test (priority = 0)
	public void one() {
		System.out.println("1");
	}
	@Test (priority = 1)
	public void two() {
		System.out.println("2");
	}
	@Test (priority = 2)
	public void three() {
		System.out.println("3");
	}
	//daca nu e pus priority se v-a executa cele fara priority in ordine alfabetica apoi cele cu priority in ordine
	@Test 
	public void four() {    
		System.out.println("4");
	}
	@Test 
	public void five() {
		System.out.println("3");
	}
}
