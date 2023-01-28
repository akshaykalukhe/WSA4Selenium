package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocationMethod 
{
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("https://www.selenium.dev/downloads/");
			//Thread.sleep(2000);
		WebElement download = driver.findElement(By.xpath("//span[.='Downloads']"));
		Point loc = download.getLocation();
		 int xaxis = loc.getX();
		 int yaxis = loc.getY();
		 System.out.println(xaxis+ ":is the xaxis" + yaxis +" : is the yaxis");
	}

}
