package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staleref {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://127.0.0.1/login.do;jsessionid=26jsqk0uesqkl");
	 WebElement usn = driver.findElement(By.name("username"));
	 WebElement pass = driver.findElement(By.name("pwd"));
	 usn.sendKeys("admin");
	 System.out.println(usn);
	 Thread.sleep(2000);
	 driver.navigate().refresh();
	 Thread.sleep(2000);
	 usn.sendKeys("admin");
	 System.out.println(usn);
	
	 
	 
}
}
