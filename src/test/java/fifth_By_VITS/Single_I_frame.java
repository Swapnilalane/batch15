package fifth_By_VITS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single_I_frame {
	WebDriver driver;
@Before	
public void bfr()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://demo.automationtesting.in/Frames.html  ");
}
@Test
public void tst() throws InterruptedException
{
	WebElement frmbtn = driver.findElement(By.xpath("//a[text()='Single Iframe ']"));
	frmbtn.click();
	
	WebElement frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	driver.switchTo().frame(frame);
	
	WebElement txtbx = driver.findElement(By.xpath("//input[@type='text']"));
	txtbx.sendKeys("Test Test Test");
	
	driver.switchTo().defaultContent();
	
	WebElement HMBTN = driver.findElement(By.xpath("//a[text()='Home']"));
	HMBTN.click();
	
	Thread.sleep(4000);
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	
}
@After
public void endd() throws InterruptedException
{
	Thread.sleep(4000);
	driver.quit();
}	
	
}
