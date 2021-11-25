package stepDefinitionFiles;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	WebDriver driver;

	@Given("^User on signin landing page$")
	public void user_on_signin_landing_page() throws Throwable {
		System.out.println("Scenario 1: user on sign in page");

	}

	@Given("^user on signup page$")
	public void user_on_signup_page() throws Throwable {

		System.out.println("Scenario 1: user on sign up page");

	}

	@When("^user logs in with below data$")
	public void user_logs_in_with_below_data(DataTable data) throws Throwable {

		List<List<String>> info = data.asLists();
		System.out.println("Scenario 1: " + info.get(0).get(0));
		System.out.println("Scenario 1: " + info.get(0).get(1));
		System.out.println("Scenario 1: " + info.get(0).get(2));
		System.out.println("Scenario 1: " + info.get(0).get(3));

	}

	@And("^clicks on signup button$")
	public void clicks_on_signup_button() throws Throwable {
		System.out.println("Scenario 1: clicks on signup button");

	}

	@Then("^user navigated to account page$")
	public void user_navigated_to_account_page() throws Throwable {
		System.out.println("Scenario 1: user navigated to account landing ");

	}

	@Given("^user is in PDP page$")
	public void user_is_in_pdp_page() throws Throwable {
		System.out.println("Scenario 2: user is in PDP page");

	}

	@When("^user clicks on add to bag button$")
	public void user_clicks_on_add_to_bag_button() throws Throwable {
		System.out.println("Scenario 2: user clicks on add to bag button");

	}

	@Then("^product is added to bag$")
	public void product_is_added_to_bag() throws Throwable {
		System.out.println("Scenario 2 : product is added to bag ");

	}

	@Before
	public void open_the_browser() throws Throwable {
		System.out.println("Before: Browser launched");

	}

	@Before
	public void delete_all_the_cookies() throws Throwable {
		System.out.println("Before: All the cookies deleted");

	}

	@Before
	public void load_the_browser() throws Throwable {
		System.out.println("Before: Loading the application");

	}

	@After
	public void close_app() {
		System.out.println("After: Logged out of app");
	}

	@After
	public void close_browser() {
		System.out.println("After: closed the browser");
	}

}