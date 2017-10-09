package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Common.driver;

public class Dashboard 
{
	static WebElement Ptab;
	public static WebElement ProductsTab()
	{
		return Ptab = driver.driver.findElement(By.xpath("//a[@id='ui-id-2']"));	
	}
	

}
