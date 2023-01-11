package prueba.pokemonbattleturn.front;

import prueba.pokemonbattleturn.domain.pokemon.pokemonClass.PokemonFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TrainerDisplay {

    private static final Scanner scan = new Scanner(System.in);
    private static final Random random = new Random();


    public static String choosePokemon(String name, PokemonFactory pokemonFactory) {

        List<String> pokemonNames = new ArrayList<>(pokemonFactory.getPokemonKeySet());
        int pokemonQuantity = pokemonNames.size();

        String pokemonName1 = pokemonNames.get( random.nextInt(pokemonQuantity));
        String pokemonName2 = pokemonNames.get( random.nextInt(pokemonQuantity));
        String pokemonName3 = pokemonNames.get( random.nextInt(pokemonQuantity));
        String pokemonName4 = pokemonNames.get( random.nextInt(pokemonQuantity));

        System.out.println("¡" + name + ", elegí tu pokemón!");
        System.out.println("1) " + pokemonName1);
        System.out.println("2) " + pokemonName2);
        System.out.println("3) " + pokemonName3);
        System.out.println("4) " + pokemonName4);

        int chosen = scan.nextInt();

        List<String> pokemonName = List.of(pokemonName1, pokemonName2, pokemonName3, pokemonName4);

        return pokemonName.get(chosen-1);
    }
}
