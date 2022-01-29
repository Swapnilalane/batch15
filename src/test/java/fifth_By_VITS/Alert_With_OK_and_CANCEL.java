package fifth_By_VITS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_With_OK_and_CANCEL {
	
	WebDriver driver;
@Before	
public void bfr()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://demo.automationtesting.in/Alerts.html");
}
@Test
public void tsts() throws InterruptedException
{
	WebElement alertoc = driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]"));
	alertoc.click();
	
	Thread.sleep(3000);
	
	WebElement aoc = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	aoc.click();
	
	Thread.sleep(3000);
	
	Alert alrt = driver.switchTo().alert();
	//alrt.accept();
	alrt.dismiss();	
}
@After
public void endd() throws InterruptedException
{
	Thread.sleep(4000);
	driver.quit();
}
}
