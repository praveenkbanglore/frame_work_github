package prctice_class;

import org.testng.annotations.Test;

public class Runner extends Genaric1
{
	@Test
	public void test() throws InterruptedException
	{
		POM_sript p = new POM_sript(driver);
		p.practice1();
		Thread.sleep(2000);
		p.practice2();
		Thread.sleep(2000);
		p.practice3();
		Thread.sleep(2000);
		p.practice4();
		Thread.sleep(2000);
		p.practice5();
		Thread.sleep(2000);
		p.practice6();
		Thread.sleep(2000);
		p.practice7();
		Thread.sleep(2000);
		p.practice8();
		Thread.sleep(2000);
		p.practice9();
		Thread.sleep(2000);
		p.practice10();
		Thread.sleep(2000);

	}

}
