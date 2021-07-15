package bancolombia.stepdefinitions;

import bancolombia.model.SearchData;
import bancolombia.question.Validating;
import bancolombia.task.OpenUp;
import bancolombia.task.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class BancolombiaStepdefinition {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^Enter the Bancolombia site$")
    public void enterTheCivilAeronauticsSite() {

        theActorCalled("Jean Sousa").wasAbleTo(OpenUp.thePage());
    }

    @When("^I am looking for Policies treatment and protection of personal data of suppliers$")
    public void iAmLookingForTheStatementOfFinancialPositionForTheMonthOf() throws Exception{
        theActorInTheSpotlight().attemptsTo(Search.document());
    }

    @Then("^I can validate that the document is$")
    public void iCanValidateThatTheDocumentIs(List<SearchData> searchData) throws Exception {
        theActorInTheSpotlight().should(seeThat(Validating.theDocument(searchData)));
    }
}
