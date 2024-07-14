package by.tishalovichm.client;

import by.tishalovichm.grpc.PokemonServiceOuterClass.Pokemon;

public class PokemonPrinter {

    public String print(Pokemon pokemon) {
        return String.format(
                "Pokemon {name=%s, hp=%d, description=%s}",
                pokemon.getName(),
                pokemon.getHealth(),
                pokemon.getDescription()
        );

    }

}
