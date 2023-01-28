package PracticeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropScnariono3 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://jqueryui.com/droppable/");
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable'"));
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}
}