package day43;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class c1 {
	
	WebDriver driver;
	
	
	//@BeforeClass
	void Login()
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test
	void Ts1()
	{
		System.out.println("Actual Test Method.. Search Feature");
	}
	
	@Test
	void Ts2()
	{
		System.out.println("Actual Test Method... Main menu Feature");
	}
	
	@AfterClass
	void Logout()
	{
		System.out.println("After method... Logout ");
	}

}
