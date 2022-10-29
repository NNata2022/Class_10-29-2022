package automat_DripDOWN;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.openweathermap.org/");
		
		WebElement ownScreen = driver.findElement(By.cssSelector("div.section.where-to"));
		File source = ownScreen.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir")+ "\\AUTOMATION_BATCH\\screenshots\\screenshot1.pnq");
	
		FileHandler.copy(source,destination);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.shaadi.com/lets-begin/usa?ptnr=usshdbrnd7060&gclid=Cj0KCQjwnvOaBhDTARIsAJf8eVPBJ2R4lBbHCmdgKf6qg9fQ7Og54RffTSZkLDLi92OYje97GZ31hZoaAhpiEALw_wcB");
		
		WebElement shaadiBanner = driver.findElement(By.cssSelector("css-1q8sggn"));
		File source1 = shaadiBanner.getScreenshotAs(OutputType.FILE);
		File destination1 = new File(System.getProperty("user.dir")+ "\\\\AUTOMATION_BATCH\\\\screenshots\\\\screenshot2.pnq");
		
		FileHandler.copy(source1, destination1);
		
		
		//class -css-1q8sggn
		
		//C:\Users\Owner\eclipse-workspace\AUTOMATION_BATCH\screenshots
          

	}

}
