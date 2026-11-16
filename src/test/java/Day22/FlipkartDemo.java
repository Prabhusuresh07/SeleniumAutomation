package Day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDemo {

	public static void main(String[] args)
	{

		WebDriver driver = new ChromeDriver();
	      
	      driver.get("https://www.flipkart.com/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      
	      driver.manage().window().maximize();
	      WebElement searchEle = driver.findElement(By.xpath("(//input[@placeholder='Search for Products, Brands and More'])[1]"));
          searchEle.sendKeys("Leather shoes");
	}

}
