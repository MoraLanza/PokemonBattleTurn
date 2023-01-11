package com.pokemonbattleturn.domain.player;

import com.pokemonbattleturn.domain.pokemon.pokemonClass.Pokemon;
import lombok.Getter;

@Getter
public class Trainer {

    private final String name;
    private final Pokemon pokemon;

    public Trainer(String name, Pokemon pokemon) {
        this.name = name;
        this.pokemon = pokemon;
    }
}
