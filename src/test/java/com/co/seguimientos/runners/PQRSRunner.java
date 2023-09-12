package com.co.seguimientos.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/PQRS.feature",
        glue = "com.co.seguimientos.stepsdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class PQRSRunner {
}
