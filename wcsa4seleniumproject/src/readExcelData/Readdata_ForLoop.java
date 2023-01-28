package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdata_ForLoop {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		for(int i=1;i<=8;i++)
		{
			FileInputStream fis= new FileInputStream("./data/Testdata.xlsx");//provide the excel sheet file
			Workbook wb = WorkbookFactory.create(fis);//make the file for load
			Sheet sheet = wb.getSheet("IPL");// to take sheet name
			Row row = sheet.getRow(i);// get the value of row
			Cell cell = row.getCell(0);// get the value of cell
			String data = cell.getStringCellValue();// it will give the value present in cell
			System.out.println(data);
		}
	}

}
