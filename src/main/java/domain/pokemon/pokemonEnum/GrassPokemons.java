package domain.pokemon.pokemonEnum;

import java.util.Random;

public enum GrassPokemons {
    BULBASAUR,
    ODDISH,
    PARAS,
    BELLSPROUT,
    EXEGGCUTE;
    public static GrassPokemons randomGrassPokemon() {
        int pick = new Random().nextInt(GrassPokemons.values().length);
        return GrassPokemons.values()[pick];
    }


}
