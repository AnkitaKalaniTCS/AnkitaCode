package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup {

	public static void main(String[] args) throws Throwable
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91721\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//create object of browser setting class
		ChromeOptions c= new ChromeOptions();
		
		c.addArguments("--disable-notifications");
		c.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(c);
		Thread.sleep(2000);
		driver.get("https://www.hdfcbank.com/");
		
		
		

	}

}
