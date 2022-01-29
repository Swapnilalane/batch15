package fifth_By_VITS;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMSG {
	
	WebDriver driver;
	
@Before	
public void before()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://demoqa.com/browser-windows");
}
@Test
public void test()
{
	WebElement MWBTN = driver.findElement(By.id("messageWindowButton"));
	MWBTN.click();
	
	System.out.println("The Current URL of Page is"+driver.getCurrentUrl());
	
	ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
	String ParrentID = handle.get(0);
	String ChildID = handle.get(1);
	
    System.out.println("The Current URL of Page is"+driver.getCurrentUrl());
    driver.switchTo().window(ChildID); 
    System.out.println("The Current URL of Page is"+driver.getCurrentUrl());
	driver.close();
	
	driver.switchTo().window(ParrentID);                 //Move cursor to parent window
	driver.findElement(By.id("tabButton")).click();
	
}
@After
public void after()
{
	driver.quit();
}
}
