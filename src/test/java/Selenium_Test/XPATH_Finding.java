package Selenium_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class XPATH_Finding {
public static void main(String[] args) {
	RemoteWebDriver driver = new ChromeDriver();;
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//id
//By xpath
//	by ID
//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("satt.dipke@gmail.com");
// by name
//	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("satt.dipke@gmail.com");
//	By OR AND
//driver.findElement(By.xpath("//input[@id='email' and @name = 'email']")).sendKeys("satt.dipke@gmail.com");
//multiple attribute
//driver.findElement(By.xpath("//input[@id='email'][@name = 'email'][@type='text'][@placeholder='Email address or phone number']")).sendKeys("satt.dipke@gmail.com");
// contains 
	driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
	//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("swapnilalane3erd");
}
}
