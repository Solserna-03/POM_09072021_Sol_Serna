package com.saucedemo.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/compra.feature",
        glue = "com.saucedemo.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class CompraRunner {
}
