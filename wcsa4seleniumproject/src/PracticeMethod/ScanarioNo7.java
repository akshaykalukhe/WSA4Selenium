package PracticeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScanarioNo7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[.='Not now']")).click();
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Kadas']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[1]")).click();
		Thread.sleep(2000);
		WebElement target1 = driver.findElement(By.xpath("//span[@name='chainselect']"));
		act.moveToElement(target1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='size'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		
		
}
}