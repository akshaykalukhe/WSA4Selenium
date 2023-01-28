package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingCase4 
{
	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();// maximize the window
		Thread.sleep(4000);
		driver.get("https://in.puma.com/in/en?msclkid=f9c641ed980d197e41c6227f614c3344&msclkid=f9c641ed980d197e41c6227f614c3344&utm_aud=OTH&utm_campaign=BS_BNG_SEA-TXT_OTH_Brand_New&utm_medium=BS&utm_obj=CONV&utm_source=BNG-SEA-TXT");
		driver.findElement(By.xpath("//h3[@class='tw-8216tu' and(contains(.,'PWRFRAME Aerogram Blaze Sneakers'))]")).click();
	
	}
}
