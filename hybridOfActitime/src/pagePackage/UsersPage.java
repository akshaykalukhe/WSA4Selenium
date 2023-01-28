package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
@FindBy(xpath="//div[.='Users']")private WebElement  userModule;
@FindBy(xpath="//input[@type='button' and(@value='Clean Up Demo Data')]")private WebElement createUserButton;
@FindBy(name="username")private WebElement usernameTB;
@FindBy(name="passwordText")private WebElement passwordTB;
@FindBy(name="passwordTextRetype")private WebElement retypePasswordTB;
@FindBy(name="firstName")private WebElement firstnameTB;
@FindBy(name="lastName")private WebElement lastnameTB;
@FindBy(xpath="//input[@type='submit' and(@value='   Create User   ')]")private WebElement createUser;
@FindBy(xpath="//input[@type='button' and(@value='      Cancel      ')]")private WebElement cancelButton;

public UsersPage(WebDriver driver) 
{
PageFactory.initElements(driver, this);	
}

// initialization
public WebElement getUserModule() {
	return userModule;
}

public WebElement getCreateUserButton() {
	return createUserButton;
}

public WebElement getUsernameTB() {
	return usernameTB;
}

public WebElement getPasswordTB() {
	return passwordTB;
}

public WebElement getRetypePasswordTB() {
	return retypePasswordTB;
}

public WebElement getFirstnameTB() {
	return firstnameTB;
}

public WebElement getLastnameTB() {
	return lastnameTB;
}

public WebElement getCreateUser() {
	return createUser;
}

public WebElement getCancelButton() {
	return cancelButton;
}
// operational methods
public void userdetail(String validUser,String validPass,String firstName,String lastName) throws InterruptedException
{
	
	userModule.click();
	Thread.sleep(2000);
	usernameTB.sendKeys(validUser);
	Thread.sleep(2000);
	passwordTB.sendKeys(validPass);
	Thread.sleep(2000);
	retypePasswordTB.sendKeys(validPass);
	Thread.sleep(2000);
	firstnameTB.sendKeys(firstName);
	Thread.sleep(2000);
	lastnameTB.sendKeys(lastName);
	Thread.sleep(2000);
	createUser.click();
	Thread.sleep(2000);
	
	
	
}




















}
