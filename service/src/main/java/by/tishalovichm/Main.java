package by.tishalovichm;

import by.tishalovichm.server.PokemonServer;

import java.io.IOException;

public class Main {

    private static final int PORT = 54321;

    public static void main(String[] args) throws IOException, InterruptedException {
        var pokemonServer = new PokemonServer(PORT);
        pokemonServer.start();
    }

}
