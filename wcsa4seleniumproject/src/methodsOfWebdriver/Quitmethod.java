package methodsOfWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quitmethod {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver(); //to launch browser
			driver.manage().window().maximize(); // maximize the window
			driver.get("https://www.facebook.com/login/");// to launch webapp
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[.='open a popup window']")).click();
			Thread.sleep(2000);
			driver.quit();// close parent and child window
}
}