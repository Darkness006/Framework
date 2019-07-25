package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class Testbase{

	
	public static WebDriver driver = null;
	
	@BeforeSuite
	public void initialize()throws IOException 
	{
		System.setProperty("webdriver.Chrome.driver","C:\\Users\\Sethuru\\eclipse-workspace\\Regular\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		driver.get("https://www.google.com");
		 
	}
		

}
