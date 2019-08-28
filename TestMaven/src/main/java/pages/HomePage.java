package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	@FindBy(xpath="/html/head/title")
	public WebElement homepage;
	
	//Home page verification
	public void getHomePage() {
		String expectedTitle="Assessment Management System";
		String actualTitle="";
		actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("User is currently in Home Page");
		}else {
			System.out.println("Some other window opened!");
		}
		Boolean b=homepage.isEnabled();
		if(b) {
			System.out.println("Welcome to Assessment Management System");
		}else
			System.out.println("Wrong Window!!");
	}
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
