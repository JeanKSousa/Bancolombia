package bancolombia.stepdefinitions;

import bancolombia.interactions.Changing;
import bancolombia.task.OpenUp;
import bancolombia.task.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static bancolombia.userinterface.TreatmentPolicies.NUMBER_WINDOW;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SeeBancolombiaStepdefinition {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^Enter the Bancolombia$")
    public void enterTheBancolombia() throws Exception {
        theActorCalled("Jean Sousa").wasAbleTo(OpenUp.thePage());
    }

    @When("^I am looking for Policies treatment and protection of personal data$")
    public void iAmLookingForPoliciesTreatmentAndProtectionOfPersonalData() throws Exception {
        theActorInTheSpotlight().attemptsTo(Search.document());
    }

    @Then("^I can see that the document$")
    public void iCanSeeThatTheDocument() throws Exception {
        theActorInTheSpotlight().attemptsTo(Changing.theWindow(NUMBER_WINDOW));
    }
}
