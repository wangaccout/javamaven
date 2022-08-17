package mavenone;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
  @Test
  public void f() {
	  System.out.println("this is new test");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void w() {
	  System.out.println("一个测试");
	  Assert.assertTrue(true);
  }
}