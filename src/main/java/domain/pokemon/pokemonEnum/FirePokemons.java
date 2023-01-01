package domain.pokemon.pokemonEnum;

import java.util.Random;

public enum FirePokemons {
    CHARMANDER,
    VULPIX,
    PONTYA,
    FLAREON,
    GROWLITHE;

    public static FirePokemons randomFirePokemon() {
        int pick = new Random().nextInt(FirePokemons.values().length);
        return FirePokemons.values()[pick];
    }

}
