package com.co.seguimientos.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Credentials;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.LoginTasks;

import java.util.List;

public class LoginStepsDefinitions {
    @Managed
    WebDriver webDriver;
    @Before
    public void setup(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(webDriver));
    }


    @Given("^i opened the page$")
    public void iOpenedThePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://seguimientos.cloudsenactpi.net/"));

    }


    @When("^i enter corrects for login in the form$")
    public void iEnterCorrectsForLoginInTheForm(List<Credentials>credentialsList) {
    Credentials credentials;
    credentials=credentialsList.get(0);
    OnStage.theActorInTheSpotlight().wasAbleTo(LoginTasks.loginTasks(credentials));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("^i will be login sucesfull$")
    public void iWillBeLoginSucesfull() {

    }
    //------------------------------------------------------------------------------------------------------------------

    @When("^i enter incorrects for login in the form$")
    public void iEnterIncorrectsForLoginInTheForm(List<Credentials>credentialsList) {
    Credentials credentials;
     credentials=credentialsList.get(0);
     OnStage.theActorInTheSpotlight().wasAbleTo(LoginTasks.loginTasks(credentials));
    }


    @Then("^i will not be login sucesfull$")
    public void iWillNotBeLoginSucesfull() {

    }
}
