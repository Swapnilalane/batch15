package fifth_By_VITS;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Double_Frame_Alart {
	
	 WebDriver driver;
@Before	
public void before()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://demo.automationtesting.in/Frames.html");
}
@Test
public void test()
{
	WebElement clkbtn = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
	clkbtn.click();
	
	WebElement menfrm = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	driver.switchTo().frame(menfrm);
	
	WebElement undrfrm = driver.findElement(By.xpath("//div[@class='row']/iframe"));
	driver.switchTo().frame(undrfrm);
	
	
	
	WebElement txbx = driver.findElement(By.xpath("//input[@type='text']"));
	txbx.sendKeys("successfully got x path");
	
	driver.switchTo().defaultContent();
	
	}
@After
public void end() throws InterruptedException
{
	Thread.sleep(2000);
	driver.quit();
}
}
