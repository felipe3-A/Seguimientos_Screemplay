package com.co.seguimientos.stepsdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.CardsFinds;
import tasks.SeeInfo;

public class InfoGuidelinesStepsDefinition {

    @When("^i go the module guidelines$")
    public void iGoTheModuleGuidelines() {
        OnStage.theActorInTheSpotlight().wasAbleTo(SeeInfo.seeInfo());
    }


    @Then("^i will see the information$")
    public void iWillSeeTheInformation() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CardsFinds.cardsFinds(),Matchers.is("1")));
    }

}
