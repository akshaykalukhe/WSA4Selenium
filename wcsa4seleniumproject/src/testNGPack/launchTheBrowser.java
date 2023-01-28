package testNGPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class launchTheBrowser {
	static WebDriver driver;
  @BeforeTest
  public void lhBrowser()
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("http://127.0.0.1/login.do;jsessionid=dwdxi6if163o");
  }
  @Test
  public void titleTest()
  {
	  String title = driver.getTitle();
	  Reporter.log(title,true);
	  
	  
  }
  @AfterTest
  public void closeBrowser()
  {
	  driver.quit();
  }
}
