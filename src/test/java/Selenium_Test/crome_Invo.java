package Selenium_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class crome_Invo {
public static void main(String[] args) {
	
	

WebDriver driver =new ChromeDriver();
driver.get("https://amazon.in");
driver.manage().deleteAllCookies();
driver.manage().window().maximize();



}}