package stepdefs;

import cucumber.api.java.no.Når;
import cucumber.api.java.no.Så;
import demo.App;
import org.apache.http.client.fluent.Request;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings({"NonAsciiCharacters", "SpellCheckingInspection"})
public class StepDefinitions {

    private String port;
    private String reponse;
    private App app = new App();

    public StepDefinitions() throws Exception {
        app.start();
        port = app.port();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                app.stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
    }

    @Når("^jeg tar kontakt$")
    public void jeg_gjør_et_kall() throws Throwable {
        reponse = Request.Get("http://localhost:" + port + "/").execute().returnContent().asString();
    }

    @Så("^blir jeg hilset$")
    public void blir_jeg_hilset() throws Throwable {
        assertEquals("Hello World!", reponse);
    }
}
