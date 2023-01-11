package prueba.pokemonbattleturn.front;

import prueba.pokemonbattleturn.domain.pokemon.pokemonClass.Pokemon;
import prueba.pokemonbattleturn.domain.pokemon.moves.Move;

public class PokemonDisplay {
    public static void showStats(Pokemon pokemon){
        System.out.println(pokemon.getName() + "  Hp: " + pokemon.getHp());
    }

    public static void showAttacks(Pokemon pokemon, Move move){

    }
}
