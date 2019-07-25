package tests;


import java.util.ArrayList;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Gmail_complete_login;
import pages.Gmail_login;


public class Gmail_login_test extends Testbase
{
	@Test
	public void init() 
	{
		Gmail_login gmailpage = PageFactory.initElements(driver, Gmail_login.class);
		gmailpage.gmailbutton();
	}
	
	@Test
	public void login()
	{
		Gmail_complete_login gmailloginpage = PageFactory.initElements(driver, Gmail_complete_login.class);
		gmailloginpage.signIn();
		ArrayList<String> tabs_windows = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs_windows.get(1));
	    gmailloginpage.setEmail("darknessinside006");
		gmailloginpage.clickOnNextButton();
		gmailloginpage.setPassword("Gh0stGinger");
		gmailloginpage.clickOnNextButton1();
	}
	
}
