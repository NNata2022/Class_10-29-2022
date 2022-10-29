package automat_DripDOWN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWINDOW {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://google.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://amazon.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://costco.com");
		
		openWindow();
		
		driver.quit();
		
	}
	static void openWindow() {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://easymytrip.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://rediff.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://facebook.com");
		
		driver.quit();
		
	}

}
