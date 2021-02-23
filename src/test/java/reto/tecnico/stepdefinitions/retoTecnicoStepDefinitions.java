package reto.tecnico.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import reto.tecnico.questions.Answer;
import reto.tecnico.tasks.OpenUp;
import reto.tecnico.tasks.fillForm;

public class retoTecnicoStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Diego enters the uTest page$")
    public void thanDiegoEntersTheUTestPage() {
        OnStage.theActorCalled("Diego").wasAbleTo(OpenUp.thepage());
    }

    @When("^Complete the following information in the form$")
    public void completeTheFollowingInformationInTheForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(fillForm.the());

    }

    @Then("^The user must be successfully registered on the page$")
    public void theUserMustBeSuccessfullyRegisteredOnThePage(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(message)));
    }
}
