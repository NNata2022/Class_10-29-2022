package home_assigment_10_09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class A8 {

	public static void main(String[] args) {
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.walmart.com/");
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver1 = new ChromeDriver();
	driver.get("https://www.walmart.com");
	driver.manage().window().maximize();
	
	driver1.quit();
	driver.quit();
	
	
	
	
	
	
	
	

	}

}
