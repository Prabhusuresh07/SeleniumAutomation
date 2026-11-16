package Day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlazeDemoTestCase {

	public static void main(String[] args) throws InterruptedException 
	{
		  WebDriver driver = new ChromeDriver();
	      driver.get("https://blazedemo.com/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      
	      List<WebElement> ddoptions =driver.findElements(By.xpath("//select[@name='fromPort']//option"));
	      System.out.println("Total options present in the from dropdown: "+ddoptions.size());
	      for (WebElement dd1 : ddoptions) 
	      {
			String Fromoption = dd1.getText();
			if (Fromoption.equals("Boston")) 
			{
				dd1.click();
			}
		  }
	      
	      List<WebElement> dd2options =driver.findElements(By.xpath("//select[@name='toPort']//option"));
	      System.out.println("Total options present in the to dropdown: "+dd2options.size());
	      for (WebElement dd2 : dd2options) 
	      {
			String Tooption = dd2.getText();
			if (Tooption.equals("New York")) 
			{
				dd2.click();
			}		
		  }
	      
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	      
	   int rows = driver.findElements(By.xpath("//table[@class='table']//tr")).size();
	   System.out.println("No of rows present in the table: "+rows);
	      
	   int columns = driver.findElements(By.xpath("//table[@class='table']//th")).size();
	   System.out.println("No of columns present in the table: "+columns);
	   
	   
	   for (int i = 1; i < rows; i++) 
	   {
		 
			String price = driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]//td[6]")).getText();

		    System.out.println(price);
	   }
	     
	  
	   
//	      WebElement fromdropdown = driver.findElement(By.xpath("//select[@name='fromPort']"));
//	      Select dd1 = new Select(fromdropdown);
//	      dd1.selectByVisibleText("Boston");
//	      //Thread.sleep(3000);
//	      WebElement todropdown = driver.findElement(By.xpath("//select[@name='toPort']"));
//	      Select dd2 = new Select(todropdown);
//	      dd2.selectByVisibleText("New York");
//	      //Thread.sleep(3000);
//	      
//	      List<WebElement> dd1data=dd1.getOptions();
//	      
//	      for (WebElement dd1L : dd1data) 
//	      {
//			System.out.println(dd1L.getText());
//		  }
//	      
//	      
//	      List<WebElement> dd2data=dd2.getOptions();
//	      
//	      for (WebElement dd2L : dd2data) 
//	      {
//			System.out.println(dd2L.getText());
//		  }
//	      
//	      
    
	      
	     

	}

}
