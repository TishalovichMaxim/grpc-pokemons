package by.tishalovichm;

import by.tishalovichm.client.PokemonPrinter;
import by.tishalovichm.client.PokemonServiceClient;
import by.tishalovichm.grpc.PokemonServiceOuterClass.Pokemon;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    private static final String HOST = "localhost";

    private static final int PORT = 54321;

    public static void main(String[] args) {
        var client = new PokemonServiceClient(HOST, PORT);

        var pokemonPrinter = new PokemonPrinter();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Input pokemon name:");

            String pokemonName = scanner.nextLine();

            Optional<Pokemon> pokemon = client.getPokemon(pokemonName);

            if (pokemon.isPresent()) {
                String pokemonInfo = pokemonPrinter.print(pokemon.get());
                System.out.println(pokemonInfo);
            } else {
                System.out.printf("Pokemon with name: \"%s\" not found...%n",
                        pokemonName);
            }
        }
    }
}