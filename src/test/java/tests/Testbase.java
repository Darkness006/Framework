package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase{

	
	public static WebDriver driver = null;
	
	@BeforeSuite
	public void initialize()throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		driver.get("https://www.google.com");
		 
	}
		

}
