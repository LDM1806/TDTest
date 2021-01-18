package PageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class International {
	
		
 WebDriver driver = null;
	
	By textFx = By.linkText("FX calculator");
	By textNb =By.linkText("Send money now in NetBank");
	
		
	public International(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void verifytext()
	
	{
		
		assertEquals(driver.findElement(textFx).getText(),"FX calculator");
		System.out.println(driver.findElement(textFx).getText());
	}
	
	
	public void netbank()
	
	{
		driver.findElement(textNb).click();
		
	}
	
	

}
