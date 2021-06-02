package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/BuscadorDafiti.feature",//debe ir el nombre la ruta del feature 
		glue = "stepDefinitions",
		snippets = SnippetType.CAMELCASE) //

public class BuscadorDafitiRunner {

}
