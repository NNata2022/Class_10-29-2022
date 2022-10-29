package home_assigment_10_09;

import org.openqa.selenium.WebDriver;
import org.openga.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class A10 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver1 = (WebDriver) new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.nordstrom.com");
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nordstrom.com");
		
		driver1.quit();
		driver.quit();
		
		
		
		

	}

}
