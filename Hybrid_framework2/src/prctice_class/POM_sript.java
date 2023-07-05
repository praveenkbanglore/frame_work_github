package prctice_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_sript {
	//declaration
	@FindBy(xpath="//input[@id='firstName']")
	private WebElement ftname;
	@FindBy(xpath="//input[@id='lastName']")
	private WebElement ltname;
	
	@FindBy(xpath="//input[@id='userEmail']")
	private WebElement email;
	@FindBy(xpath="//label[@for='gender-radio-1']")
	private WebElement gdrbtn;
	
	@FindBy(xpath="//input[@id='userNumber']")
	private WebElement mobnuber ;
	@FindBy(xpath="//input[@id = 'dateOfBirthInput']")
	private WebElement dob ;

	
	@FindBy(xpath="//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")
	private WebElement subject ;
	@FindBy(xpath="//label[@for='hobbies-checkbox-1']")
	private WebElement hbscheckbox ;
	
	@FindBy(xpath="//input[@id = 'uploadPicture']")
	private WebElement picture ;
	@FindBy(xpath="//textarea[@id='currentAddress']")
	private WebElement adress;
	//initialization
	public  POM_sript(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
//utilization
	public void practice1()
	{
		ftname	.sendKeys("santosh");
	}
	public void practice2()
	{
		ltname	.sendKeys("don");
	}
	public void practice3()
	{
		email.sendKeys("santosh@gmail.com");
	}
	public void practice4()
	{
		gdrbtn.click();
	}
	public void practice5()
	{
		mobnuber.sendKeys("1234567890");
	}
	public void practice6()
	{
		dob.sendKeys("28 Jun 2023");
	}
	public void practice7()
	{
		subject.sendKeys("qspider");
	}
	public void practice8()
	{
		hbscheckbox.click();
	}
	public void practice9()
	{
		picture.click();
	}
	public void practice10()
	{
		adress.click();
	}
	
}
