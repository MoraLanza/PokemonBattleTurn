package domain.pokemon.pokemonClass;

import domain.Interface.IGrassPokemon;

public class Grass extends Pokemon implements IGrassPokemon {

    public Grass(String name) {
        super(name);
    }

    @Override
    public void showAttacks() {
        super.showAttacks();
        System.out.println("4) Vine Whip (Accuracy: 90, Damage: 45)");
        System.out.println("5) Razor Leaf (Accuracy: 50, Damage: 80)");
        System.out.println("6) Sleep Powder (Accuracy: 60, Damage: 60)");
    }

    @Override
    public void attackVineWhip(Pokemon pokemon) {
        attack(9, 45, pokemon);
    }

    @Override
    public void attackRazorLeaf(Pokemon pokemon) {
        attack(5, 80, pokemon);
    }

    @Override
    public void attackSleepPowder(Pokemon pokemon) {
        attack(6, 60, pokemon);
    }
}
