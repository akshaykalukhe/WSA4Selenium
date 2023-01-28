package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void demo() 
  {
	  System.out.println("This is demo method");
	  Reporter.log("This is Demo method",true);
  }
  @Test
  public void demo1() 
  {
	  
	  Reporter.log("This is Demo1 method",true);
  }
  @Test
  public void demo2() 
  {
	 
	  Reporter.log("This is Demo2 method",true);
	  int a=40;
	  int b=2;
	  int c=a/b;
  }


}
