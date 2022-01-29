package Fourth_By_VITS;

import org.junit.*;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_N_Drop {


	WebDriver driver;
	
	@Before
public void Before() throws InterruptedException{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://demoqa.com/droppable");
    
	}
    @Test
   
    public void tst() throws InterruptedException {
    WebElement ww = driver.findElement(By.id("draggable"));
    WebElement ee = driver.findElement(By.id("droppable"));
    Actions act = new Actions(driver);
    act.dragAndDrop(ww, ee).build().perform();          //working fine
   // act.click(ww).moveToElement(ee).build().perform();  //not working
    Thread.sleep(300);
    }
	
	
    @After
    public void after(){
    	//driver.manage().wait(4);
    	driver.quit();
    	
    }
}



