package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteVerifyuserTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications-");
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver d = new ChromeDriver(option);
		
		d.get("https://kite.zerodha.com/");
		
		d.manage().window().maximize();
		
		Kite_Login1Page log1 = new Kite_Login1Page(d);
		log1.idKite_Login1Page();
		log1.pwdKite_Login1Page();
		log1.loginbtnKite_Login1Page();
		
		Kitelogin2pge log2 = new Kitelogin2pge(d);
		Thread.sleep(2000);
		log2.pinKitelogin2pge();
		log2.contbtnKitelogin2pge();
		
		KiteHomepage home = new KiteHomepage(d);
		home.verifyProfileidKiteHomepage();
		
		
		
		
		
		
		
	}

}
