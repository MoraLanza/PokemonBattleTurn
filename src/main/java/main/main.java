package main;

import domain.player.*;
import gameLogic.battle;

import java.util.Objects;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name1;
        String name2;
        String playerResponse;



        System.out.println("¡Bienvenidx/s entrenadorxs! ¿Cuál es el nombre del primer/x?");
        name1 = s.nextLine();

        System.out.println("¿Y del segund/x?");
        name2 = s.nextLine();

        trainer player1 = new trainer(name1);
        trainer player2 = new trainer(name2);
        battle pokemonBattle = new battle(player1, player2);

        do {
            System.out.println("¡Excelente, " + name1 + " y " + name2 + "! ¿Quieren comenzar la batalla? Y/N");
            playerResponse = s.nextLine();

            if (Objects.equals(playerResponse, "Y") || Objects.equals(playerResponse, "y")) {
                pokemonBattle.begin();
            }
        } while(!Objects.equals(playerResponse, "N"));
    }
}
