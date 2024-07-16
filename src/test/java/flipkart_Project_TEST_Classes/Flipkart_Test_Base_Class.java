package flipkart_Project_TEST_Classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import flipkart_Project_POM_Classes.Flipkart_Login_POM_Class;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_Test_Base_Class 
{
	public WebDriver driver;
	public void setup() throws InterruptedException
	{
		try
		{
//			WebDriverManager.chromedriver().setup();
			 System.setProperty("webdriver.chrome.driver","D:\\Users\\trushantmahatkar\\Downloads\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
			driver.get("https://www.flipkart.com");	
			Flipkart_Login_POM_Class flp = new Flipkart_Login_POM_Class(driver);
			flp.click_Login_Button();
			flp.enter_Email_Phone_Number_Field();
			flp.click_Request_OTP_Button();
			Thread.sleep(12000);
			flp.click_Verify_Button();
		}
		catch(Exception e)
		{
			System.out.println("Give Exception Message"+ e.getMessage());
		}
		
	}
	public void teardown()
	{
	driver.quit();	
	}
}
