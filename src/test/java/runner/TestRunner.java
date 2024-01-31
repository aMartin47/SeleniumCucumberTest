package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.Set;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features"
        ,glue={"stepDef"}
)

public class TestRunner {
}
