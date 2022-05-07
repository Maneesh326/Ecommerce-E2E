package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By nothanks = By.cssSelector("body > div:nth-child(36) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(2) > div:nth-child(1) > div:nth-child(7) > div:nth-child(1) > div:nth-child(1) > button:nth-child(1)");
	By tittle=By.cssSelector("div[class='text-center'] h2");
	By navigationbar=By.cssSelector(".navbar-collapse.collapse");
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
public WebElement clicknothanks()
{
return driver.findElement(nothanks);
}
public WebElement getTittle()
{
return driver.findElement(tittle);	
}
public WebElement getnavigationbar()
{
return driver.findElement(navigationbar);	
}
}
