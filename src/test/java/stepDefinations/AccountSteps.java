package stepDefinations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.factory.DriverFactory;
import com.pages.AccountsPage;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountSteps {
	private LoginPage login = new LoginPage(DriverFactory.getDriver());
	private AccountsPage account;

	@Given("User is already logged into application")
	public void user_is_already_logged_into_application(io.cucumber.datatable.DataTable dataTable) {
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=history");

		List<Map<String, String>> cred = dataTable.asMaps();
		String user = cred.get(0).get("username");
		String pwd = cred.get(0).get("password");
		account = login.doLogin(user, pwd);
	}

	@Given("User is on Accounts page")
	public void user_is_on_accounts_page() {
		System.out.println("Accounts Page Title"+account.getAccountsPageTitle());
	}

	@Then("user gets accounts section")
	public void user_gets_accounts_section(io.cucumber.datatable.DataTable sectionList) {
		List<String> expected = sectionList.asList();
		System.out.println(expected);
		List<String> actualList=account.getSubMenuAcc();
		System.out.println(actualList);
		Assert.assertTrue(actualList.containsAll(expected));
	}

	@Then("accounts section count should be {int}")
	public void accounts_section_count_should_be(Integer expectedSize) {
		Assert.assertTrue(account.getCountOfSubmenu() == expectedSize);
	}

}
