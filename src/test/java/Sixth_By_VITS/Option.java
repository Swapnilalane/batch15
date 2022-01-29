package Sixth_By_VITS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Option {

	WebDriver driver;
	
@Before
	public void before()
	{
		ChromeOptions option = new ChromeOptions();   
		option.addArguments("--incognito");
		option.addArguments("window-size=1000,800");
		option.addArguments("--ignore-certificate-error");
		
		driver = new ChromeDriver(option);
		driver.get("https://www.google.co.in");
	}

@Test	
	public void test()
	{
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Automation Testing");
		
		WebElement Button = driver.findElement(By.xpath("//input[@value='Google Search' and @type='submit']"));
		Button.submit();
		
	}

@After	
	public void after() throws InterruptedException
	{
	    Thread.sleep(6000);
		driver.quit();
	}
	
}
