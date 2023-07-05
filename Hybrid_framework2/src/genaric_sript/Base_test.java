package genaric_sript;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements Framework_constant
{
	public WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty("chrome_key","chrome_value");
		driver=new FirefoxDriver();
		driver.get(base_url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeAppln(ITestResult res)throws IOException
	{
		driver.close();
	}

}
