package Common;

import java.nio.channels.ReadPendingException;

import org.openqa.selenium.chrome.ChromeDriver;

import utility.utilites;

public class common 
{
	public static void LaunchBrowser()
	{
		String Driver_Path = "F:\\selenium jars\\Drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", Driver_Path);
		driver.driver = new ChromeDriver();
	}
	
	public static void GetApp()
	{
	
		driver.driver.get("https://enterprise-demo.orangehrmlive.com/symfony/web/index.php/auth/login");
	}
//
}
