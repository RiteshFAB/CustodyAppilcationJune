package stepDefination;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.FacebookPage;

public class FacebookStepDef {

	public static WebDriver driver;
	public FacebookPage facebook;

	@Given("user launch url for facebook application")
	public void user_launch_url_for_facebook_application() throws Exception {
		facebook=new FacebookPage(driver);
		facebook.launchUrl();

	
	}

	@When("user enters the user credentials")
	public void user_enters_the_user_credentials() throws Exception {
	facebook.login();
	}

	@Then("use validate Home Page")
	public void use_validate_Home_Page() {
		facebook.validation();
	}
}
