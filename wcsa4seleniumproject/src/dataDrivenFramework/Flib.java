package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
// use to store only the Generic reusable Methods
	public String readExcelData(String excelpath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
	}
	// to get last rowcount
	
	public int rowCount(String excelpath,String sheetname) throws EncryptedDocumentException, IOException
	{
	FileInputStream	fis=new FileInputStream(excelpath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetname);
    int rc  =sheet.getLastRowNum();
    return rc;
	}
}









