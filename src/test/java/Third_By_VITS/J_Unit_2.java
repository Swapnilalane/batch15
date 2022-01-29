package Third_By_VITS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class J_Unit_2 {
	
	WebDriver driver;
	
	
	
	@Before
	public void before() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		String title1 = driver.getCurrentUrl();
		System.out.println("The URL of page after open webpage :--------"+title1);
	}
	@Test
	public void test1() 
	{
		WebElement wb = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		wb.sendKeys("Redmi note 10");
		String title2 = driver.getCurrentUrl();
		System.out.println("The URL of page after redmi note 10:--------"+ title2);
	}
	@Test
	public void test2() 
	{
		WebElement wb2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		wb2.sendKeys("realme 6");
		String title3 = driver.getCurrentUrl();
		System.out.println("The URL of page after realme 6:--------"+title3);
	}
	@After
	public void endproc() 
	{
	driver.quit();	
	}
	
	

}
