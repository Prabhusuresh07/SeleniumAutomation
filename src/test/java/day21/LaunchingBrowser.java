package day21;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaunchingBrowser {

	public static void main(String[] args) 
	{
      WebDriver driver = new ChromeDriver();
      
      driver.get("https://www.amazon.in/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      driver.manage().window().maximize();
      //(By.xpath("//input[@placeholder='Search Amazon.in']"));
      WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
      ele.sendKeys("Watches for men");
      WebElement submit = driver.findElement(By.id("nav-search-submit-button"));
      submit.click();
      
//      String expTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";  
//
//      String actTitle = driver.getTitle();
//       if(actTitle.equals(expTitle))
//       {
//    	   System.out.println("Test Passed");
//       }
//       else {
//    	   System.out.println("Test Failed");
//       }
    
      //driver.close();
	}

}
