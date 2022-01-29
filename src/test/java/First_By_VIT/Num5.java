package First_By_VIT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Num5 {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.lenovo.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	String str =driver.getTitle();
	System.out.println(str);

	String pdf=driver.getCurrentUrl();
	System.out.println(pdf);
	
	

	
	
}
}
