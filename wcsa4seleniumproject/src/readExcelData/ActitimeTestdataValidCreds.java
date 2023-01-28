package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTestdataValidCreds {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=51oe82sqbueoo");
		
		FileInputStream fis = new FileInputStream("./data/ActitimeLoginPage.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validcreds");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String username = cell.getStringCellValue();
		
		FileInputStream fis1 = new FileInputStream("./data/ActitimeLoginPage.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis1);
		Sheet sheet2 = wb2.getSheet("validcreds");
		Row row2 = sheet2.getRow(1);
		Cell cell2 = row2.getCell(1);
		String password = cell2.getStringCellValue();

		
		driver.findElement(By.name("username")).sendKeys(username);
		 Thread.sleep(2000);
		 driver.findElement(By.name("pwd")).sendKeys(password);
		 Thread.sleep(2000);
		 driver.findElement(By.id("loginButton")).click();
		

	}

}
