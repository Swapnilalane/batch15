package Sixth_By_VITS;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_Of_Elements2 {

	WebDriver driver;
	
	@Before 
	public void before()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in");
	}
	
	@Test
	public void test() throws InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Iphone");
		
		Thread.sleep(7000);
		List<WebElement> ust = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		
		for(int i = 0; i<ust.size(); i++)
		{
			System.out.println("The list is" +  ust.get(i).getText());
		}
		
	}
	
	@After
	public void after() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}	
}
