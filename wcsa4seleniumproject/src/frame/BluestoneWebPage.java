package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneWebPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[.='Not now']")).click();
		//switch the control to frame
		
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("admin");
	}

}
