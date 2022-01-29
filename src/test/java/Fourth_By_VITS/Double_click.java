package Fourth_By_VITS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

WebDriver driver;

@Before
public void befor()

{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
}

@Test
public void testt()
{
	WebElement Dobleclik =driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	Actions BTN = new Actions(driver);
	BTN.doubleClick(Dobleclik).build().perform();
}
@After
public void Endd() throws InterruptedException
{
	Thread.sleep(3000);
	driver.quit();
}
	
		
}
