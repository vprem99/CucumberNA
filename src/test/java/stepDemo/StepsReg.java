package stepDemo;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsReg {
	@Given("user is no login page")
	public void user_is_no_login_page() {

	}

	@When("User enters following details")
	public void user_enters_following_details(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> ls = dataTable.asLists();
		for (List<String> x : ls) {
			System.out.println(x);
		}
	}

	@When("User enters following details as Map")
	public void user_enters_following_details_as_map(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> ls=	dataTable.asMaps();
		
		System.out.println(ls.get(2).get("sname"));
	}

	@Then("user should be logged in")
	public void user_should_be_logged_in() {

	}

}
