package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clearmethod {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);	
		WebElement usernameTextBox = driver.findElement(By.name("username"));
		usernameTextBox.sendKeys("admin");
		Thread.sleep(2000);	
		usernameTextBox.clear();
		WebElement passwordTextBox = driver.findElement(By.name("pwd"));
		Thread.sleep(2000);	
		passwordTextBox.sendKeys("manager");
			
		passwordTextBox.clear();

	}

}
