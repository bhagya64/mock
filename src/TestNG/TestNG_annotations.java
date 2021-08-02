package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_annotations {

	@BeforeClass
	public void tc1()
	{
		Reporter.log("application lunched.....", true);
	}
	
	@BeforeMethod
	public void tc2()
	{
		Reporter.log("open webpage   login.....", true);
	}
	
	@Test
	public void tc3()
	{
		Reporter.log("tc3.....", true);
	}
	
	@Test
	public void tc34()
	{
		Reporter.log("verify profile.....", true);
	}
	
	@AfterMethod
	public void tc4()
	{
		Reporter.log("logout.....", true);
	}
	
	@AfterClass
	public void tc5()
	{
		Reporter.log("application closed.....", true);
	}
}
