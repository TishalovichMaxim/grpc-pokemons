package by.tishalovichm.client;

import by.tishalovichm.grpc.PokemonServiceGrpc;
import by.tishalovichm.grpc.PokemonServiceGrpc.PokemonServiceBlockingStub;
import by.tishalovichm.grpc.PokemonServiceOuterClass.Pokemon;
import by.tishalovichm.grpc.PokemonServiceOuterClass.PokemonRequest;
import by.tishalovichm.grpc.PokemonServiceOuterClass.PokemonResponse;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;

import java.util.Optional;

public class PokemonServiceClient {

    private final PokemonServiceBlockingStub stub;

    public PokemonServiceClient(String host, int port) {
        Channel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

        stub = PokemonServiceGrpc.newBlockingStub(channel);
    }

    public Optional<Pokemon> getPokemon(String pokemonName) {
        PokemonRequest request = PokemonRequest.newBuilder()
                .setPokemonName(pokemonName)
                .build();

        PokemonResponse response = stub.getPokemon(request);
        if (!response.hasPokemon()) {
            return Optional.empty();
        }

        return Optional.of(response.getPokemon());
    }

}
