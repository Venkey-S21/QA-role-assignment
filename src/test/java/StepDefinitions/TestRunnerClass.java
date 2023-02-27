package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles",glue= {"StepDefinitions"},
monochrome = true,
plugin = {"pretty", "html:target/HTML Report/report.html",
		"json:target/Json Report/report.json",
		"junit:target/Junit Report/report.xml"
		
}
)

public class TestRunnerClass {

}
