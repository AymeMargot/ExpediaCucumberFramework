import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/java/features"},
        glue ={"steps"},
        plugin = {"pretty","html:target/cucumber-reports"}
)
public class TestRunner {

}
