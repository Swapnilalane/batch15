package Fourth_By_VITS;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contex_click {
	//public static void main(String[] args) {
		
	
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
		WebElement RCBTN = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions BTN = new Actions(driver);
		BTN.contextClick(RCBTN).build().perform();
		
		WebElement cpy = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']"));
		Actions cbt = new  Actions(driver);
		cbt.contextClick(cpy).build().perform();

	 }
	 @After
	 public void endpr() throws InterruptedException 
	 {
		 Thread.sleep(3000);
		 driver.quit();
	 }
	 
	}



