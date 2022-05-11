package Com.ActualTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActualTestCaseInTestNG {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setProMethod() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\A_java\\Jar Files\\chromedriver.exe");
		
	}
	
	@BeforeMethod
	public void openBrowser() {
		
		driver = new ChromeDriver();
		
		driver.get("file:///F:/Selenium%20Html/ExcelSheetValueInForm.html");
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void enterData() throws InterruptedException {
		
		driver.findElement(By.cssSelector("input#fname")).sendKeys("Pavan");
		
		driver.findElement(By.cssSelector("input#lname")).sendKeys("Kapadnis");
		
		driver.findElement(By.cssSelector("input#male")).click();
		
		driver.findElement(By.cssSelector("input#male")).click();
		
		WebElement selcont = driver.findElement(By.cssSelector("select#country"));
		
		Select sel = new Select(selcont);
		
		sel.selectByVisibleText("India");
		
		driver.findElement(By.cssSelector("input#age")).sendKeys("28");
		
		driver.findElement(By.cssSelector("input#date")).sendKeys("09/03/1994");
		
		driver.findElement(By.cssSelector("input#emid")).sendKeys("pavankapadnis@gmail.com");
		
		driver.findElement(By.cssSelector("input#myFile")).sendKeys("F:\\FB_IMG_1596948781867.jpg");
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[type='reset']")).click();
		
	}
	
	@Test
	public void enterDataSecond() throws InterruptedException {
		
		driver.findElement(By.cssSelector("input#fname")).sendKeys("Pavan");
		
		driver.findElement(By.cssSelector("input#lname")).sendKeys("Kapadnis");
		
		driver.findElement(By.cssSelector("input#male")).click();
		
		driver.findElement(By.cssSelector("input#male")).click();
		
		WebElement selcont = driver.findElement(By.cssSelector("select#country"));
		
		Select sel = new Select(selcont);
		
		sel.selectByVisibleText("India");
		
		driver.findElement(By.cssSelector("input#age")).sendKeys("28");
		
		driver.findElement(By.cssSelector("input#date")).sendKeys("09/03/1994");
		
		driver.findElement(By.cssSelector("input#emid")).sendKeys("pavankapadnis@gmail.com");
		
		driver.findElement(By.cssSelector("input#myFile")).sendKeys("F:\\FB_IMG_1596948781867.jpg");
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[type='reset']")).click();
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
}
