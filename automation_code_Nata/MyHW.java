package automation_code_Nata;

import org.openga.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyHW {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();

	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver driver1 = new FirefoxDriver();
	driver.get("https://oldnavy.gap.com/");
	
	
	
	}

}
