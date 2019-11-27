package practise;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class select_dropdown {
	WebDriver driver;
	
	public select_dropdown(WebDriver driver){ 
        this.driver=driver; 
	}
	
	/*@FindBy(how=How.XPATH, using="//*[@id=\"month\"]") WebElement dropdown;
	@FindBy(how=How.XPATH, using="//label[text()='Female']//preceding-sibling::input[@type='radio']")  WebElement Female_radio; 
	
	
	public void dropdown_list()
	{
		WebElement dropdown = driver.findElement(By.id("month"));
		Select drop = new Select(dropdown);
		java.util.List<WebElement> ele = drop.getOptions();
		for(WebElement e : ele)
		{
			System.out.println(e.getText());
		}
	}
	
	public void using_index(int a)
	{
		WebElement dropdown = driver.findElement(By.id("month"));
		Select drop = new Select(dropdown);
		drop.selectByIndex(a);
	}
	
	public void using_value(String a)
	{
		WebElement dropdown = driver.findElement(By.id("month"));
		Select drop = new Select(dropdown);
		drop.selectByValue(a);
	}
	public void using_visibletext(String a)
	{
		WebElement dropdown = driver.findElement(By.id("month"));
		Select drop = new Select(dropdown);
		drop.selectByVisibleText(a);
	}
	public void radio_button_female()
	{
		Female_radio.click();
	}*/
	@FindBy(how=How.XPATH, using="//*[@aria-describedby=\"Popover11\"]") WebElement dropdown_company;
	
	public void company_button()
	{
		dropdown_company.click();
	}
	
	public void company_dropdown_list(String search)
	{
		List<WebElement> company_list = driver.findElements(By.xpath("//*[@class=\"popover popover--right\" and @id=\"Popover11\"]//li"));
		System.out.println("Company list data size : "+company_list.size());
		String companytext = null;
		for(int i=0;i<=company_list.size()-1;i++)
		{
			companytext = company_list.get(i).findElement(By.tagName("a")).getAttribute("text");
			System.out.println(companytext);
			if(companytext.equalsIgnoreCase(search)) {
				company_list.get(i).findElement(By.tagName("a")).click();
				break;
			}
		}
	}
	
	
}


 