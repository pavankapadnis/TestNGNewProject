package Com.TestngFirstDemo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import net.jodah.failsafe.internal.util.Assert;

public class TestNgFirstDemo {
	
	@BeforeMethod
	public void m4() {
		
		System.out.println("This is Before method M4 of TestNgFirstDemo class");
		
	}
	
	@Test
	@Parameters({"myName", "myPass"})
	public void firstTest(String uname, String pass) {
		
		String st = uname; 
		String st1 = pass;
		System.out.println("Username : "+uname+" Password : "+pass);
		//as/sertEquals(st, "TestNg");
		
	}
	
	@Test(priority = -1 , invocationCount = 2)
	public void m1() {
		System.out.println("This is M1");
	}
	
	@Test(enabled = false)
	public void m2() {
		System.out.println("This is M1");
	}
	
	@AfterMethod
	private void m5() {
		
		System.out.println("This is After method M5 of TestNgFirstDemo class");
		
	}
	
}
