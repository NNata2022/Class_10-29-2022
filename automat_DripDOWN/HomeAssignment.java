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

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeAssignment {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zara.com/us/");
		
		WebElement ownScrenn = driver.findElement(By.cssSelector("div.layout.layout--grid-type-standard.layout--header-overlaps-content.layout-catalog.layout-catalog--full"));
		File source = ownScrenn.getScreenshotAs(OutputType.FILE);
		File destination = new File(System.getProperty("user.dir") + "\\SCRENshots123\\screenshot1.png");
		FileHandler.copy(source, destination);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.com/");
		
		WebElement amzScrenn = driver.findElement(By.xpath("//div[@id = 'gw-ftGr-desktop-hero-5']"));
		File source1 = amzScrenn.getScreenshotAs(OutputType.FILE);
		File destination1 = new File(System.getProperty("user.dir") + "\\SCRENshots123\\screenshot2.png");
		FileHandler.copy(source1, destination1);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.costco.com/");
		
		WebElement costScrenn = driver.findElement(By.xpath("//img[@class = 'img-responsive']"));
		File source2 = costScrenn.getScreenshotAs(OutputType.FILE);
		File destination2 = new File(System.getProperty("user.dir") + "\\SCRENshots123\\screenshot3.png");
		
		FileHandler.copy(source2, destination2);
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.walgreens.com/");
		
		WebElement walScrenn = driver.findElement(By.xpath("//div[@class = 'heading highlight__message-inner']"));
		File source3 = walScrenn.getScreenshotAs(OutputType.FILE);
		File destination3 = new File(System.getProperty("user.dir") + "\\SCRENshots123\\screenshot4.png");
		FileHandler.copy(source3, destination3);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("//https://walmart.com/");
		WebElement walmScrenn = driver.findElement(By.cssSelector("a.absolute.absolute--fill.no-underline"));
		File source4 = walmScrenn.getScreenshotAs(OutputType.FILE);
		File destination4 = new File(System.getProperty("user.dir") + "\\SCRENshots123\\screenshot4.png");
		FileHandler.copy(source4, destination4);
		
		
		
		
	
	}

}
