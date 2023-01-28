package testNGPack2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class InvocationCountFlag
{
	static WebDriver driver;
	@Test(invocationCount = 10)
	public void launchBrowser()
	{
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("http://127.0.0.1/login.do;jsessionid=dwdxi6if163o");
/*
	  public void logInMethod()
	  {
		Reporter.log("This is logIn Method!!",true); 
	  }
	  @Test(dependsOnMethods = "logInMethod")
	  public void userSelect()
	  {
		  Reporter.log("This is user Select Method!!",true);   
	  }
	  @Test(dependsOnMethods = "userSelect")
	  public void logOutMethod()
	  {
		  Reporter.log("This is LogOut Method!!",true);  
	  }*/

 }
}