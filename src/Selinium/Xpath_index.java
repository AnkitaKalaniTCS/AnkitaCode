package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_index {
	public static void main(String[] args) throws Throwable{

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\91721\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("admin");
		Thread.sleep(1000);
	}

}
