package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeMultipleSelectByValue {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/aksha/OneDrive/Desktop/WCSA4-Selenium/multiple.html");
	WebElement dropDownElement = driver.findElement(By.id("menu"));
   Select sel = new Select(dropDownElement);
   Thread.sleep(4000);
   sel.selectByValue("v3");
   Thread.sleep(4000);
    sel.deselectByValue("v3");
	}
}
