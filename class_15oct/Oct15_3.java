package class_15oct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Oct15_3 {

	public static void main(String[] args) {
	
		
		String Browser ="Chrome";
		String Browser1 ="FireFox";
		String Browser2="Edge";
	
		if(Browser.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		}
		
	   else if(Browser1.equals("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
	   }
	
      else if(Browser2.equals("Edge")) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
      }
		
     else {
			System.out.println("None of the browser works");
			}
			
		
		
		
		

	}

}
