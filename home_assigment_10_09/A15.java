package home_assigment_10_09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A15 {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://athleta.gap.com");
	driver.manage().window().maximize();
	

	
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver1 = new FirefoxDriver();
	driver1.get("https://athleta.gap.com");
	driver1.manage().window().maximize();
	
	driver1.quit();
	driver.quit();
	
	

	}

}
