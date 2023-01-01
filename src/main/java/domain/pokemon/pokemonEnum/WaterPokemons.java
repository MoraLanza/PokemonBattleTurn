package domain.pokemon.pokemonEnum;

import java.util.Random;

public enum WaterPokemons {
    SQUIRTLE,
    PSYDUCK,
    VAPOREON,
    SEEL,
    HORSEA,
    MAGIKARP,
    GOLDEEN,
    STARYU;

    public static WaterPokemons randomWaterPokemon() {
        int pick = new Random().nextInt(WaterPokemons.values().length);
        return WaterPokemons.values()[pick];
    }
}
