import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"pretty", "html:target/cucumber"},
        tags = {"not @Ignore", "not @WIP"},
        snippets=SnippetType.UNDERSCORE,
        strict=true)
public class RunFeatureTest {}