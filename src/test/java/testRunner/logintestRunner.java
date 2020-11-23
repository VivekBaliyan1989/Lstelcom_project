package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featureFiles/loginFeature01.feature",
				glue={"pageDefination","Classpath/loginpageStepdefination"},
				plugin = {"html:target/cucumber-html-reports.html"},
				dryRun = false,
				monochrome = true
				)

public class logintestRunner {

	
}
