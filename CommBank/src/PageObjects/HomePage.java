package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
	
WebDriver driver = null;
	
	By click_link = By.xpath("//span[contains(.,'International')]");
	
		
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void clicklink()
	
	{
		driver.findElement(click_link).click();
			
	}

	
	
}
