package com.co.seguimientos.stepsdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import groovyjarjarantlr.debug.MessageEvent;
import models.DatesfeorPQRS;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import questions.MessageNoSend;
import questions.MessageSend;
import tasks.PQRSTasks;

import java.util.List;

public class PQRSStepsDefinition {
    @When("^i go the module PQRS and write my request$")
    public void iGoTheModulePQRSAndWriteMyRequest(List<DatesfeorPQRS>datesfeorPQRS) {
        DatesfeorPQRS datesfeorPQRS1;
        datesfeorPQRS1=datesfeorPQRS.get(0);
        OnStage.theActorInTheSpotlight().wasAbleTo(PQRSTasks.pqrsTasks(datesfeorPQRS1));
    }


    @Then("^the request will be send$")
    public void theRequestWillBeSend() {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MessageSend.messageSend(), Matchers.is("Mensaje enviado")));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Then("^the request will not be send$")
    public void theRequestWillNotBeSend() {
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MessageNoSend.messagenoSend(),Matchers.is("Error")));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
