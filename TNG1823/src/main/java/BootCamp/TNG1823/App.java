package BootCamp.TNG1823;

import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver..driver", "C:\\Users\\areeb\\eclipse-workspace\\BootCamp23\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();  
		driver.get("https://www.instagram.com/"); 
		
		 driver.manage().window().maximize();
		 
		 Thread.sleep(5000);
		  
		driver.close();
    }
}
