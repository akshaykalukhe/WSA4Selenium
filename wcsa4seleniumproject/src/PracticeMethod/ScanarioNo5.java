package PracticeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScanarioNo5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/jewellery/rings.html");
		driver.findElement(By.xpath("(//li[@class='menuparent repb'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@title='Diamond Rings'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Price Low to High ']")).click();
	}

}
