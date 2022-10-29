package class_15oct;

public class Oct15 {

	public static void main(String[] args) {
		String Browser ="Chrome";
		String Browser1 = "FireFox";
		String Browser2= "Edge";
		
		if(Browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
		ChromeDriver WebDriver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		}
		
		else if (Browser1.equals("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		}
		
		else if (Browser2.equals("Edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
        }
		
	 else {
			System.out.println("None of the browser works");
	
		}
	
