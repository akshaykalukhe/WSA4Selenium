package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();// maximize the window
		Thread.sleep(4000);
		driver.get("https://www.orangehrm.com");// to launch webapp
		Thread.sleep(4000);
		String TitleOfwebpage=driver.getTitle();// get the title of current webpage
		System.out.println(TitleOfwebpage);
}
}