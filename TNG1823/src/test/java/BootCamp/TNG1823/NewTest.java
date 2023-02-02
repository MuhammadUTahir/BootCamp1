package BootCamp.TNG1823;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static WebDriver driver;
	  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\areeb\\eclipse-workspace\\TNG1823\\Drivernew\\chromedriver.exe");
		driver=new ChromeDriver();  // opening browser	
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
  }
  
  
  @Test
  public void test1() {
	  System.out.println("this is test 1");
  }
  
  @Test
  public void test2() {
	  System.out.println("this is test 2");
  }
  


  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
