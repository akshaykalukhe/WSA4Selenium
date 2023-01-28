package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeInvalidLoginPage {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=51oe82sqbueoo");
		
	Flib flib = new Flib();
	int rc =flib.rowCount("./data/ActitimeLoginPage.xlsx","invalidcreds");
	
	for(int i=1;i<=rc;i++ )
	{
	String username =flib.readExcelData("./data/ActitimeLoginPage.xlsx","invalidcreds",1,0);
	
	String password =flib.readExcelData("./data/ActitimeLoginPage.xlsx","invalidcreds",1,1);
	driver.findElement(By.name("username")).sendKeys(username);
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys(password);
	
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.name("username")).clear();
	driver.findElement(By.name("pwd")).clear();
	

	}

}
}