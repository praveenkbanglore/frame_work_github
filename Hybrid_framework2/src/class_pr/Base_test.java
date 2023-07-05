package class_pr;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements Framework_const {

	public WebDriver driver;
	@BeforeMethod
	public void openAppln()throws InterruptedException
	{
		System.setProperty(chrome_key1,chrome_value1);
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("base_url");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}
	@AfterMethod
	public void closeAppln(ITestResult res)throws IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			take_sreen_shot.getphoto(driver);
		}
		driver.close();
	}
}

