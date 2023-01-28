package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups = "FUNCTIONAL")
  public void ft() 
  {
	  Reporter.log("functional testing1",true);
  }
  @Test(groups = "INTEGRATION")
  public void it()
  {
	  Reporter.log("integration testing1",true);
  }
  @Test(groups = "SYSTEM")
  public void st()
  {
	  Reporter.log("System testing1",true);
  }
 //-------------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft2() 
  {
	  Reporter.log("functional testing2",true);
  }
  @Test(groups = "INTEGRATION")
  public void it2()
  {
	  Reporter.log("integration testing2",true);
  }
  @Test(groups = "SYSTEM")
  public void st2()
  {
	  Reporter.log("System testing2",true);
  }
  //----------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft3() 
  {
	  Reporter.log("functional testing3",true);
  }
  @Test(groups = "INTEGRATION")
  public void it3()
  {
	  Reporter.log("integration testing3",true);
  }
  @Test(groups = "SYSTEM")
  public void st3()
  {
	  Reporter.log("System testing3",true);
  }
  //--------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft4() 
  {
	  Reporter.log("functional testing4",true);
  }
  @Test(groups = "INTEGRATION")
  public void it4()
  {
	  Reporter.log("integration testing4",true);
  }
  @Test(groups = "SYSTEM")
  public void st4()
  {
	  Reporter.log("System testing4",true);
  }
  //------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft5() 
  {
	  Reporter.log("functional testing5",true);
  }
  @Test(groups = "INTEGRATION")
  public void it5()
  {
	  Reporter.log("integration testing5",true);
  }
  @Test(groups = "SYSTEM")
  public void st5()
  {
	  Reporter.log("System testing5",true);
  }
  //---------------------------------------------------------
  @Test(groups = "FUNCTIONAL")
  public void ft6() 
  {
	  Reporter.log("functional testing6",true);
  }
  @Test(groups = "INTEGRATION")
  public void it6()
  {
	  Reporter.log("integration testing6",true);
  }
  @Test(groups = "SYSTEM")
  public void st6()
  {
	  Reporter.log("System testing6",true);
  }
}
