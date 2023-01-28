package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassnameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();// maximize the window
		driver.get("https://www.google.co.in/");
		driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
		driver.findElement(By.className("NPNe")).click();
		Thread.sleep(4000);
		driver.close();
  }
}