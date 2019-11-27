package practise_tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.Gmail_login;

public class parallel_execution_test extends practise_Testbase
{
	@Test
	public void init() 
	{
		Gmail_login gmailpage = PageFactory.initElements(driver, Gmail_login.class);
		gmailpage.gmailbutton();
	}
}
