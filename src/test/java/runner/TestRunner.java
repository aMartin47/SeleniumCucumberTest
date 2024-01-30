package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDef", "utilities"},
        plugin = {"pretty", "html:target/cucumber-html-reort", "json:cucumber.json"}
)

public class TestRunner {


}
