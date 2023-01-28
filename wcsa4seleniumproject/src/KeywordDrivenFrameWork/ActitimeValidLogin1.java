package KeywordDrivenFrameWork;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ActitimeValidLogin1 {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver	driver =new ChromeDriver();
	driver.manage().window().maximize();
	
	Flib flib = new Flib();
	String url = flib.readPropertyData("./data/config.properties", "Url");
	String username = flib.readPropertyData("./data/config.properties", "Username");
	String password = flib.readPropertyData("./data/config.properties", "Password");
	driver.get(url);
	
	driver.findElement(By.name("username")).sendKeys(username);
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys(password);
	
	driver.findElement(By.id("loginButton")).click();	
}
}
