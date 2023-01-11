package prueba.pokemonbattleturn.domain.pokemon.moves;

import prueba.pokemonbattleturn.domain.pokemon.pokemonClass.Pokemon;

import java.util.Random;

public class Move {
    int accuracy;
    int damage;
    MoveType type;
    protected void notEffective() {
        System.out.println("It's not very effective...");
    }

    protected void superEffective() {
        System.out.println("It's super effective!");
    }

    public Move(int accuracy, int damage, MoveType type) {
        this.accuracy = accuracy;
        this.damage = damage;
        this.type = type;
    }

    public void attack(Pokemon pokemon){
        int attackAccuracy = new Random().nextInt(10);
        if (attackAccuracy < accuracy) {
            //Double dispatch
            pokemon.receiveAttack(this);
            superEffective();
        } else {
            notEffective();
        }
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getDamage() {
        return damage;
    }

    public MoveType getType() {
        return type;
    }
}
