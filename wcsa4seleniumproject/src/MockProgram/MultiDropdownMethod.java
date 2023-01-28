package MockProgram;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropdownMethod {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/aksha/OneDrive/Desktop/WCSA4-Selenium/multiple1.html");
		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select( dropDown);
		List<WebElement> allOptions = sel.getOptions();
		TreeSet tr = new TreeSet();
		for(WebElement options:allOptions)
		{
		String opt=options.getText();
		tr.add(opt);			
		}
		System.out.println(tr);
	}
}

