package jenkinmvnpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class jenkintest {
	
public WebDriver driver;
	
@BeforeMethod 
	 public void beformethod()
	 {
		 System.setProperty("webdriver.gecko.driver", "D:\\Automation\\geckodriver.exe");
	     driver = new FirefoxDriver();
	     
	       /* System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
			driver = new ChromeDriver();*/
	     
	 }
  @Test
  public void f() {
	  driver.get("https://www.gmail.com");
  }
  
  @AfterMethod
  
  public void aftermethod()
  {
	  driver.quit();
  }
  
}
