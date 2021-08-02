package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d =new ChromeDriver();
		
		d.get("file:///C:/Users/Bhagyashri/Documents/link_locater.html");
		
		//d.findElement(By.linkText("facebook")).click();

		d.findElement(By.partialLinkText("boo")).click();
}
}

