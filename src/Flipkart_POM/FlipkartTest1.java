package Flipkart_POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTest1 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		FileInputStream file = new FileInputStream("D:\\SELENIUM\\mock.xls");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	
	System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver d = new ChromeDriver();
	
	d.get("https://www.flipkart.com/");
	
	d.manage().window().maximize();
	
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	FlipkartLoginPage1 flip1 = new FlipkartLoginPage1(d);
	flip1.closepop();
	
	
	String mobname = sh.getRow(0).getCell(0).getStringCellValue();
	FlipkartSearchPage2 flip2 = new FlipkartSearchPage2(d);
	flip2.searchMobile(mobname);
	flip2.clickOnbtn();
	
	
	
	}
	
}
