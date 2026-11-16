package day21;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.loginpageHRM;

public class logoutTest extends BaseTest{
	
	@Test(priority=1, groups = {"sanity"}, dataProvider = "dp")  //dataProvider = "dp"
	public void logincheck(String username, String password)         //
	{
		loginpageHRM lp = new loginpageHRM(driver);
		lp.setusername(username);                                  //(p.getProperty("username"));
		lp.setpassword(password);                                     // (p.getProperty("password"));
		lp.loginclick();
		Assert.assertEquals(driver.getTitle(), p.getProperty("pagetitle"));
		Homepage hp = new Homepage(driver);
		hp.profileclick();
		hp.logoutclick();
	}
	
//	@Test(priority=2, groups= {"sanity"})
//	public void titleCheck() 
//	{
//		System.out.println(driver.getTitle());
//	}
	
//	@Test(priority=3, groups= {"sanity"})
//	public void logoutcheck() 
//	{
//		Homepage hp = new Homepage(driver);
//		hp.profileclick();
//		hp.logoutclick();
//	}

}
