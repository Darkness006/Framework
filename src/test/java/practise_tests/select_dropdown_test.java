package practise_tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import practise.select_dropdown;

@Test
public class select_dropdown_test extends practise_Testbase
{	
	public void init() 
	{
		select_dropdown selectdropdown = PageFactory.initElements(driver, select_dropdown.class);
		//selectdropdown.dropdown_list();
		//selectdropdown.using_index(6);
		//selectdropdown.using_value("12");
		//selectdropdown.using_visibletext("May");
		//selectdropdown.radio_button_female();
		selectdropdown.company_button();
		selectdropdown.company_dropdown_list("Forums");
	}
}	