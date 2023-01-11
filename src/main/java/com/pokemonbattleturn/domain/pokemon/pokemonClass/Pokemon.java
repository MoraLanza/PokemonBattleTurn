package com.pokemonbattleturn.domain.pokemon.pokemonClass;
import com.pokemonbattleturn.domain.pokemon.moves.Move;

import java.util.List;

public class Pokemon {
    protected int hp;
    protected String name;

    // protected int exp;
    protected PokemonType type;
    protected List<Move> moves;


    public Pokemon(PokemonType type, String name) {
        this.name = name;
        this.hp = 800;
        this.type = type;
    }


    public PokemonType getType() {
        return type;
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




}
