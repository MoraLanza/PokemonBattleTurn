package domain.player;

import domain.pokemon.pokemonClass.*;
import domain.pokemon.pokemonEnum.ElectricPokemons;
import domain.pokemon.pokemonEnum.FirePokemons;
import domain.pokemon.pokemonEnum.GrassPokemons;
import domain.pokemon.pokemonEnum.WaterPokemons;

import java.util.Scanner;

public class trainer {

    private String name;
    private Scanner scan = new Scanner(System.in);
    int chosen;

    public trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Pokemon choosePokemon(String name) {

        Electric pokemonElectric = new Electric((ElectricPokemons.randomElectricPokemon()).name());
        Fire pokemonFire = new Fire((FirePokemons.randomFirePokemon()).name());
        Water pokemonWater = new Water((WaterPokemons.randomWaterPokemon()).name());
        Grass pokemonGrass = new Grass((GrassPokemons.randomGrassPokemon()).name());

        System.out.println("¡" + name + ", elegí tu pokemón!");
        System.out.println("1) " + pokemonElectric.getName());
        System.out.println("2) " + pokemonFire.getName());
        System.out.println("3) " + pokemonGrass.getName());
        System.out.println("4) " + pokemonWater.getName());

        chosen = scan.nextInt();

        Pokemon pokemon = switch (chosen) {
            case 1 -> pokemonElectric;
            case 2 -> pokemonFire;
            case 3 -> pokemonGrass;
            case 4 -> pokemonWater;
            default -> null;
        };

        return pokemon;
    }

    public chooseAttack(Pokemon pokemon){

    }

}

