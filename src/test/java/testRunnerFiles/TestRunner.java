package testRunnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/featureFiles/", 
		glue = "src/test/java/stepDefinitionFiles/",
		monochrome = true,
		plugin = {"pretty", "html:target/testOutput", "junit:target/report.xml"},
		strict = true,
		dryRun = false)

public class TestRunner {

}