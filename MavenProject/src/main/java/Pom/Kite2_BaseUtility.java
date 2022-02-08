package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite2_BaseUtility {
	
	@FindBy(id="pin")private WebElement Pin ;
	@FindBy(xpath="//button[@type=\"submit\"]") private WebElement Button2 ;
	
	public Kite2_BaseUtility(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void EnterPin(String pin)
	{
		Pin.sendKeys(pin);
	}
	
	public void click2()
	{
		Button2.click();
	}

}
