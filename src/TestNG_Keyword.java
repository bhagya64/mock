

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keyword {

	//private static final String invocation = null;

	@Test 
	public void tc1()
	{
		Reporter.log("tc1.....", true);
	}
	
	@Test(dependsOnMethods = "tc5")
	public void tc2()
	{
		Reporter.log("tc2.....", true);
	}
	
	@Test(priority = 3,enabled = false)
	public void tc3()
	{
		Reporter.log("tc3.....", true);
	}
	
	@Test(priority = -1)
	public void tc4()
	{
		Reporter.log("tc4.....", true);
	}
	
	@Test (timeOut = 3000)
	public void tc5() throws InterruptedException
	{
		Thread.sleep(5000);
		Reporter.log("tc5.....", true);
	}
}
