  package Fourth_By_VITS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class slect_clss {
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.sugarcrm.com/au/request-demo/");
	driver.manage().window().maximize();
	WebElement sw = driver.findElement(By.name("employees_c"));
	Select slbtn = new Select(sw);
	slbtn.selectByVisibleText("51 - 100 employees");
	
}
}