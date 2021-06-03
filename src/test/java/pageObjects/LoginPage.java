package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver; 

	public LoginPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	@FindBy(id ="Email")
	WebElement txtEmail;

	@FindBy(id ="Password")
	WebElement txtPassword;

	@FindBy( xpath ="//*[@class='button-1 login-button']")
	WebElement btnLogin;
	
	@FindBy( linkText ="Logout")
	WebElement btnLogout;
	
	
	
	
	


public void sendEmail(String email) {
	txtEmail.clear();
	txtEmail.sendKeys(email);
}
public void sendPassword(String pwd) {
	txtPassword.clear();
	txtPassword.sendKeys(pwd);
}
public void clickLogin() {
	btnLogin.click();
}
public void clickLogout() {
	btnLogout.click();
}

}