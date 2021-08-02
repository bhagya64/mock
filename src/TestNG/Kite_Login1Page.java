package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login1Page {
	
	@FindBy(xpath = "//input[@id='userid']") private WebElement id;
	@FindBy(xpath = "//input[@id='password']") private WebElement pwd;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginbtn;
	
	public Kite_Login1Page(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}

	public void idKite_Login1Page()
	{
		id.sendKeys("DV1510");
	}
	
	public void pwdKite_Login1Page()
	{
		pwd.sendKeys("Year@123");
	}
	
	public void loginbtnKite_Login1Page()
	{
		loginbtn.click();
	}
}
