package testNGPack2;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 
{
	static WebDriver driver;
  @Test
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
  }


}
