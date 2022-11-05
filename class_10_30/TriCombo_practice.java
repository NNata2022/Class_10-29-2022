package class_10_30;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TriCombo_practice {

	public static ChromeDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("This is BeforeMethos executing");
		
	}
	@Test
	public void testcase1() {
		driver.get("https://google.com");
		System.out.println("Test case Google");
		
	}
	@Test
	public void testcase2() {
		driver.get("https://amazon.com");
		System.out.println("Test case Amazon");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is AfterMethod annotation");
		driver.quit();
		
		
	}
}
