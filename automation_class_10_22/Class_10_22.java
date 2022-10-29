package automation_class_10_22;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_10_22 {
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//a[@class = 'login']")).click();
		//driver.findElement(By.xpath(input[@type ='text']).sendKeys("nata22@icloud.com");
		//driver.findElement(By.xpath(button[@class='btn btn-default button button-medium exclusive']);
		driver.findElement(By.xpath("//input[@type ='text']")).sendKeys("nata@icloud.com");
		driver.findElement(By.xpath("//button[@class='btn btn-default button button-medium exclusive']")).click();
		
	

}
