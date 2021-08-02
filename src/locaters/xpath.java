package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class xpath {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d =new ChromeDriver();

		d.get("https://www.flipkart.com/");
		
		d.manage().window().maximize();
		
		
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		d.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[contains(@class,'_2IX_2')]")).clear();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[contains(@class,'_2IX_2')]")).sendKeys("8975490292");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("bhagyagdug");
		Thread.sleep(2000);
		
		d.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//button[contains(text(),'Request ')]")).click();
		
}


}
