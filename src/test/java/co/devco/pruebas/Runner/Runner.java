package co.devco.pruebas.Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "co.devco.pruebas.Stepdefinitions",
        features = "src/test/resources/features/",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@test",
        monochrome = true

)
public class Runner {
}
