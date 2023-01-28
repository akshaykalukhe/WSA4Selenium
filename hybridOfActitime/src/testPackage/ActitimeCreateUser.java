package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage1;
import pagePackage.UsersPage;

public class ActitimeCreateUser extends BaseTest
{
@Test
public void createValidUser() throws InterruptedException, IOException
{
	LoginPage1 lp = new LoginPage1(driver);
	Flib flib = new Flib();
	
	lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH,"Password"));
	UsersPage up = new UsersPage(driver);
	String user = flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 0);
	String pass = flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 1);
	String name = flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 2);
	String lastname = flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 3);
	
	
	up.userdetail(user, pass, name, lastname);
}
}
