package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common.driver;

public class LoginPage 
{
	static WebElement username,password;
	public WebElement LoginpanelUserName() 
	{
		return username = driver.driver.findElement(By.id("txtUsername"));
		
	}
	public WebElement LoginpanelUserPassword() 
	{
		return password = driver.driver.findElement(By.id("txtPassword"));
		
	}

}
