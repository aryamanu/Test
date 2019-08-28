package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id='username']")
	public WebElement username;
	@FindBy(xpath="//*[@name='password']")
	public WebElement password;
	@FindBy(xpath="/html/body/app-root/app-login/div/div/div/div/div/section/div[3]/div/div/div[4]/div[3]/button")
	public WebElement loginbtn;
	
	//Login process
	public void getLoginPage() {
		username.sendKeys("amanu");
		password.sendKeys("amanu");
		loginbtn.click();
	}
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
