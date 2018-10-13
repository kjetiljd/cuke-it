package demo;

import ratpack.server.RatpackServer;
import ratpack.server.ServerConfig;

public class App {

    private RatpackServer server;

    public static void main(String[] args ) throws Exception {
        new App().start();
    }

    void start() throws Exception {
        server = RatpackServer.start(server -> server
                .serverConfig(ServerConfig.embedded())
                .registryOf(registry -> registry.add("World!"))
                .handlers(chain -> chain
                        .get(ctx -> ctx.render("Hello " + ctx.get(String.class))))
                );

    }

    String port() {
        return "" + server.getBindPort();
    }

    void stop() throws Exception {
        server.stop();
    }
}
