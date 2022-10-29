package home_assigment_10_09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class A2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driverl = new FirefoxDriver();
		driverl.manage().window().maximize();
		driverl.get("https://www.amazon.com/");
		
		driver.quit();
		driverl.quit();
		
		
		

	}

}
