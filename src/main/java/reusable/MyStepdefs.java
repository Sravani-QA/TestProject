package reusable;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class MyStepdefs {
    @Given("I initiate chrome driver")
    public void iInitiateChromeDriver() {
    }

    @Given("I'll navigate to the Jupiter application")
    public void iLlNavigateToTheJupiterApplication() {
    }

    @Given("I'm on jupiter application Homepage")
    public void iMOnJupiterApplicationHomepage() {
    }

    @When("I click on login page")
    public void iClickOnLoginPage() {
    }

    @And("I click on Submit button")
    public void iClickOnSubmitButton() {
    }

    @Then("I validate error message")
    public void iValidateErrorMessage() {
    }

    @And("I entered below login details")
    public void iEnteredBelowLoginDetails() {

    }

    @And("I entered below {string} and {string} login details")
    public void iEnteredBelowAndLoginDetails(String username, String password) {
    }

    @Then("I validate success message")
    public void iValidateSuccessMessage(DataTable dataTable) {
       // dataTable.get("Username");
    }
}
