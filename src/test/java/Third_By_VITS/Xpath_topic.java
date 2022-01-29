 package Third_By_VITS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_topic {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\Batch_15webdriver\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.amazon.in");
	
	
}
}
