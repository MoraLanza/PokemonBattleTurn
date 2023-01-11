package prueba.pokemonbattleturn.gameLogic;

import prueba.pokemonbattleturn.domain.player.Trainer;
import prueba.pokemonbattleturn.domain.pokemon.pokemonClass.Pokemon;
import prueba.pokemonbattleturn.front.BattleDisplay;

import java.util.Random;

public class Battle {

    private Trainer player1;
    private Trainer player2;
    private Pokemon pokemonPlayer1;
    private Pokemon pokemonPlayer2;

    public Battle(Trainer player1, Trainer player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void begin() {

        fight(pokemonPlayer1, pokemonPlayer2);
    }

    private void fight(Pokemon pokemonPlayer1, Pokemon pokemonPlayer2) {
        int counter = 0;

        Trainer firstPlayer = new Random().nextBoolean() ? player1 : player2;
        Trainer secondPlayer =firstPlayer.equals(player1) ? player2 : player1;

        Pokemon pokemonFirstPlayer = firstPlayer.equals(player1) ? pokemonPlayer1 : pokemonPlayer2;
        Pokemon pokemonSecondPlayer = firstPlayer.equals(player1) ? pokemonPlayer2 : pokemonPlayer1;

        BattleDisplay.MoveDisplay(firstPlayer, pokemonFirstPlayer, pokemonSecondPlayer);




    }


}