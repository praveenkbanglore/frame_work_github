
package genaric_sript;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.ITestResult;
import org.testng.annotations.Test;

public class properties {
	@Test
	public void test1()throws FileNotFoundException,IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./p.properties"));
		String u=p.getProperty("baseURL");
		System.out.println(u);
	}
	public void test2(String path,String key)throws FileNotFoundException,IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("path"));
		String u=p.getProperty("key");
		System.out.println(u);
	}

}
