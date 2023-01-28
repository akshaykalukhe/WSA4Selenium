package ActionsMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickmethod 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do;jsessionid=2m93m401gk19s");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	driver.findElement(By.xpath("//a[contains(@class,'content administration')]")).click();
	driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
	driver.findElement(By.xpath("(//input[@name='formCustomInterfaceLogo.logoOption'])[2]")).click();
	Thread.sleep(3000);
	 WebElement target=driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
	Actions act = new Actions(driver);
	act.doubleClick(target).perform();
	
}
}
