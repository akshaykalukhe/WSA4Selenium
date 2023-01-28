package testNGPack2;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class Flag7 {
  @Test
  public void m1() 
  {
	  Assert.fail();
	  Reporter.log("This is method m1",true);
  }
  @Test(dependsOnMethods = "m1",alwaysRun = true )
  public void m2()
  {
	  Reporter.log("This is method m2",true);
  }
}
