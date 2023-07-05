package class_pr;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_s_RUNNER_C  extends Base_test{
     @Test(dataProvider = "testdata")
     public void test1(String d1,String d2)throws InterruptedException
     {
    	 Pom p = new Pom(driver);
    	 p.practice1(d1);
    	 Thread.sleep(2000);
    	 p.practice2(d2);
    	 Thread.sleep(2000);
    	 p.practice3();
    	 Thread.sleep(2000);
    	 Assert.fail();
     }

}
