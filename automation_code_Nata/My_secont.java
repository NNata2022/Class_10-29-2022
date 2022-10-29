package automation_code_Nata;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class My_secont {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://app.grammarly.com");
		driver1.manage().window().maximize();
		
		
		driver1.quit();
		driver.quit();
		
	    
		
		
		
		

	}

}
