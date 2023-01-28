package readExcelData;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class orangehrmLoginInvalidData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Flib flib = new Flib();
		int rc =flib.rowCount("./data/OrangehrmLogin.xlsx","invaliddata");
		
		for(int i=1;i<=rc;i++ )
		{
		String username = flib.readExcelData("./data/OrangehrmLogin.xlsx","invaliddata",1,0);
		String password = flib.readExcelData("./data/OrangehrmLogin.xlsx","invaliddata",1,1);
		
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//button")).click();
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("password")).clear();
}
}
}