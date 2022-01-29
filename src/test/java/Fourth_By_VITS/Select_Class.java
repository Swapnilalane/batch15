package Fourth_By_VITS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Class {
	
	WebDriver driver;
	
	@Before
	public void Befr() 
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@Test
	public void tsst()
	{
	    driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	    WebElement daybtn = driver.findElement(By.xpath("//select[@id='day']"));
	    WebElement monthbtn =  driver.findElement(By.xpath("//select[@id='month']"));
	    WebElement yearbtn = driver.findElement(By.xpath("//select[@id='year']"));
	    
		Select SLBD = new Select(daybtn);
		SLBD.selectByVisibleText("25");
		
		//Thread.sleep(3000);
		
		
		Select SLBM = new Select(monthbtn);
		SLBM.selectByVisibleText("Jan");
		
		//Thread.sleep(3000);
		
		
		Select SLBY = new Select(yearbtn);
		SLBY.selectByVisibleText("1997");	
		
		//Thread.sleep(3000);
	}
	@After
	public void Afftr() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.quit();
	}	
}

