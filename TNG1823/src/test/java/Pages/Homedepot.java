package Pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Homedepot {
	public static WebDriver driver;
	private NewTest ob;
	  
	
 
  @BeforeTest
  @Parameters({"url","brow"})
  public void beforeTest(String url, String brow) throws InterruptedException {
	  
	 
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\areeb\\eclipse-workspace\\TNG1823\\Drivernew\\chromedriver.exe");
			driver=new ChromeDriver();  // opening browser	
			
			driver.get(url);
			
			driver.manage().window().maximize();
			Thread.sleep(5000);
		  
  }

  
  @Test
  public void f() {
	  
	  ob = new NewTest();
	  ob.Account_function();
	  ob.Creataccount_function();
	  ob.Selection_function();
	  ob.Email_function();
	  ob.Password_function();
	  ob.Phone_function();
	  ob.Zipcode_function();
	  ob.Selection_function();
	  ob.Verification_function();
	  ob.Creataccount_function();
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  @AfterTest
  public void afterTest() {
  }

}
