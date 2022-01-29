package Second_VITS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Num1  {
		
public static void main(String[] args) {

//	WebDriver driver= new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://www.google.com");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Index.html");
	driver.findElement(By.id("email"));
	WebElement we=driver.findElement(By.id("email"));
	we.sendKeys("test@gmail.com");
	
	driver.findElement(By.id("enterimg"));
	WebElement sw = driver.findElement(By.id("enterimg")); 
	sw.click();
	
	String title =  driver.getTitle();
	System.out.println("The title is "+ title);

	driver.quit();
	
	
	
	
	
	
}
	
	
	
	
	
	
}
