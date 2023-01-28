package PageObjectModel;

import java.io.IOException;
public class ActiTimeValidLogin extends BaseTest {
public static void main(String[] args) throws IOException, InterruptedException {
	// open the browser
	BaseTest bt = new BaseTest();
	bt.openBrowser();
	
	// to read the data from property file
	Flib flib = new Flib();
	
	LoginPage1 lp = new LoginPage1(driver);
	
	lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
	
}
}
