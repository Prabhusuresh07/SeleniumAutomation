package day21;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.loginpageHRM;

public class LoginTest extends BaseTest{
	
	
	@Test(priority=1, groups = {"regression"})
	public void logincheck() 
	{
		loginpageHRM lp = new loginpageHRM(driver);
		lp.setusername(p.getProperty("username"));
		lp.setpassword(p.getProperty("password"));
		lp.loginclick();
		Assert.assertEquals(driver.getTitle(), p.getProperty("pagetitle"));
	}
	
	
}

