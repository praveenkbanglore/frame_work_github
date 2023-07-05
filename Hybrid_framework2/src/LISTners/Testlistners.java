package LISTners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Testlistners  implements ITestListener{

	
	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("test case is started");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("test case is passed");
	}

	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test case is fails");
	}

	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("test case is skipped");
	}
}
