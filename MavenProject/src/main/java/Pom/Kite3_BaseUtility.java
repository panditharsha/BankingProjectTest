package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite3_BaseUtility {
	
	@FindBy(xpath="//span[text()=\"YT2353\"]")private WebElement Usr_ID ;
    @FindBy(xpath="//a[@target=\"_self\"]")private WebElement Logout ;
    
    public Kite3_BaseUtility(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
    
    public String ValidateUID()
    {
    	String ActualID = Usr_ID.getText();
    	return ActualID;
    }
    
    public void Id()
    {
    	Usr_ID.click();
    }
    
    public void logout()
    {
    	Logout.click();
    }


}
