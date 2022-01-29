package fifth_By_VITS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	
	WebDriver driver;
@Before
public void before()

{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
}
@Test
public void test()
{
	WebElement Filebtn = driver.findElement(By.xpath("//input[@type='file']"));
	Filebtn.sendKeys("C:\\Program Files\\Common Files\\Services");
	
	WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
	submit.click();
}
@After	
public void after() throws InterruptedException
{
	Thread.sleep(5000);
	driver.quit();
}

}
