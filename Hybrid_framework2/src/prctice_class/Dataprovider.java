package prctice_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@Test(dataProvider = "testData")
	public void validTest(String un,String pwd)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"./sowtwares/chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).clear();
		driver.close();
	}
@DataProvider(name="testData")
public Object[][]createData1()
{
return new object[][] {
	{"cedric","admin"},
	{"anne","manager"},
		};
}
}
