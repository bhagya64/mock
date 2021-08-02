package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class methods {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		d.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_dropdown_text");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		WebElement frame1 = d.findElement(By.xpath("//iframe[@id='iframeResult']"));
 	   d.switchTo().window("1");
		//d.switchTo().frame(frame1);
		
		WebElement dd = d.findElement(By.xpath("//div[@class='dropdown']/span"));
		
		Actions act = new Actions(d);
		
		act.moveToElement(dd).perform();	
		
	}

}
