package readExcelData;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramloginPage 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.instagram.com/accounts/login/");
	
	Flib flib = new Flib();
	String username = flib.readExcelData("./data/InstagramLoginpage.xlsx","validdata", 1, 0);
	String password = flib.readExcelData("./data/InstagramLoginpage.xlsx","validdata",1,1);
	driver.findElement(By.name("username")).sendKeys("akshaykalukhe777@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys("akshay@123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_acan _aiit _acap _aijb _acas _aj1-']")).click();
}
}
