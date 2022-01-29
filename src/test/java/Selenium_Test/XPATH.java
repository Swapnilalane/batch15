package Selenium_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH {
	
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("https://www.facebook.com");
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.RETURN);
	driver.findElement(By.xpath("//a[@class='1']")).sendKeys("(\"//a[@class='1']\")");
	
	
}
}