package KeywordDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class OrangehrmInvalidLogin extends Akshay
{
	public static void main(String[] args) throws IOException, InterruptedException {
		
  Akshay ak= new Akshay();
  ak.openBrowser();
  
  Flib flib = new Flib();
 int rc = flib.rowCount(EXCEL_PATH, "invaliddata");
 for(int i=1;i<=rc;i++)
 {
	 String username = flib.readExcelData(EXCEL_PATH, "invaliddata", i, 0);
	 String password = flib.readExcelData(EXCEL_PATH, "invaliddata", i, 1);
	 Thread.sleep(2000);
	 driver.findElement(By.name("username")).sendKeys(username);
	 Thread.sleep(2000);
	 driver.findElement(By.name("password")).sendKeys(password);
	 driver.findElement(By.xpath("//button")).click();
	 
 }
}
}