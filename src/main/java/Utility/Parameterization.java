package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.WebDriver;


public class Parameterization {
	
	
	public static String getExceldata(String data,int a, int b) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Administrator\\Documents\\Prashant Eclips\\SwagLab\\src\\test\\resources\\TestDataSwagLab.xlsx");
		String value =WorkbookFactory.create(file).getSheet(data).getRow(a).getCell(b).getStringCellValue();
		return value;
	}
	
	

}
