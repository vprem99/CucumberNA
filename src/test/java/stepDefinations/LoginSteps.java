package stepDefinations;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	String actualTitle;
	private LoginPage lp = new LoginPage(DriverFactory.getDriver());

	@Given("user is on login Page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=history");
	}

	@When("user gets the title of the Page")
	public void user_gets_the_title_of_the_page() {
		actualTitle = lp.getLoginPageTitle();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expected) {
		Assert.assertTrue(actualTitle.contains(expected));
	}

	@Then("Forgot password 	link should be displayed")
	public void forgot_password_link_should_be_displayed() {
		Assert.assertTrue(lp.isForgotPwdExist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String user) {
		lp.enterUserName(user);
	}

	@When("user enters password {string}")
	public void user_enters_password(String pass) {
		lp.enterPassword(pass);
	}

	@When("Click on login button")
	public void click_on_login_button() {
		lp.clickOnLogin();
	}


}
