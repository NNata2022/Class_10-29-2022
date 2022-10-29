package home_assigment_10_09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class A4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zara.com/us");
		driver.manage().window().maximize();
		
		driver.quit();
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1 = new FirefoxDriver();
		driver.get("https://www.zara.com/us/");
		driver1.manage().window().maximize();
		
		driver.quit();
		
		
		

	}

}
