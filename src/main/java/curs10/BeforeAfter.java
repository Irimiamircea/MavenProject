package curs10;

import org.testng.annotations.*;


public class BeforeAfter {
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	//@BeforeTest ---> se refera la tagul TEST din testing.xml (nu se realizeaza dupa @Test)
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@BeforeMethod       //se executa inainte de fiecare @Test
	public void beforeMethod(){
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
}
