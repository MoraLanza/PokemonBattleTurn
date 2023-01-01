package gameLogic;

import domain.player.trainer;
import domain.pokemon.pokemonClass.Pokemon;

import java.util.Random;

public class battle {

    private trainer player1;
    private trainer player2;
    private Pokemon pokemonPlayer1;
    private Pokemon pokemonPlayer2;

    public battle(trainer player1, trainer player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void begin() {
        pokemonPlayer1 = player1.choosePokemon(player1.getName());
        pokemonPlayer2 = player2.choosePokemon(player2.getName());

        fight(pokemonPlayer1, pokemonPlayer2);
    }

    private void fight(Pokemon pokemonPlayer1, Pokemon pokemonPlayer2) {
        int counter = 0;

        trainer firstPlayer = new Random().nextBoolean() ? player1 : player2;
        trainer secondPlayer =firstPlayer.equals(player1) ? player2 : player1;
        Pokemon pokemonFirstPlayer = firstPlayer.equals(player1) ? pokemonPlayer1 : pokemonPlayer2;
        Pokemon pokemonSecondPlayer = firstPlayer.equals(player1) ? pokemonPlayer2 : pokemonPlayer1;

        System.out.println("¡" + firstPlayer.getName() + " empieza primero!");

        pokemonSecondPlayer.showStats();
        pokemonFirstPlayer.showStats();

        System.out.println("--------------------------");

        System.out.println("¿Qué hará " + pokemonFirstPlayer.getName() + "?");
        pokemonFirstPlayer.showAttacks();




    }


}