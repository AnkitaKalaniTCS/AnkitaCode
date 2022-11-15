package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\91721\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		 Thread.sleep(2000);
		WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
		 Select s=new Select(day);
		 Thread.sleep(2000);
		s.selectByVisibleText("4");
		
		Thread.sleep(2000);
		
		 s.selectByValue("5");		 
		 
		 WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		 Select select=new Select(month);
		 select.selectByVisibleText("Jun");
		 
		 WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		 Select s1=new Select(year);
		 s1.selectByVisibleText("1995");

	}

}
