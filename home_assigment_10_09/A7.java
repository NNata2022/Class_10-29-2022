package home_assigment_10_09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class A7 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		driver.quit();
		driver2.quit();
		
		
		
		
		

	}

}
