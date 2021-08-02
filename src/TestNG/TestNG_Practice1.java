package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Practice1 {

	@Test
	public void tc1()
	{
		Reporter.log("tc1.....", true);
	}
	
	@Test
	public void tc2()
	{
		Reporter.log("tc2.....", true);
	}
	
	@Test
	public void tc3()
	{
		Reporter.log("tc3.....", true);
	}
	
	@Test
	public void tc4()
	{
		Reporter.log("tc4.....", true);
	}
	
	@Test
	public void tc5()
	{
		Reporter.log("tc5.....", true);
	}
}
