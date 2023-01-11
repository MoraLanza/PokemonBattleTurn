package prueba;

import prueba.pokemonbattleturn.domain.player.Trainer;
import prueba.pokemonbattleturn.domain.pokemon.pokemonClass.PokemonFactory;
import prueba.pokemonbattleturn.front.TrainerDisplay;
import prueba.pokemonbattleturn.gameLogic.Battle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Objects;
import java.util.Scanner;
@SpringBootApplication

public class PokemonBattleTurnApplication {
    @Autowired
    private static PokemonFactory pokemonFactory;
    public static void main(String[] args) {
        SpringApplication.run(PokemonBattleTurnApplication.class, args);

        Scanner s = new Scanner(System.in);
        String name1;
        String name2;
        String playerResponse;

        System.out.println("¡Bienvenidx/s entrenadorxs! ¿Cuál es el nombre del primer/x?");
        name1 = s.nextLine();

        System.out.println("¿Y del segund/x?");
        name2 = s.nextLine();

        do {
            System.out.println("¡Excelente, " + name1 + " y " + name2 + "! ¿Quieren comenzar la batalla? Y/N");
            playerResponse = s.nextLine();

            if (Objects.equals(playerResponse, "Y") || Objects.equals(playerResponse, "y")) {

                String pokemonNamePlayer1 = TrainerDisplay.choosePokemon(name1, pokemonFactory);
                String pokemonNamePlayer2 = TrainerDisplay.choosePokemon(name2, pokemonFactory);

                Trainer player1 = new Trainer(name1, pokemonFactory.getPokemonByName(pokemonNamePlayer1));
                Trainer player2 = new Trainer(name2, pokemonFactory.getPokemonByName(pokemonNamePlayer2));

                Battle pokemonBattle = new Battle(player1, player2);

                pokemonBattle.begin();
            }
        } while(!Objects.equals(playerResponse, "N"));
    }
}
