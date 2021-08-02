package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d =new ChromeDriver();
		
		d.get("https://www.google.co.in/");
		
		Thread.sleep(2000);
		
		//d.close();
		
		//d.quit();
		
	/*	d.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		d.manage().window().maximize();

		d.navigate().back();
		Thread.sleep(2000);

		d.navigate().forward();
		Thread.sleep(2000);

		d.navigate().refresh();*/
		
		
		String title = d.getTitle();
		System.out.println(title);
		
		String url = d.getCurrentUrl();
		System.out.println(url);
		
		Dimension dim =new Dimension(300, 400);
		
		d.manage().window().setSize(dim);
		System.out.println(d.manage().window().getSize()+"getsize");
		Thread.sleep(2000);
		
		Point p = new Point(600, 200);
		d.manage().window().setPosition(p);
		System.out.println(d.manage().window().getPosition()+"getposition");
		
		
		
	}

}
