package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\91721\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.get("http://www.google.com");
		 WebElement w=driver.findElement(By.xpath("//a[text()='Gmail']"));
		 Actions actions=new Actions(driver);
		 actions.moveToElement(w).click().build().perform();
		

	}

}
