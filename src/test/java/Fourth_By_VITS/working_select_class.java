package Fourth_By_VITS;

import org.junit.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class working_select_class {
WebDriver driver;
@Before
public void strts()
{
	driver = new ChromeDriver();
	driver.get("https://www.sugarcrm.com/au/request-demo/");
	driver.manage().window().maximize();
    driver.manage().deleteAllCookies();	
}
@Test
public void  tstt() throws InterruptedException
{
	 WebElement sw = driver.findElement(By.name("employees_c"));	 
     Select slbtn = new Select(sw);
     slbtn.selectByVisibleText("51 - 100 employees");
     Thread.sleep(5000);
     slbtn.selectByIndex(2);
     Thread.sleep(5000);
     slbtn.selectByValue("level7");
}

@After
public void endd() throws InterruptedException
{
	Thread.sleep(5000);
	driver.quit();	
}	
}
