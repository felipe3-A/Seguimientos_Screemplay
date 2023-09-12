package com.co.seguimientos.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/AprendizInfo.feature",
        glue = "com.co.seguimientos.stepsdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class AprendiceInfo {

}
