package Flipkart_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginPage1 {
	
 	@FindBy (xpath = "//button[@class='_2KpZ6l _2doB4z']") private WebElement closePopup;
	
	public FlipkartLoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void closepop()
	{
		closePopup.click();
	}
	

}
