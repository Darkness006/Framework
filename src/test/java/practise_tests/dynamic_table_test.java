package practise_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import practise.dynamic_table;

@Test
public class dynamic_table_test extends practise_Testbase
{	
	public void init() 
	{
		
		dynamic_table dynamictable = PageFactory.initElements(driver, dynamic_table.class);
		//dynamictable.companylist();
		dynamictable.tablesize();
		dynamictable.companylist();
		
	}
}	
