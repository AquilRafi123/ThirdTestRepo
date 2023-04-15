package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.LoginPage;

public class LoginSteps {
//	WebDriver driver;--this was not needed even if we worked directly without base class
	
	LoginPage fn = new LoginPage();
	
	
	
	@Given("User is on landing page")
	public void user_is_on_landing_page() {
		fn.landingPage();
		
	    
	}

	@Given("User enter valid user name {string}")
	public void user_enter_valid_user_name(String username ) {
	    fn.userName(username);
	}

	@Given("User enters valid Password {string}")
	public void user_enters_valid_password(String pswd) {
	    fn.password(pswd);
	}
	
	@Given("user clicks on login button")
	public void user_clicks_on_login_button() {
	   fn.loginClick();
	}
	
	
	@Then("validate user logged in successfully")
	public void validate_user_logged_in_successfully() {
	    
	}
	
}
