package testcases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseTest 
{
	public static WebDriver driver;
	public Properties p;
	
	@Parameters({"browser"})
	@BeforeClass(groups= {"sanity","regression"})
	public void setup(String br) throws IOException 
	{
		
		FileReader file = new FileReader("./src//test//resources//Config.properties");
		p = new Properties();
		p.load(file);
		
		switch(br.toLowerCase()) {
		case "chrome": driver = new ChromeDriver(); break;
		case "edge": driver = new EdgeDriver(); break;
		case "firefox": driver = new FirefoxDriver(); break;
		default: System.out.println("Invalid Browser type.."); return;
		
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	@AfterClass(groups= {"sanity","regression"})
	public void teardown()
	{
		driver.quit();
	}
	
	@DataProvider(name="dp", indices = {0,1})
	public Object[][] logindata()
	{
		
		Object[][] data = {{"Admin","admin123"},
				           {"Admin1","admin1234"},
				           {"Admin","admin123"}};
		return data;
	}
		
	
}
