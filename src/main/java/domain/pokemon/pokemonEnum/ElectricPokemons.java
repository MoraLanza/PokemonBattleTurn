package domain.pokemon.pokemonEnum;

import java.util.Random;

public enum ElectricPokemons {
    PIKACHU,
    MAGNEMITE,
    VOLTORB,
    JOLTEON,
    ELEKID;

    public static ElectricPokemons randomElectricPokemon() {
        int pick = new Random().nextInt(ElectricPokemons.values().length);
        return ElectricPokemons.values()[pick];
    }
}
