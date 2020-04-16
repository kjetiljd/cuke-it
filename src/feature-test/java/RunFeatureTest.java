import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"pretty", "html:target/cucumber"},
        tags = {"not @Ignore", "not @WIP"},
        snippets= CucumberOptions.SnippetType.UNDERSCORE,
        strict=true)
public class RunFeatureTest {}