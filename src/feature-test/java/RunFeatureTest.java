import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format={"pretty", "html:target/cucumber"},
        tags = {"~@Ignore", "~@WIP"},
        snippets=SnippetType.UNDERSCORE,
        strict=true)
public class RunFeatureTest {}