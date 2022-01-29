package fifth_By_VITS;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
WebDriver driver;

@Before
public void before()
{
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://demoqa.com/browser-windows");
}
@Test
public void test() throws InterruptedException
{
	WebElement wndbtn = driver.findElement(By.xpath("//button[@id='windowButton']"));
	wndbtn.click();
	
	ArrayList<String> handle = new ArrayList<String>(driver.getWindowHandles());
	String parendWindowID = handle.get(0);
	String childWindowID = handle.get(1);
	
	driver.switchTo().window(childWindowID);
	
	System.out.println("The CH-current page title is :------"+driver.getTitle());
	System.out.println("The CH-current page URL is   :------"+driver.getCurrentUrl());
	
	Thread.sleep(4000);
	driver.close();
	
	driver.switchTo().window(parendWindowID);
	
	System.out.println("The PR-current page title is :------"+driver.getTitle());
	System.out.println("The PR-current page URL is   :------"+driver.getCurrentUrl());
	
	driver.findElement(By.id("tabButton"));	
}
@After
public void after() throws InterruptedException
{
	Thread.sleep(4000);
	driver.quit();
}		
}
