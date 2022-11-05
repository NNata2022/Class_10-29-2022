package class_10_30;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest  ;
import org.testng.annotations.Test;

public class LearningTestNG {
	
	
	@BeforeSuite
	
	public void beforeSuite() {
		System.out.println("Testing @BeforeSuite annotation");
	}
	@BeforeTest
	
	public void beforeTest() {
		System.out.println("Testing @BeforeTest annotation");
	}
	
	@BeforeClass
	
	public void beforeClass() {
			System.out.println("Testing @BeforeClass annotation");
		}
	@BeforeMethod
	
	public void beforeMethod() {
		System.out.println("Testing @BeforeMethod annotation");
		  
	}
	 @Test
	 public void testcase() {
		 System.out.println("My test is workin fine");
		 
		 
	 }
	 @AfterSuite
	 public void afterSuite() {
		 System.out.println("Testing @AfterSuite annotation");
		 
		 
	 }
	 @AfterTest
	 public void afterTest() {
		 System.out.println("Testing @AfterTest annotation");
		 
	 }
	 @AfterClass
	 public void afterClass() {
		 System.out.println("Testing @AfterClass annotation");
	 }
	 @AfterMethod
	 public void beforemethod() {
		 System.out.println("Testing @AfterMethod annotation");
		 
		 
	 }
	 

}
