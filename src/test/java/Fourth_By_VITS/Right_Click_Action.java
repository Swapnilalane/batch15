package Fourth_By_VITS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Right_Click_Action {
 WebDriver driver;
 
 @Before
 public void stsrts()
 {
	driver= new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
 }
 @Test()
 public void Tsts()
 {
	WebElement right_click_btn = driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions BTN = new Actions(driver);
	BTN.contextClick(right_click_btn).build().perform();

 }
 @After
 public void endpr() throws InterruptedException 
 {
	 Thread.sleep(3000);
	 driver.quit();
 }
 
}
