package class_pr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom extends BasePage{
	//declaration
			@FindBy(xpath="//input[@id='email']")
			private WebElement un;
			
			@FindBy(xpath="//input[@id='pass']")
			private WebElement pwd;
			
			@FindBy(xpath="//input[@iname='login']")
			private WebElement login;
			
			//initialization
			public  Pom(WebDriver driver)
			{
				super(driver);
			}
		//utilization
			public void practice1()
			{
					un.sendKeys("santosh");
			}
			public void practice2()
			{
				pwd.sendKeys("don");
			}
			public void practice3()
			{
				login.click();
			}
			
		}
