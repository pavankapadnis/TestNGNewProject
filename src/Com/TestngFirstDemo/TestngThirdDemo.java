package Com.TestngFirstDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngThirdDemo {

	@BeforeMethod
	public void tdemo1() {

		System.out.println("Before Method tdemo1");
		
	}
	
	@Test
	public void tdemo2() {
		
		System.out.println("Test tdemo2");
		
	}
		
	@BeforeTest
	public void tdemo3() {
		System.out.println("Before Test tdemo3");
	}
	
	@Test(priority = -1)
	public void tdemo4() {
		System.out.println("Test tdemo4");
	}
								
	@AfterMethod
	public void tdemo5() {
		System.out.println("After Method tdemo5");
	}

}
