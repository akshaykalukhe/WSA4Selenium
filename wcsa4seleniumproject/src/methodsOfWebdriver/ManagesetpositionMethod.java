package methodsOfWebdriver;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagesetpositionMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();// maximize the window
		Thread.sleep(4000);
		Point targetPosition=new Point(350,250);
		driver.manage().window().setPosition(targetPosition) ;
	

}
}
