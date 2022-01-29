package Selenium_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_command {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
//String str1 = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
////	String str = driver.getPageSource();
//System.out.println(str1);
	driver.findElement(By.xpath("//div[5]/a[@role='button']")).click();
	Boolean str3=driver.findElement(By.xpath("//input[@type='radio'][@value='2']")).isSelected();
	System.out.println(str3);
	driver.quit();
}
}
