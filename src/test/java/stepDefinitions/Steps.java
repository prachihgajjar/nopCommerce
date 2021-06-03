package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("Launch Google Chrome Browser")
	public void launch_google_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
        driver =  new ChromeDriver();
		lp = new LoginPage(driver);
	    
	
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url){
		driver.get(url);
	
	    
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password)  {
		
	    lp.sendEmail(email);
	    lp.sendPassword(password);

	}

	@When("User clicks on Login")
	public void user_clicks_on_login() {
	    lp.clickLogin();

	}

	@Then("Page title should display {string}")
	public void page_title_should_display(String title) throws Exception {
		if(driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
			
		}
		else {
			Assert.assertEquals(title, driver.getTitle());
		}
		
	    
	    Thread.sleep(3000);
	}

	@When("User clicks on Logout link")
	public void user_clicks_on_logout_link() throws InterruptedException {
	    lp.clickLogout();
	    Thread.sleep(3000);
	    
	}

	@Then("Page title should diaplsy {string}")
	public void page_title_should_diaplsy(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Close Google Chrome Browser")
	public void close_google_chrome_browser() {
	    driver.close();
	   
	}
	

}
