package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d =new ChromeDriver();
		
		d.get("file:///C:/Users/Bhagyashri/Documents/locater.html");	
		
		//d.findElement(By.tagName("input")).sendKeys("abc");
		
		//d.findElement(By.id("123")).sendKeys("abc");
		//d.findElement(By.className("abc")).sendKeys("abc123");
		
		//d.findElement(By.name("abc1")).sendKeys("abc1223");
		//d.findElement(By.name("xyz1")).sendKeys("xyz123");
		
		
		
	}

	
}
