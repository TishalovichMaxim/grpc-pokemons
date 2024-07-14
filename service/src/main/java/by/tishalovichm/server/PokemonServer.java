package by.tishalovichm.server;

import by.tishalovichm.service.PokemonServiceImpl;
import io.grpc.Grpc;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import java.io.IOException;
import java.util.logging.Logger;

public class PokemonServer {

    private static final Logger LOGGER = Logger.getLogger(
            PokemonServer.class.getName());

    private final int port;

    private final Server server;

    public PokemonServer(int port) {
        this.port = port;

        server = Grpc.newServerBuilderForPort(port, InsecureServerCredentials.create())
                .addService(new PokemonServiceImpl())
                .build();
    }

    public void start() throws IOException, InterruptedException {
        server.start();

        LOGGER.info("Server started, listening on " + port);

        server.awaitTermination();

        Runtime.getRuntime().addShutdownHook(new Thread() {

            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                server.shutdown();
                System.err.println("*** server shut down");
            }

        });
    }

}
