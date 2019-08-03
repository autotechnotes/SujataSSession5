package company.newproject.testwork;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumfirst {
	
	@Test
	public void first_test() throws InterruptedException
	{
	 //Configuration process:- browser settings
	 System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 //Test steps
	 driver.get("http://techfios.com/test/billing/?ng=admin/"); // goes to the URL
	    // Tear down process:- closes the browser and ends the test case
	 Thread.sleep(2000);
	 driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
	//Type password in the password field
	driver.findElement(By.name("password")).sendKeys("abc123");
	//Click on Sign In button
	Thread.sleep(2000);
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	    driver.close();
	 
	    driver.quit();	
}
}
