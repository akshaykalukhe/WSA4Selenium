package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	@FindBy(xpath="//a[.='Logout']")private WebElement logoutLink;
	@FindBy(id="SubmitTTButton")private WebElement saveLeaveTimeButton;
	@FindBy(xpath="//div[.='Users']")private WebElement users;
	@FindBy(name="usersSelector.selectedUser")private WebElement enterTimeTrackDropDown;
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	// Utilization
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getSaveleaveTimeButton() {
		
		return saveLeaveTimeButton;
	}

	public WebElement getUsers() {
		return users;
	}

	public WebElement getEnterTimeTrackDropDown() {
		return enterTimeTrackDropDown;
	}
	// Operational methods
	public void logOut() throws InterruptedException
	{
		Thread.sleep(2000);
		logoutLink.click();
	}
	public void clickOnUsers() throws InterruptedException
	{
		Thread.sleep(2000);
		users.click();
	}
	public void clickOnSaveLeaveTime() throws InterruptedException
	{
		Thread.sleep(2000);
		saveLeaveTimeButton.click();
	}
	public void selectUser(int index) throws InterruptedException
	{
		Select sel = new Select(enterTimeTrackDropDown);
		Thread.sleep(2000);
		sel.selectByIndex(index);
	}
	
}


