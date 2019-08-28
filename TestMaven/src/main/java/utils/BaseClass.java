package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	
	public WebDriver driver;
	
	//Verify URL is correct or not
	@Test(priority=0)
	public void verifyURL() {
		Assert.assertEquals(driver.getCurrentUrl(), "http://smart-innovation.westus.cloudapp.azure.com/ams-ui/#/login");
		System.out.println("Successfully Verified URL");
	}
	
	//Launching URL
	@BeforeTest
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D://Arya_Manu//Desktop//Selenium-Arya//chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://smart-innovation.westus.cloudapp.azure.com/ams-ui/");
		driver.manage().window().maximize();
		
	}
	
	//Closing browser window
	@AfterTest
	public void afterMethod() {
		driver.close();
	}
	
}
