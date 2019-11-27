package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class dynamic_table {
	WebDriver driver;
	int numOfRow;
	
	public dynamic_table(WebDriver driver){ 
        this.driver=driver; 
	}
	public void tablesize()
	{
		WebElement table = driver.findElement(By.id("leftcontainer"));
		numOfRow = table.findElements(By.tagName("tr")).size();
		System.out.println(numOfRow);
	}
		
	public void companylist()
	{
		    //a[contains(text(),'Marico Ltd.')]/parent::td//parent::tr/td[3]	
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]/a
		String before_path = "//*[@id=\"leftcontainer\"]/table/tbody/tr[";
		String after_path = "]/td[1]/a";
				
		for(int i=1;i<=numOfRow;i++)
		{
			String name_cmpy = driver.findElement(By.xpath(before_path + i + after_path )).getText();
			System.out.println(name_cmpy);
			if (name_cmpy.contains("Marico Ltd.")) {
				//driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[1]/a")).click();
				String closedata =driver.findElement(By.xpath("//a[contains(text(),'Marico Ltd.')]/parent::td//parent::tr/td[3]")).getText();
				System.out.println(closedata);
			}
			else {
				System.out.println("Searched data not available");
			}
		}
	}
	
}
