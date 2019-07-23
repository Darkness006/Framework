package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Gmail_login {
	WebDriver driver;
	 
    public Gmail_login(WebDriver driver){ 
            this.driver=driver; 
    }
    @FindBy(how=How.XPATH, using="//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a") WebElement gmail_button;
    
    public void gmailbutton()
    {
    	gmail_button.click();
 	}
}
