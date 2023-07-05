package prctice_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Genaric1 {
	public WebDriver driver;
	@BeforeMethod
	public void openAppln()throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"./sowtwares/chromedriver.exe");

		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	@AfterMethod
	public void closeAppln()
	{
		driver.close();
	}
}

