package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(   tags = "@Test_01",
                    glue = {"stepDefinition"},
                    features = "src/test/java/feature",
                    plugin = {"pretty", "json:target/ReportJson/LocalChromecucumber.jason"})
public class Runner {
}
