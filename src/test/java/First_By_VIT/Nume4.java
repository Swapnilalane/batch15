package First_By_VIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nume4 {
public static void main(String[] args) {
	
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com");
	driver.manage().deleteAllCookies();
	
	//String str = driver.getCurrentUrl();
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Amazing play");
    driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
    driver.findElement(By.xpath("//yt-formatted-string[@id='text'][@name]")).click();
    //driver.quit();
	/*System.out.println("The CurrentURL of YouTube is :-----"+str);
	
	
	
	if(str.equals("https://www.youtube.com/"))
	{
		System.out.println("The Currents URL of YouTube is correct");
	}
		else
			{
			System.out.println("The Currents URL of YouTube is NOT correct");
		    }*/
   
	}
	
}

