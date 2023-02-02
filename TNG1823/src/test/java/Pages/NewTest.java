package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTest {
public static WebDriver driver;


@FindBy(xpath="//*[@id=\"headerMyAccountTitle\"]/div") WebElement Account;
@FindBy(xpath="//*[@id=\"SPSORegister\"]/a/span") WebElement Creataccount;
@FindBy(xpath="//*[@id=\"single-signin__body\"]/div/div[2]/div/div[2]/div[1]/div/div/div/div[4]/button/span") WebElement Selection;
@FindBy(xpath="//*[@id=\"email\"]") WebElement Email;
@FindBy(xpath="//*[@id=\"password-input-field\"]") WebElement Password;
@FindBy(xpath="//*[@id=\"zipCode\"]") WebElement Zipcode;
@FindBy(xpath="//*[@id=\"phone\"]") WebElement Phone;
@FindBy(xpath="//*[@id=\"single-signin__body\"]/div/div[2]/form/div[5]/div/div/label/span[1]") WebElement Signedin;
@FindBy(xpath="//*[@id=\"single-signin__body\"]/div/div[2]/form/div[6]/div/label/span/span/span[1]") WebElement Verification;
@FindBy(xpath="//*[@id=\"single-signin__body\"]/div/div[2]/form/button/span") WebElement Creatbutton ;




public void HD(WebDriver driver) {
Home.driver=driver;
PageFactory.initElements(driver, this);
}
 public void Account_function() {
	 Actions ob= new Actions(driver);
	 ob.moveToElement(Account).build().perform();
 }
public void Creataccount_function() {
	
	Creataccount.click();
}

public void Selection_function() {
	Selection.click();
}

public void Email_function() {
Email.sendKeys("abc@hotmail.com");
}
public void Password_function() {
	Password.sendKeys("123456");
}
public void Zipcode_function() {
	Zipcode.sendKeys("21223");
}
public void Phone_function() {
	Phone.sendKeys("5566554433");
}
public void Signedin_function() {
	Signedin.click();
}
public void Verification_function() {
	Verification.click();
}
public void Creatbutton_function() {
	Creatbutton.click();
}

















}