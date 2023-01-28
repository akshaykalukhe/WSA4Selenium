package windowHandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitleOfAllWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		Thread.sleep(2000);
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		System.out.println("-----------");
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
			 String title = driver.switchTo().window(wh).getTitle();

			if(!parentTitle.equals(title))
			{
				System.out.println(title);
			}

	}

}
}