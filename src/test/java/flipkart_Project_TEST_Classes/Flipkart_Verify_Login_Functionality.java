package flipkart_Project_TEST_Classes;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import flipkart_Project_POM_Classes.Flipkart_Login_POM_Class;

public class Flipkart_Verify_Login_Functionality extends Flipkart_Test_Base_Class
{
	public SoftAssert soft;
	@Test
	public void verify_Login_Functionality()
	{
		try 
		{
			Flipkart_Login_POM_Class fp = new Flipkart_Login_POM_Class(driver);
			soft= new SoftAssert();
			String required = fp.get_username();
			soft.assertEquals(required,"Trushant");
			soft.assertAll();
		}
		catch(Exception e) 
		{
			System.out.println("message");
            System.out.println("InterruptedException occurred: " + e.getMessage());
        }
		
		
	}
}
