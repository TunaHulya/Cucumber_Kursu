package StepDefinitions;

import Pages.LeftNav;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _02_CountrySteps {
  LeftNav leftNav=new LeftNav();

  @Then("^Navigate to country page$")
  public void navigate_to_country_page() {

    leftNav.findElementAndClickFunction("setupOne");
    leftNav.findElementAndClickFunction("parameters");
    leftNav.findElementAndClickFunction("country");
  }

  @When("^Create a country$")
  public void create_a_country()  {

  }

  @Then("^Success message should be displayed$")
  public void success_message_should_be_displayed() {

  }
}
