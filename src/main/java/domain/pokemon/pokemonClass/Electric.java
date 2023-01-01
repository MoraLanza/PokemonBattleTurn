package domain.pokemon.pokemonClass;

import domain.Interface.IElectricPokemon;

public class Electric extends Pokemon implements IElectricPokemon {

    public Electric(String name) {
        super(name);
    }

    public void showAttacks() {
        super.showAttacks();
        System.out.println("4) Thunder Shock (Accuracy: 90, Damage: 40)");
        System.out.println("5) Thunder Punch (Accuracy: 40, Damage: 95)");
        System.out.println("6) Thunder Wave (Accuracy: 60, Damage: 30)");
    }

    @Override
    public void attackThunderShock(Pokemon pokemon) {
        attack(9, 40, pokemon);
    }

    @Override
    public void attackThunderPunch(Pokemon pokemon) {
        attack(4, 95, pokemon);
    }

    @Override
    public void attackThunderWave(Pokemon pokemon) {
        attack(6, 30, pokemon);
    }
}
