package stepDefs;

import baseTest.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Login;

public class LoginTest extends BaseClass{
	Login loginpg = new Login(BaseClass.driver);
	
	@Given("^Open Browser and navigate to Login page$")
	public void open_Browser_and_navigate_to_Login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    loginpg.openBrowser();
	}

	@When("^valid \"([^\"]*)\" and \"([^\"]*)\" is entered$")
	public void valid_and_is_entered(String arg1, String arg2) {
	    // Write code here that turns the phrase above into concrete actions
	    loginpg.login(arg1, arg2);
	}

	@Then("^User should be logged in successfully$")
	public void user_should_be_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	
	
	
}
