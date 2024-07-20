package StepDefentions;

//import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class login {

	@Given("user1 opens browser")
	public void user1_opens_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("How ar you");
	}

	@When("enters userid")
	public void enters_userid() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
//	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters password")
	public void user_enters_password() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("hello");
	}

	@Then("user click the login button")
	public void user_click_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi4");
//	    throw new io.cucumber.java.PendingException();
	}
	
}
