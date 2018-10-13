package demo;


import org.apache.http.client.fluent.Request;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AppTest {

    private static App app;

    @BeforeAll
    static void startApp() throws Exception {
        app = new App();
        app.start();
    }

    @AfterAll
    static void stopApp() throws Exception {
        app.stop();
    }

    @Test
    public void get_should_respond_with_hello_world() throws Exception {
        // given

        // when
        String reponse = Request.Get("http://localhost:" + app.port() + "/").execute().returnContent().asString();

        // then
        assertEquals("Hello World!", reponse);
    }

}
