package TestNG_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Using_Assertions {

	
	 
	 @Test (priority = 1)
	 public void OpenBrowser() {
		 
		 System.setProperty("webdriver.chrome.driver", "D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn\\POM_Help\\chromedriver_win32/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.google.com/");
		 String s=driver.getTitle();
		 Assert.assertEquals(s, "Google"); 
//		 Assert.assertEquals(s, "GGoogle");  >> will return exception
		 Assert.assertNotEquals(s, "gGoogle", "Expected & Actual results are wrong."); 

		 driver.close();
		 driver.quit();
		 



	 }
}
