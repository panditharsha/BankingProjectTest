package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static  String GetDataExcel(int row ,int col) throws EncryptedDocumentException, IOException
	{
		FileInputStream file =new  FileInputStream("E:\\A VELOCITY\\Student.xlsx");
		Sheet sht = WorkbookFactory.create(file).getSheet("Login");
		String value = sht.getRow(row).getCell(col).getStringCellValue();
		
		return value ;
	}
	
	public static void ScreenShot(WebDriver driver ,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Admin\\Pictures\\Screenshots\\ScreenShot\\TestCase"+TCID+".png");
		org.openqa.selenium.io.FileHandler.copy(src, dest);
	}

}
