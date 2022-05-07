package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class ValidateTittle extends base{
	public WebDriver driver;
@BeforeTest
public void hiturl() throws IOException
{
	driver=intializeDriver();
	driver.get(prop.getProperty("URL"));
	}
	@Test
	public void basePageNavigation() throws IOException
	{
		
		LandingPage l = new LandingPage(driver);
		l.clicknothanks().click();
		Assert.assertEquals(l.getTittle().getText(), "FEATURED COURSES");
}
@AfterTest
public void close()
{
driver.close();	
}}
