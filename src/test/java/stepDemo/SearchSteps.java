package stepDemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	@Given("I am search Page of Amazon")
	public void i_am_search_page_of_amazon() {
		
	}

	@When("I search for product with name {string} with price {int}")
	public void i_search_for_product_with_name_with_price(String productName, Integer price) {
		
	}

	@Then("product with name {string} should display")
	public void product_with_name_should_display(String productName) {
		
	}

}
