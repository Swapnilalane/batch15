package Selenium_Test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Invocc {
	
	public static void main(String[] args) {
		
	System.setProperty("Webdriver.gecko.driver", "C:\\Users\\HP\\eclipse-workspace\\Batch_15webdriver\\geckodriver.exe");	
	
	FirefoxDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.com");
	String URLP=driver.getCurrentUrl(); 
	System.out.println("The Current URL of google is "+URLP );
	
	if(URLP.equals("https://www.google.com"))
	{
	
	System.out.println("the URL is matched");
	}
	
	else
		
	{
		System.out.println("The URL is NOTT matched");
	}
	
	}

}
