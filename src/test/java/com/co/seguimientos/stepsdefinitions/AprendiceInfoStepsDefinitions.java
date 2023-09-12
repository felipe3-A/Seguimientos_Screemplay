package com.co.seguimientos.stepsdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Credentials;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.LoginTasks;

import java.util.List;

public class AprendiceInfoStepsDefinitions {
    @Given("^i enter corrects for login in the page$")
    public void iEnterCorrectsForLoginInThePage(List<Credentials>credentialsList) {
    Credentials credentials;
    credentials=credentialsList.get(0);
        OnStage.theActorInTheSpotlight().wasAbleTo(LoginTasks.loginTasks(credentials));

    }


    @When("^i enter dates for to aggregate a new aprencice$")
    public void iEnterDatesForToAggregateANewAprencice() {


    }

    @Then("^i will see the aprendice created$")
    public void iWillSeeTheAprendiceCreated() {

    }
}
