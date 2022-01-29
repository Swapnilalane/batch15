package First_By_VIT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nume3 {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.Facebook.com");
    String str=driver.getTitle();
    
    System.out.println("The Actual Title is ::---"+str);
    
    if(str.equals("Facebook – log in or sign up"))
    {
    	System.out.println("The Title is correct");
    }
    else
    {
    	System.out.println("the title is not corrct");
    }
    
    
		
}
}
