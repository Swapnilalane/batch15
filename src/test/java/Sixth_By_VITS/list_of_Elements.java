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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class list_of_Elements 
{
	WebDriver driver;
	@Before
	public void before()
	{
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--incognito");
		driver = new ChromeDriver(op);
		driver.get("https://www.amazon.in");
	
	}
	@Test
	public void test()
	{
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		WebElement aa =driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(aa).build().perform();
		 
		List<WebElement> qq = driver.findElements(By.xpath("//div[@id='nav-al-your-account']"));
		for (int i = 0; i< qq.size(); i++) 
		{
			System.out.println("List of Elements :- "+qq.get(i).getText());
		}
	}
	@After
	public void after() throws InterruptedException
	{
		Thread.sleep(6000);
		driver.quit();
		
	}
}
