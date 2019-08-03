package company.newproject.testwork;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
  
public class assignmentone {
	   @Test
	public assignmentone() {
	System.setProperty("webdriver.chromedriver", "C:\\auto\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	
	
	
	}

}
