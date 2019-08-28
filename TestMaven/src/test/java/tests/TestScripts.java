package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utils.BaseClass;


public class TestScripts extends BaseClass{
	
	//Calling login page
	@Test(priority=1)
	public void callLoginPage() {
		LoginPage l=new LoginPage(driver);
		l.getLoginPage();
	}
	
	//Calling Home page
	@Test(priority=2)
	public void callHomePage(){
		HomePage h=new HomePage(driver);
		h.getHomePage();
	}
}
