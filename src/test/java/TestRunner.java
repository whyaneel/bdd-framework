import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = {"com.bddframework"}
)
/*
This JUnit TestRunner is equivalent to gradle task cucumber().
 */
public class TestRunner {

}