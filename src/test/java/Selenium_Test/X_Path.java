package Selenium_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.navigate().refresh();
	driver.navigate().forward();
	
	driver.navigate().to("https://www.google.co.in/");
	driver.navigate().back();
	
	Thread.sleep(2000);
}
}
