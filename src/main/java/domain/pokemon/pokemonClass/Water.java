package domain.pokemon.pokemonClass;

import domain.Interface.IWaterPokemon;

public class Water extends Pokemon implements IWaterPokemon {


    public Water(String name) {
        super(name);
    }

    public void showAttacks() {
        super.showAttacks();
        System.out.println("4) Hydro Pump (Accuracy: 90, Damage: 45)");
        System.out.println("5) Bubble (Accuracy: 30, Damage: 100)");
        System.out.println("6) Clamp (Accuracy: 60, Damage: 30)");
    }

    @Override
    public void attackHydroPump(Pokemon pokemon) {
        attack(9, 45, pokemon);
    }

    @Override
    public void attackBubble(Pokemon pokemon) {
        attack(4, 100, pokemon);
    }

    @Override
    public void attackClamp(Pokemon pokemon) {
        attack(6, 30, pokemon);
    }
}
