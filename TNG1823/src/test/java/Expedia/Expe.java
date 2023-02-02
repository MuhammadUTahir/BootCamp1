package Expedia;

import org.testng.annotations.Test;

import Pages.Home;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Expe {
  
	public static WebDriver driver;
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\areeb\\eclipse-workspace\\TNG1823\\Drivernew\\chromedriver.exe");
		driver=new ChromeDriver();  // opening browser	
		
		driver.get("https://www.expedia.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
	  
	  
	  
	  
  }
  
  
  @Test
  public void f() {
	  Home ob =new Home(driver);
	  ob.flights_function();
	  
	  ob.Going_function();
	  ob.Departing_function();
	  ob.Returning_function();
	  ob.Search_function(); 
	  ob.Checkout_function();
	  ob.Firstname_fynction();
	  ob.Middlename_function();
	  ob.Country_function();
	  ob.Phone_function();
	  ob.Gender_function();
	  ob.Month_function();
	  ob.Day_function();
	  ob.Year_function();
	  ob.Booking_function();
	  
	  
	  
	  
  }
  

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
