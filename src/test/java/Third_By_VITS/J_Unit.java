package Third_By_VITS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class J_Unit {
	
	
	WebDriver driver;
    //String str = ("https://www.amazon.in/");
	
@Before
	public void Setup()
	{
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.amazon.in/");
	}
	
@Test
  
    public void search_iphone() 
{
//Assert.assertEquals("The title is matched", "https://www.amazon.in/",driver.getTitle());
WebElement ss=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));//.sendKeys("iphone");
ss.sendKeys("Nokia");
WebElement sw = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));//.sendKeys(Keys.RETURN);
sw.click();
//Assert.assertEquals("The title is matched", "https://www.amazon.in/",driver.getTitle());
String op = driver.getTitle();
System.out.println("The title is :------"+op);

}


@Test
     public void Search_Nokia()
{
	//Assert.assertEquals("The title is matched", "https://www.amazon.in/",driver.getTitle());
	WebElement searchbar =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchbar.sendKeys("iphone");

	WebElement Clickbutton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	Clickbutton.submit();
	//Assert.assertEquals("The title is matched", "https://www.amazon.in/",driver.getTitle());
	String gt = driver.getTitle();
	System.out.println("The current title is "+ gt);
}


@After
	public void Ends() 
	{
	driver.quit();	
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	

