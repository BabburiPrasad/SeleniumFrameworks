package StepDefinitions;

import org.openqa.selenium.WebDriver;
import POM.LoginPagePom;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	
	public static WebDriver driver;
	public LoginPagePom loginpage = new LoginPagePom();
	
	LoginStepDef login = new LoginStepDef();
	
	@Given("I am on the OpenCart login page")
	public void i_am_on_the_open_cart_login_page() 
	{
//		driver.manage().window().maximize();
//	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	    System.out.println("Browser Opened");
	    
	}

	@Given("I have entered a valid username and password")
	public void i_have_entered_a_valid_username_and_password()
	{
		LoginPagePom.enterUsername();
		LoginPagePom.enterPassword();
		
	    
//		loginpage.getUsernametextbox("e7w0fnwvv1@rentforsale7.com");
//		loginpage.getPasswordtextbox("Test@123");
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() 
	{
		LoginPagePom.clickOnLogin();
		
//		loginpage.getLoginbutton();
		
		
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() 
	{
		
		Assert.assertEquals("My Account", LoginPagePom.verifyLogin());
//		Assert.assertEquals("My Account", loginpage.getSuccessMessage());
		
	}
	
	@Then("User should logout")
	public void user_should_logout() throws InterruptedException 
	{
		
		LoginPagePom.clickOnLogout();
//		loginpage.getLogOutbutton();
		
	}
//	@Given("I have entered invalid {string} and {string}")
//	public void i_have_entered_invalid_and(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	
//	@When("I click on the {string} link")
//	public void I_click_on_the_login_button(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("I should see an error message indicating {string}")
//	public void i_should_see_an_error_message_indicating(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("I click on the {string} link")
//	public void i_click_on_the_link(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("I should be redirected to the password reset page")
//	public void i_should_be_redirected_to_the_password_reset_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}


}
