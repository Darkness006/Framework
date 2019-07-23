package tests;



import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Gmail_login;

public class Gmail_login_test extends Testbase
{
	@Test
	public void init() 
	{
		Gmail_login gmailpage = PageFactory.initElements(driver, Gmail_login.class);
		
		gmailpage.gmailbutton();
		
		
	}
	
}
