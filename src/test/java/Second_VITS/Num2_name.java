package Second_VITS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Num2_name {
	
public static void main(String[] args) 
{
         WebDriver driver= new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
         driver.get("http://demo.automationtesting.in/Index.html");
         WebElement gg = driver.findElement(By.id("email"));
         gg.sendKeys("test@gmail.com");
         WebElement HH = driver.findElement(By.id("enterimg"));
         HH.click();
         String PP=driver.getCurrentUrl();
         System.out.println("The title is :-------"+driver.getTitle());
//         String uu=  driver.getTitle();
//         System.out.println("The current title of page is "+uu);
         System.out.println("The Current URL is :-----"+PP);
         driver.navigate().to("https://www.facebook.com");
         
        
         

	
	
}
}
