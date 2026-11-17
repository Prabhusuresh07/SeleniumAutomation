package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("hhttps://demo3x.opencartreports.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();
	WebElement username =driver.findElement(By.name("username"));
	username.clear();
	username.sendKeys("demo");
	WebElement password =driver.findElement(By.name("password"));
	password.clear();
	password.sendKeys("demo");
	WebElement login =driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	
	

	}

}
