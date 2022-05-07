package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	public WebDriver driver;
	@BeforeTest
	public void hiturl() throws IOException
	{
		driver=intializeDriver();
		
		}
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username,String Password,String text) throws IOException
	{
		driver.get(prop.getProperty("URL"));
		LandingPage l = new LandingPage(driver);
		l.clicknothanks().click();
		l.getLogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.getemail().sendKeys(Username);
		lp.getpassword().sendKeys(Password);
		lp.getlogin().click();
		System.out.println(text);
	}
	@AfterTest
	public void close()
	{
	driver.close();	
	}

	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[1][3];
		data[0][0]="nonrestricteduser@gmail.com";
		data[0][1]="123456";
		data[0][2]="Restricted User";
		return data;
	}
}
