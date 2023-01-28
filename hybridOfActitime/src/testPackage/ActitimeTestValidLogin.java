package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage1;


public class ActitimeTestValidLogin extends BaseTest {
	
@Test
public void validtest() throws IOException, InterruptedException
{
	Flib flib = new Flib();
	LoginPage1 lp = new LoginPage1(driver);
lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
}
}
