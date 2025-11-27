package com.company.iseries.stepdefinitions;

import com.company.iseries.tasks.ConnectToISeries;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;

public class IseriesStepsDefinitions {
    private final Actor user = Actor.named("Catalina");

    @Given("the user connects to the iSeries system")
    public void connectToISeries() {
        user.attemptsTo(
                ConnectToISeries.withCredentials()
        );
    }

    @When("the user executes the AS400 query")
    public void executeQuery() {
        user.attemptsTo(
                //ExecuteAS400Query.withDefaultParameters()
        );
    }

    @Then("the response should contain valid iSeries data")
    public void validateResponse() {
        user.attemptsTo(
                //ValidateISeriesResponse.content()
        );
    }
}
