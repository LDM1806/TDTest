package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.International;

public class HomePageTest {
	
private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		Internationalpage();
		
				
	}

	
	public static void Internationalpage()
	
	{
	driver = new ChromeDriver();
		
	HomePage link = new HomePage(driver);
	International text = new International(driver);	
	
	driver.get("https://www.commbank.com.au/");
    link.clicklink();
	text.verifytext();
	text.netbank();
	
	driver.quit();
	
	}
	
}
	


