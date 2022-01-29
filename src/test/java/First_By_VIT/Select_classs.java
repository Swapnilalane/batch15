package First_By_VIT;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Select_classs {
	WebDriver driver;
	@Before
	public void Before() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	@Test
	public void testt()
	{
		//WebElement WE = driver.findElement(By.xpath("//select[@id='yearbox']"));
		WebElement WE1 = driver.findElement(By.xpath("//select[@type='text'and @class='form-control ng-dirty ng-valid-parse ng-valid ng-valid-required ng-touched'and @placeholder='Month' ]"));
		Select PPO = new Select(WE1);
		//Select SLT = new Select(WE);
		//SLT.deselectByVisibleText("1950");
		PPO.deselectByVisibleText("June");
	}
	@After
	public void ennd() throws InterruptedException
	{
		Thread.sleep(5000);
		//driver.quit();
	}
	
	
	
	
	
	

}
