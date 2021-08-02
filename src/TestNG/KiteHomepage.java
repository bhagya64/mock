package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomepage {
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement profileid ;
	
	public KiteHomepage(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void verifyProfileidKiteHomepage()
	{
		String actual_id = profileid.getText();
		String exp_id  = "DV1510";
		 if(actual_id.equals(exp_id))
			 System.out.println("actual and exp is same");
		 else
			 System.out.println("are diff...");
	}
	
	

}
