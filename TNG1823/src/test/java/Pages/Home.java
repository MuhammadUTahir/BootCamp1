package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
public static WebDriver driver;


@FindBy(xpath="//*[@id=\"wizardMainRegionV2\"]/div/ul/li[2]/a/span") WebElement flights;
@FindBy(xpath="//*[@id=\"app-layer-datepicker-flights-departure-arrival-start\"]/div[2]/div/div/div[2]/div/div[1]/table/tbody/tr[3]/td[4]/button") WebElement Going;
@FindBy(xpath="//*[@id=\"d1-btn\"]") WebElement Departing ;
@FindBy(xpath="//@[text()=\"Feb 24, 2023\"]") WebElement Returning;
@FindBy(xpath="//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button") WebElement Search;
@FindBy(xpath="//*[@stid=\"goto-checkout-button\"]") WebElement Checkout ;
@FindBy(xpath="//*[@id=\"firstname[0]\"]") WebElement Firstname ;
@FindBy(xpath="//*[@id=\"lastname[0]\"]") WebElement Middlename;
@FindBy(xpath="//*[@id=\"country_code[0]\"]") WebElement Country ;
@FindBy(xpath="//*[@id=\"phone-number[0]\"]") WebElement Phone ;
@FindBy(xpath="//*[@id=\"preferences\"]/form/fieldset/fieldset/div/fieldset[2]/label[1]") WebElement Gender ;
@FindBy(xpath="//*[@id=\"date_of_birth_month0\"]/option[13]") WebElement Month;
@FindBy(xpath="//*[@id=\"date_of_birth_day[0]\"]/option[9]") WebElement Day ;
@FindBy(xpath="//*[@id=\"date_of_birth_year[0]\"]/option[36]") WebElement Year ;
@FindBy(xpath="//*[@id=\"complete-booking\"]") WebElement Booking;







public Home(WebDriver driver) {
Home.driver=driver;
PageFactory.initElements(driver, this);
}
public void flights_function() {
	
	Actions ob= new Actions(driver);
	ob.moveToElement(flights).build().perform();
	
	
	ob.keyUp(Keys.CONTROL).build().perform();
	
}


public void Going_function() {
	Going.sendKeys("Lahore");
}

public void Departing_function() {
	Departing.click();
}
public void Returning_function() {
	Departing.click();
}

public void Search_function() {
	Search.click();
}

	
	
public void Tabchange_function() {
		
		Actions ob= new Actions(driver);
		ob.keyDown(Keys.CONTROL).build().perform();
	
		
		ob.keyUp(Keys.CONTROL).build().perform();
	}
	


public void Checkout_function() {
	
	Checkout.click();
}

public void Firstname_fynction() {
	Firstname.sendKeys("Muhammad");
}
public void Middlename_function() {
	Middlename.sendKeys("Umair");
}
public void Country_function() {
	Country.sendKeys("United states");
}
public void Phone_function () {
	Phone.sendKeys("123456");
}
public void Month_function() {
	Month.sendKeys("December");
}
public void Day_function() {
	Day.sendKeys("08");
}
public void Year_function() {
	Year.sendKeys("1989");
}
public void Booking_function() {
	Booking.click();}
public void Gender_function() {
	Gender.click();}

}
