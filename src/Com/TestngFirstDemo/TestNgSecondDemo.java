package Com.TestngFirstDemo;

import org.checkerframework.checker.units.qual.m2;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgSecondDemo {
	
	@BeforeSuite
	public void m6() {
		
		int x =10;
		System.out.println("This is Before Suite m6");
		
	}
	
	@BeforeTest
	public void BeforeTestDemo() {
		
		System.out.println("This is BeforeTestDemo");
		
	}
	 
	@BeforeMethod
	public void m1() {
		
		System.out.println("This is Before method M1");
		
	}
	
	@Test
	public void m2() {
		
		System.out.println("This is Test One M2");
		
	}
	
	@Test 
	public void m3() {
		
		System.out.println("This is Test Two m3");
		
	}
	
	/*
	@Test
	public void m5() {
		
		TestNgFirstDemo td1 =  new TestNgFirstDemo();
		td1.firstTest();
		
	}
	*/
	
	@AfterMethod
	public void m4() {
		
		System.out.println("This is After Method M4");
		
	}
	
	@AfterTest
	public void AfterTestDemo() {
		
		System.out.println("This is After Test Demo");
		
	}
	
	@AfterSuite
	public void m7() {
		
		System.out.println("This is After Suite m7");
		
	}
	
}
