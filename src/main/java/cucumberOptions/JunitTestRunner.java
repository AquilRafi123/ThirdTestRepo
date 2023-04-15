package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/feature",
		glue="stepDefinitions", tags= "@Aquil" , monochrome = true ,
		plugin= ""
		
		)


public class JunitTestRunner {

}
