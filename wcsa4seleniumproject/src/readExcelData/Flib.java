package readExcelData;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{
  public String readExcelData  (String excelpath,String sheetname,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
  {
	FileInputStream fis = new FileInputStream(excelpath);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetname);
	Row row = sheet.getRow(rowCount);
  Cell cell	= row.getCell(cellCount);
  String data = cell.getStringCellValue();
  return data;
}

//to get last count
public int rowCount(String excelpath,String sheetname) throws EncryptedDocumentException, IOException
{
	FileInputStream fis = new FileInputStream(excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetname);
	int rc = sheet.getLastRowNum();
	return rc;
}	
// write Excel data
public void writeExcelData(String excelpath,String sheetname,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
{
      FileInputStream fis = new FileInputStream(excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetname);
	Row row = sheet.getRow(rowCount);
	Cell cell = row.createCell(cellCount);
	
	cell.setCellValue(data);
	
	FileOutputStream fos = new FileOutputStream(excelpath);
	wb.write(fos);
}	
}