package MockProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://127.0.0.1/login.do;jsessionid=5ddvjdt2vl0hc");
		WebElement usernameTextbox = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passwordTextbox = driver.findElement(By.xpath("//input[@name='pwd']"));
		if(usernameTextbox.isDisplayed()&& passwordTextbox.isDisplayed())
		{
			usernameTextbox.sendKeys("admin");
			Thread.sleep(2000);
			passwordTextbox.sendKeys("manager");
			Thread.sleep(2000);
			usernameTextbox.clear();
			Thread.sleep(2000);
			passwordTextbox.clear();
			Thread.sleep(2000);
			usernameTextbox.sendKeys("admin");
			Thread.sleep(2000);
			passwordTextbox.sendKeys("manager");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		}
		else
		{
		     System.out.println(" if the webpage is not display");
		}		
		}

	}

