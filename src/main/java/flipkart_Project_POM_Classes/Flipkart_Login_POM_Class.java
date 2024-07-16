package flipkart_Project_POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Flipkart_Login_POM_Class
{
	public WebDriver driver;
//	private Select s ;
	private Actions act;
	public Flipkart_Login_POM_Class(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);	
	
	}
 @FindBy(xpath="//a[@href='/account/login?ret=/']")
 private WebElement login_button;
 public void click_Login_Button()
 {
	 login_button.click();
 }

 @FindBy(xpath="//input[@class='r4vIwl BV+Dqf']")
 private WebElement email_Phone_Number_Field;
 public void enter_Email_Phone_Number_Field()
 {
	 email_Phone_Number_Field.sendKeys("trushantmahatkar.hkb@gmail.com");
 }
 @FindBy(xpath="//input[@class='r4vIwl BV+Dqf']")
 private WebElement request_OTP_Button;
 public void click_Request_OTP_Button()
 {
	 request_OTP_Button.click();
 }
 @FindBy(xpath="//button[@class='QqFHMw llMuju M5XAsp']")
 private WebElement verify_button;
 public void click_Verify_Button()
 {
	 verify_button.click();
 }

 @FindBy(xpath="//img[@class='-dOa_b L_FVxe']")
 private WebElement get_username;
 public String get_username()
 {
	 return get_username.getText();	 
 }
 
 
 
 
 
 
 
 
 
 
}


























