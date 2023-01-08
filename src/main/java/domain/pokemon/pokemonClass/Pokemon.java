package domain.pokemon.pokemonClass;
import domain.pokemon.moves.Move;

import java.util.List;
import java.util.Random;
public abstract class Pokemon {
    protected int hp;

    protected String name;

    protected int exp;
    protected PokemonType type;
    protected List<Move> moves;


    public Pokemon(String name) {
        this.name = name;
        this.hp = 800;
    }

    protected void notEffective() {
         System.out.println("It's not very effective...");
    }

    protected void superEffective() {
        System.out.println("It's super effective!");
    }


    public int getHp() {

        return hp;
    }
    public String getName() {
        return name;
    }

    public void receiveAttack(Move move) {
        if(type.equals(move.getType())) {
            this.hp -= move.getDamage()/2;
        }
        this.hp -= move.getDamage();
    }



    public void showStats(){
        System.out.println(this.getName() + "  Hp: " + this.getHp());
    }

    public void showAttacks(){

    }


}
