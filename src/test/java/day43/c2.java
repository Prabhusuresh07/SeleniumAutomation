package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c2 {
	
	@BeforeClass
	void beforeclass()
	{
		System.out.println("Before class...");
	}
	
	@BeforeMethod
	void Login()
	{
		System.out.println("Before method... Login ");
	}
	
	//@Test
	void Ts1()
	{
		System.out.println("Actual Test Method.. Search Feature");
	}
	
	@Test
	void Ts2()
	{
		System.out.println("Actual Test Method... Main menu Feature");
	}
	
	@AfterMethod
	void Logout()
	{
		System.out.println("After method... Logout ");
	}

}
