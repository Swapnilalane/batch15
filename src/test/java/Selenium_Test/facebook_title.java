package Selenium_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_title{ 
public static void main(String[] args) throws InterruptedException {
	
	

WebDriver driver =new ChromeDriver();
driver.get("https://www.Facebook.com");
driver.manage().window().maximize();
String str = driver.getTitle();
System.out.println(str);
//driver.findElement(By.id("email")).sendKeys("swapnilalane358@gmail.com");
//driver.findElement(By.name("pass")).sendKeys("Swapnil*320358");
//driver.findElement(By.name("login")).click();
driver.findElement(By.linkText("Forgotten password?")).click();
Thread.sleep(3000);
String str1 = driver.getTitle();
System.out.println(str1);

}
}