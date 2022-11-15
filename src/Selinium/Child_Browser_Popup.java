package Selinium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup {

	public static void main(String[] args) throws Throwable{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91721\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//click on cancel button
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		//search for phones
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Enter mobile under 30000",Keys.ENTER);
		//click on mobile
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
		//by default selenium cntrl on main window we need to take all windwos
	   Thread.sleep(2000);
	   Set<String>allwindowsSet=driver.getWindowHandles();
	   //in arraylist we can store all windows sequentially
	   ArrayList<String> al=new ArrayList<String>(allwindowsSet);
	   //print main window
	   String mainwindow=al.get(0);
	   System.out.println(mainwindow);
	   //pint child
	   String childwindow=al.get(1);
	   System.out.println(childwindow);
	   
		
	}

}
