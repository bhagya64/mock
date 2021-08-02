package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitelogin2pge {
	
	@FindBy(xpath = "//input[@id='pin']") private WebElement pin;
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement  contbtn;
	
	public Kitelogin2pge(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}

	public void pinKitelogin2pge()
	{
		pin.sendKeys("959594");
	}
	
	public void contbtnKitelogin2pge()
	{
		contbtn.click();
	}
}

