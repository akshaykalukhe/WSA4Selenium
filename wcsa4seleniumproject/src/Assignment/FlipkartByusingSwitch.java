package Assignment;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartByusingSwitch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(4000);
	driver.switchTo().activeElement().sendKeys("Flipkart",Keys.ENTER);
	driver.navigate().back();
	Thread.sleep(4000);
	driver.navigate().forward();
	Thread.sleep(4000);
	driver.navigate().refresh();
	
	
		
	}

}
