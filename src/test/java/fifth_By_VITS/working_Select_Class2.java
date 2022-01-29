package fifth_By_VITS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class working_Select_Class2 {
	
	WebDriver driver;
	@Before
	public void mens()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	@Test
	public void tsts()
	{
		WebElement slcbtn = driver.findElement(By.xpath("//select[@id='yearbox']"));
		//slcbtn.click();
		Select slt = new Select(slcbtn);
		slt.selectByVisibleText("1990");	
	}
	@After()
	public void aft() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	

}
