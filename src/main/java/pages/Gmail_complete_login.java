package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Gmail_complete_login {
	WebDriver driver;
	 
    public Gmail_complete_login(WebDriver driver)
    {
        this.driver=driver;       
    }
    @FindBy(how=How.XPATH, using="/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a") WebElement sign_IN; 
    @FindBy(how=How.XPATH, using="//*[@id=\"identifierId\"]") WebElement emailTextBox;
    @FindBy(how=How.XPATH, using="//*[@id=\"identifierNext\"]/span") WebElement next_button;
    @FindBy(how=How.XPATH, using="//*[@id=\"passwordNext\"]/span/span") WebElement next_button1;
    @FindBy(how=How.XPATH, using="//*[@id=\"password\"]/div[1]/div/div[1]/input") WebElement passwordTextBox;
    //@FindBy(how=How.XPATH, using="") WebElement signinButton;
    
    public void signIn()
    {
    	sign_IN.click();
 	}
    
    public void setEmail(String strEmail)
    {
    	emailTextBox.sendKeys(strEmail);
 	}
    
    public void setPassword(String strPassword)
    {
    	 passwordTextBox.sendKeys(strPassword);
    }
    
    public void clickOnNextButton()
    {
    	next_button.click();
    } 
    public void clickOnNextButton1()
    {
    	next_button1.click();
    } 
    
}
