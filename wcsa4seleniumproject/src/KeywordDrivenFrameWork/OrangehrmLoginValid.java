package KeywordDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmLoginValid implements Suraj  {
   public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty(CHROME_KEY,CHROME_VALUE);
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	Flib flib = new Flib();
	
	String url = flib.readPropertyData(PROP_PATH,"Url");
	String username = flib.readPropertyData(PROP_PATH,"Username");
	String password = flib.readPropertyData(PROP_PATH,"Password");
	driver.get(url);
	
	driver.findElement(By.name("username")).sendKeys(username);
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys(password);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button")).click();
	driver.findElement(By.name("username")).clear();
}
}
