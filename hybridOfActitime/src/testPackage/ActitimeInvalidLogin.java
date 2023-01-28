package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage1;

public class ActitimeInvalidLogin  extends BaseTest{
@Test
public void invalidCreds() throws EncryptedDocumentException, IOException, InterruptedException
{
	Flib flib = new Flib();
	LoginPage1 lp = new LoginPage1(driver);
	
	int rc = flib.rowCount(EXCEL_PATH, "invalidcreds");
	for(int i=1;i<=rc;i++)
	{
		String invalidUsername = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
		String invalidPassword = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);
		lp.actiTimeInvalidLogin(invalidUsername,invalidPassword);

	}
	}

}
