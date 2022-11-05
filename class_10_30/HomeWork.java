package class_10_30;

import java.time.Duration;

import org.openga.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeWork {
	public static WebDriver driver;
	
	@BeforeMethod
	public void homework() {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--incognito");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
 		driver.manage().window().maximize();
}
	@Test(priority = 1)
	public void testcase1() {
		Duration driver;
		driver.get("https://www.zara.com/us/");	
		System.out.println("The title of the page is: " + driver.getTitle());
	}
	@Test(priority = 2)
	public void testcase2() {
		ChromeDriver.findElement(By.name("LOG IN")).click();
		System.out.println("Log in was successful; ");
		
	}
	
	@Test(priority = 3)
	public void testcase3() {
		ChromeDriver.findElement(By.name("logonId")).sendKeys("seleniumpanda@rediffmail.com");
	}
	@Test(priority = 4)
	public void testcase4() {
		
	}
	@Test(priority = 5)
	public void testcase5() {
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		
			
	}

	
	
}