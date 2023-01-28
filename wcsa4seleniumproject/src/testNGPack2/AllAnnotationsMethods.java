package testNGPack2;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotationsMethods {
  @Test
  public void test() {
	  Reporter.log("This is test annotation",true);
  }
  @Test
  public void test1()
  {
	  Reporter.log("This is test1 annotations",true);
  }
  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("This the before class annotations",true);
  }
  @AfterClass
  public void afterClass()
  {
	  Reporter.log("This is the after class annotations",true);
  }
  @BeforeSuite
  public void beforeSuite()
  {
	  Reporter.log("This is the before suite annotations",true);
  }
  @AfterSuite
  public void afterSuite()
  {
	  Reporter.log("This is the after suite annotations",true);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("This is the before method annotations",true);
  }
  @AfterMethod
  public void aftermethod()
  {
	  Reporter.log("This is the after method annotations",true);
  }
  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("This is the before test annotations",true);
  }
  @AfterTest
  public void afterTest()
  {
	  Reporter.log("THis is the after test annotations",true);
  }
}
