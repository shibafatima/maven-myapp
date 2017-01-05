import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	public static FirefoxDriver driver 	  		= new FirefoxDriver();
	
  @Test
  public void testLoginPage() throws InterruptedException {

	  /* Successful Test Case Begin*/
		
		System.out.println("Testing Success Case");
		driver.findElement(By.name("uname")).sendKeys("test1");
		driver.findElement(By.name("password")).sendKeys("pwd");
		Thread.sleep(2000);
		driver.findElement(By.name("commit")).submit();
		Assert.assertEquals("Login Success", driver.getTitle());
		/* Successful Test Case End */
	/*	Thread.sleep(2000);
		 Failure Test Case with wrong username Begin
		l_title = null;
		System.out.println("Testing Failure Test Case with wrong username");
		driver.findElement(By.name("uname")).sendKeys("test");
		driver.findElement(By.name("password")).sendKeys("pwd");
		Thread.sleep(2000);
		driver.findElement(By.name("commit")).submit();
		Assert.assertEquals("Login Failure", l_title);
		 Failure Test Case with wrong username End 
		Thread.sleep(2000);
		 Failure Test Case with blamk username Begin
		l_title = null;
		System.out.println("Testing Failure Test Case with wrong username");
		driver.findElement(By.name("uname")).sendKeys(" ");
		driver.findElement(By.name("password")).sendKeys("pwd");
		Thread.sleep(2000);
		driver.findElement(By.name("commit")).submit();
		Assert.assertEquals("Login Failure", l_title);*/
		/* Failure Test Case with wrong username End */
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver.get("http://10.152.102.104:8080/MyApp/LoginPage.jsp");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  System.exit(0);
  }
  
}