package fifth_By_VITS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_click {
WebDriver driver;

@Before
//PROGRAMM RUNS WITH O ERROR
public void Bfr()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://demo.automationtesting.in/Alerts.html");
}
@Test
public void tst() throws InterruptedException
{
	WebElement clkbtn = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	clkbtn.click();
	Thread.sleep(4000);
	Alert alrt = driver.switchTo().alert();
	alrt.accept();
}
@After
public void endd() throws InterruptedException
{
	Thread.sleep(3000);
	driver.quit();	
}
}
