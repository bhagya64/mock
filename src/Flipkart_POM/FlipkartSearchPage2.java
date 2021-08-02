package Flipkart_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartSearchPage2 {
	
	@FindBy (xpath = "//input[@class='_3704LK']") private WebElement search;
	@FindBy (xpath = "//button[@class='L0Z3Pu']") private WebElement clickbtn;

	public FlipkartSearchPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchMobile(String mob)
	{
		search.sendKeys(mob);
	}
	
	public void clickOnbtn()
	{
		clickbtn.click();
	}
	
}
