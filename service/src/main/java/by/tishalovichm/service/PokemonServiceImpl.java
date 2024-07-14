package by.tishalovichm.service;

import by.tishalovichm.grpc.PokemonServiceGrpc.PokemonServiceImplBase;
import by.tishalovichm.grpc.PokemonServiceOuterClass;
import by.tishalovichm.grpc.PokemonServiceOuterClass.PokemonResponse;
import by.tishalovichm.grpc.PokemonServiceOuterClass.Pokemon;
import by.tishalovichm.grpc.PokemonServiceOuterClass.PokemonType;
import io.grpc.stub.StreamObserver;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class PokemonServiceImpl extends PokemonServiceImplBase {

    private static final Logger LOGGER = Logger.getLogger(PokemonServiceImpl.class.getName());

    private final List<Pokemon> pokemons = List.of(
            Pokemon.newBuilder()
                    .setName("Bulbasaur")
                    .setHealth(70)
                    .setDescription("For some time after its birth, it uses the nutrients that are packed into the seed on its back in order to grow.")
                    .addAllTypes(List.of(PokemonType.GRASS, PokemonType.POISON))
                    .build(),
            Pokemon.newBuilder()
                    .setName("Charmander")
                    .setHealth(70)
                    .setDescription("The flame on its tail shows the strength of its life-force. If Charmander is weak, the flame also burns weakly.")
                    .addAllTypes(List.of(PokemonType.GRASS, PokemonType.POISON))
                    .build(),
            Pokemon.newBuilder()
                    .setName("Squirtle")
                    .setHealth(70)
                    .setDescription("After birth, its back swells and hardens into a shell. It sprays a potent foam from its mouth.")
                    .addAllTypes(List.of(PokemonType.GRASS, PokemonType.POISON))
                    .build()
        );

    @Override
    public void getPokemon(PokemonServiceOuterClass.PokemonRequest request,
                           StreamObserver<PokemonResponse> responseObserver) {

        String pokemonName = request.getPokemonName();

        LOGGER.info(String.format("Request for pokemon with name: %s", pokemonName));

        Optional<Pokemon> pokemon = pokemons.stream()
                .filter(p -> p.getName().equals(pokemonName))
                .findFirst();

        if (pokemon.isPresent()) {
            LOGGER.info("Pokemon found");

            responseObserver.onNext(
                    PokemonResponse.newBuilder()
                            .setPokemon(pokemon.get())
                            .build()
            );
        } else {
            LOGGER.info("Pokemon not found");

            responseObserver.onNext(
                    PokemonResponse.newBuilder()
                            .build()
            );
        }

        responseObserver.onCompleted();
    }

}
