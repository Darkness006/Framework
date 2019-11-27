package practise_tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practise_Testbase{

	
	public static WebDriver driver = null;
	@Parameters("myBrowser")
	@BeforeSuite
	public void initialize(String myBrowser)throws IOException 
	{
		if (myBrowser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.google.co.in/webhp?hl=en&sa=X&ved=0ahUKEwif0fi3rYfmAhUOILcAHQ7JBaUQPAgH");
	}
		else if (myBrowser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.google.co.in/webhp?hl=en&sa=X&ved=0ahUKEwif0fi3rYfmAhUOILcAHQ7JBaUQPAgH"); 
		}
		
	}
}
