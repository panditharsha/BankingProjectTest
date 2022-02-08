package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite1_BaseUtility {
	@FindBy(id="userid")private WebElement UserId ;
	@FindBy(id="password")private WebElement Pwd ;
	@FindBy(xpath="//button[@type=\"submit\"]") private WebElement Button1 ;
	@FindBy(xpath ="//p[@class=\"error text-center\"]") private WebElement Errormsg ;
	
	@FindBy(xpath="//span[text()='User ID should be minimum 6 characters.']") 
	private WebElement ErrID ;
	
	@FindBy(xpath="//span[text()='Password should be minimum 6 characters.']")
	private WebElement ErrPWD ;
	
	public Kite1_BaseUtility(WebDriver driver)   
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void EnterUID(String UID)
	{
		UserId.sendKeys(UID);
	}
	
	public void EnterPWd(String pswrd)
	{
		Pwd.sendKeys(pswrd);
	}
	
	public void click1()
	{
		Button1.click();
	}
	
	public String Error()
	{
		String Errmsg = Errormsg.getText();
		return Errmsg ;
	}
	
	public String ErrorID()
	{
		String ErrorIDMsg = ErrID.getText();
		return ErrorIDMsg ;
	}
	
	public String ErrorPwd()
	{
		String ErrorpwdMsg = ErrPWD.getText();
		return ErrorpwdMsg;
	}
	
}
