package Third_By_VITS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assert_assert {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		//String nn = ("https://www.amazon.in/");
		
		String pp = driver.getCurrentUrl();
		System.out.println("the URL is is :-----"+pp);
		if(pp=="https://www.amazon.in/")
		{
			System.out.println("The title is currect");
		}
		else
		{
			System.out.println("The title is incorrect");
		}
		
	    driver.quit();	
	}

}
