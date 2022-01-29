package fifth_By_VITS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_with_text_box {
	
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
	WebElement alertoc = driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]"));
	alertoc.click();
	
	Thread.sleep(3000);
	
	WebElement aoc = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	aoc.click();
	
	Thread.sleep(3000);
	
	Alert alrt = driver.switchTo().alert();
	alrt.sendKeys("swapnil alane");
	Thread.sleep(3000);
	alrt.accept();
	//alrt.dismiss();	
}
@After
public void endd() throws InterruptedException
{
	Thread.sleep(4000);
	driver.quit();
}
}
