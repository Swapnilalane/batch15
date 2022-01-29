package fifth_By_VITS;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab_Handl_Arraylist {
	
	WebDriver driver;
@Before
public void beforre()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://demoqa.com/browser-windows");	
}

@Test
public void tesst() throws InterruptedException
{
	Thread.sleep(3000);
	
	WebElement ntbtn = driver.findElement(By.xpath("//button[@id='WindowButton']"));
	ntbtn.click();
	
	Thread.sleep(3000);
	
	System.out.println("The current title is:--------"+driver.getTitle());
	
	ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
	String ParentWindowID = handle.get(0);
	String ChildWindowID = handle.get(1);
	
   
	System.out.println("The Parent Window Id id:------- "+ParentWindowID);
	
	driver.switchTo().window(ChildWindowID);
	
	System.out.println("The child window ID is :------- "+ChildWindowID);
	System.out.println("The title of page is :-------"+driver.getCurrentUrl());

	driver.close();
	
	driver.switchTo().window(ParentWindowID);
	
	Thread.sleep(2000);
	
	WebElement msgwbtn = driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
	msgwbtn.click();
}
@After
public void afterr() throws InterruptedException
{
	Thread.sleep(6000);
	driver.quit();
}	
}
