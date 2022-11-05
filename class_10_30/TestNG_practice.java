package class_10_30;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_practice {
	public static ChromeDriver driver;
	
	
	@BeforeTest
	public void launchBrowser() {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	} 
	
	@Test
	public void setUp() {
		System.out.println("Hello Java");
		driver.get("https://rediff.com");
		System.out.println("The title of the page is: " + driver.getTitle());
		
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
		
	}

}
