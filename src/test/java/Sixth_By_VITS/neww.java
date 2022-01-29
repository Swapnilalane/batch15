package Sixth_By_VITS;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class neww {
	WebDriver driver;
	
	@Before
	public void before()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test() throws InterruptedException
	{

		
		WebElement snup = driver.findElement(By.xpath("//div//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		snup.click();
		
		
		
		WebElement npg =driver.findElement(By.xpath("//div[@class='_8fgl _9l2p']"));
		
		driver.switchTo().frame(npg);
		
		WebElement dbtn = driver.findElement(By.xpath("//select[@id='day']"));
		dbtn.click();
		
		Select slt = new Select(dbtn);
		slt.selectByValue("25");
		
		Thread.sleep(3000);
		
		 WebElement mntbtn = driver.findElement(By.xpath("//select[@id='month']"));
		 mntbtn.click();
		 
		 Select slct = new Select(mntbtn);
	     slct.selectByValue("6");
	     
	     Thread.sleep(3000);
	     
	     List<WebElement> lstbtn = driver.findElements(By.xpath("//select[@id='month']/option"));
	     
	   
	     for (int i = 0; i < lstbtn.size(); i++) 
	     {
			System.out.println("The Month list is "+lstbtn.get(i).getText());
		 }
		 
	}	 
	
	@After
	public void after() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
