package org.StepDefinition;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class loginStepDef {
		
		static WebDriver driver;
		
		@Given("I am on the OpenCart login page")
		public void i_am_on_the_open_cart_login_page() {
		    // Write code here that turns the phrase above into concrete actions
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    
		}

		@Given("I have entered a valid username and password")
		public void i_have_entered_a_valid_username_and_password() {
		    driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("e7w0fnwvv1@rentforsale7.com");
//		    e7w0fnwvv1@rentforsale7.com
//		    Trest@123
		    
		    driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Test@123");
		}

		@When("I click on the login button")
		public void i_click_on_the_login_button() {
		    
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		}

		@Then("I should be logged in successfully")
		public void i_should_be_logged_in_successfully() {
			
			WebElement myAccountElement = driver.findElement(By.xpath("(//a[@class='list-group-item'][1])"));

			Assert.assertTrue(myAccountElement.isDisplayed(), "My Account link is not displayed");
			//Assert.assertTrue(driver.findElements(By.xpath("//a[text()='My Account']")).size()>0);
		    //driver.findElement(By.xpath("//a[text()='My Account']"));
		}
		
//		@Then("User should log out")
//		public void user_should_logout() {
//			driver.findElement(By.xpath("//a[class='list-group-item']")).click();
//		}
		
		@Then("User should logout")
		public void user_should_logout() throws InterruptedException {
			
			driver.findElement(By.xpath("(//a[@class='list-group-item'][13])")).click();
			
			Thread.sleep(5000);
			
			driver.close();
		}
	
	

}
