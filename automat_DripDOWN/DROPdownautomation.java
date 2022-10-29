package automat_DripDOWN;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DROPdownautomation {

	public static WebDriver driver;
	public static ChromeOptions options;
	
	public static void main(String[] args) {
	options = new ChromeOptions();
	options.addArguments("--incognito");
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//div[@id = 'reg_pager_msg']/preceding::a[1]")).click();

	WebElement firstname = driver.findElement(By.xpath("//input[@name = 'firstname']"));
	WebElement lastname = driver.findElement(By.xpath("//input[@name = 'lastname']"));
	firstname.sendKeys("Nata");
	lastname.sendKeys("Ukraine");
	
	
	//WebElement emailmobile = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
	//emailmobile.sendKeys("nata@gmail.com");
	//WebElement resendemailmobile = driver.findElement(By.xpath("//*[@name ='reg_email_confirmation__']"));
	//resendemailmobile.sendKeys("nata@gmail.com");
	

	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//WebElement newpassword = driver.findElement(By.xpath("//input[@id = 'password_step_input']"));
	//newpassword.sendKeys("NN159357");
	
	//select  = new Select(driver.findElement(By.id("month")));
	//select.selectByVisibleText("September");
	
	//select  = new Select(driver.findElement(By.id("day")));
	//select.selectByVisibleText("25");
	//select  = new Select(driver.findElement(By.id("year")));
	//select.selectByVisibleText("1990");
	
	
	
		

	}

}
