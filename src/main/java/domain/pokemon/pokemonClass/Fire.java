package domain.pokemon.pokemonClass;

import domain.Interface.IFirePokemon;

public class Fire extends Pokemon implements IFirePokemon {
    public Fire(String name) {
        super(name);
    }

    public void showAttacks() {
        super.showAttacks();
        System.out.println("4) Ember (Accuracy: 90, Damage: 40)");
        System.out.println("5) Flamethrower (Accuracy: 60, Damage: 90)");
        System.out.println("6) Fire Spin (Accuracy: 80, Damage: 30)");
    }
    @Override
    public void attackEmber(Pokemon pokemon) {
        attack(9, 40, pokemon);

    }

    @Override
    public void attackFlamethrower(Pokemon pokemon) {

        attack(6, 90, pokemon);
    }

    @Override
    public void attackFireSpin(Pokemon pokemon) {

        attack(8, 30, pokemon);
    }
}
