package automation_code_Nata;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Understanding_WebElements {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.rediff.com/");
	
	driver.findElement(By.className("signin")).click();
	driver.findElement(By.id("login")).sendKeys("seleniumppanda@rediffmail.com");
	
	
	
	

	}

}
