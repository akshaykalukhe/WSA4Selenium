package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeXpathLoginpage {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1/login.do;jsessionid=2ck448sshffd1");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	Thread.sleep(4000);
	driver.quit();
}
}
