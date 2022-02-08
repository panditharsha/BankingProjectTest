package TestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import Pom.Kite1_BaseUtility;
import Pom.Kite2_BaseUtility;
import Pom.Kite3_BaseUtility;
import Utility.Utility;

public class Kite_TestClass_BU extends Base{	
	Kite1_BaseUtility page1 ;
	Kite2_BaseUtility page2;
	Kite3_BaseUtility page3 ;
	
@BeforeClass
 public void LaunchbRowser() throws InterruptedException
 {
	Reporter.log("Launching the URL",true);
    Browser();
    
 page1 =new Kite1_BaseUtility(driver);
 page2 =new Kite2_BaseUtility(driver);
 page3 =new Kite3_BaseUtility(driver);	
 }

@BeforeMethod
 public void Login_to_kite() throws EncryptedDocumentException, IOException, InterruptedException
 {
	Thread.sleep(2000);
	Reporter.log("Enter the login Details",true);
	page1.EnterUID(Utility.GetDataExcel(0, 0));
	Thread.sleep(2000);
	
	page1.EnterPWd(Utility.GetDataExcel(0, 1));
	Thread.sleep(2000);
	
	page1.click1();
	Thread.sleep(3000);
		
	Reporter.log("Enter the pin and login to System");
	page2.EnterPin(Utility.GetDataExcel(0, 2));
	Thread.sleep(2000);
	page2.click2();
	Thread.sleep(3000);	
 }

  @Test
  public void Validation() throws EncryptedDocumentException, IOException, InterruptedException 
  {
	  int TCID=1 ;
	  String ActualID = page3.ValidateUID();
	  String ExpID = Utility.GetDataExcel(0, 0);
	  
	  Assert.assertEquals(ActualID,ExpID,"Tc" +TCID+ "failed ID not match");
	  Reporter.log("Both ID are Same,Tc"+TCID+"is passed");
	  Thread.sleep(2000);
	  
	  
	  Reporter.log("Capturing the Screen",true);
	  Utility.ScreenShot(driver, TCID);
	    
  }
   @AfterMethod()
   
   public void LogoutFromSite() throws InterruptedException
   {
	   Reporter.log("Logging out from site",true);
	   page3.Id();
	   Thread.sleep(2000);
	   
	   page3.logout();
	   Thread.sleep(2000);
   }

   @AfterClass
   public void CloseApp()
   {
	   Reporter.log("Closing the Browser");
	   driver.close();
   }
}
