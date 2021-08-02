package FlipkartLoginWithDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFlipkart {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		FileInputStream file = new FileInputStream("D:\\SELENIUM\\mock.xls");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.flipkart.com/");
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		d.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
		
		WebElement un = d.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		
	    un.clear();
	    String uname = sh.getRow(0).getCell(0).getStringCellValue();
	    un.sendKeys(uname);
		
		WebElement pwd = d.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		pwd.clear();
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		pwd.sendKeys(password);
		
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
	}
	
	

}
