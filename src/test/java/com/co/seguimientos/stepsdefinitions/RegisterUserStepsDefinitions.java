package com.co.seguimientos.stepsdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Credentials;
import models.Dates_new_1;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.LoginTasks;
import tasks.NewUserTasks;

import java.util.List;


public class RegisterUserStepsDefinitions {

    @Given("^i opened the page with my credentials and select the option Users$")
    public void iOpenedThePageWithMyCredentialsAndSelectTheOptionUsers(List<Credentials>credentialsList) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://seguimientos.cloudsenactpi.net/"));
        Credentials credentials;
        credentials=credentialsList.get(0);
        OnStage.theActorInTheSpotlight().wasAbleTo(LoginTasks.loginTasks(credentials));
    }


    @When("^i register the dates of to create a new user$")
    public void iRegisterTheDatesOfToCreateANewUser(List<Dates_new_1>datesNew1List) {
        Dates_new_1 dates_new_1;
        dates_new_1=datesNew1List.get(0);
        OnStage.theActorInTheSpotlight().wasAbleTo(NewUserTasks.newUserTasks(dates_new_1));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("^the user will be register$")
    public void theUserWillBeRegister() {
    }

}
