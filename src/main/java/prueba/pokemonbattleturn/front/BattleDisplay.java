package prueba.pokemonbattleturn.front;

import prueba.pokemonbattleturn.domain.player.Trainer;
import prueba.pokemonbattleturn.domain.pokemon.pokemonClass.Pokemon;

public class BattleDisplay {

    public static void MoveDisplay(Trainer player, Pokemon firstPlayerPokemon, Pokemon secondPlayerPokemon){
        System.out.println("¡" + player.getName() + " empieza primero!");

        PokemonDisplay.showStats(secondPlayerPokemon);
        PokemonDisplay.showStats(firstPlayerPokemon);

        System.out.println("--------------------------");

        System.out.println("¿Qué hará " + firstPlayerPokemon.getName() + "?");

      //  PokemonDisplay.showAttacks(firstPlayerPokemon);
    }
}
