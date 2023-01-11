package com.pokemonbattleturn.domain.pokemon.moves;

import java.util.Map;

public class MoveFactory {

   public Map<String, Move> movesMap = Map.ofEntries(
            Map.entry("Hydro Pump", new Move(9, 45, MoveType.WATER)),
            Map.entry("Bubble", new Move(4, 100, MoveType.WATER)),
            Map.entry("Clamp", new Move(6, 70, MoveType.WATER)),

            Map.entry("Thunder Shock", new Move(9, 40, MoveType.ELECTRIC)),
            Map.entry("Thunder Punch", new Move(4, 95, MoveType.ELECTRIC)),
            Map.entry("Thunder Wave", new Move(5, 75, MoveType.ELECTRIC)),

            Map.entry("Vine Whip", new Move(4, 95, MoveType.GRASS)),
            Map.entry("Razor Leaf", new Move(5, 80, MoveType.GRASS)),
            Map.entry("Sleep Powder", new Move(8, 50, MoveType.GRASS)),

            Map.entry("Ember", new Move(9, 40, MoveType.FIRE)),
            Map.entry("Flamethrower", new Move(5, 90, MoveType.FIRE)),
            Map.entry("Fire Spin", new Move(8, 30, MoveType.FIRE)),

            Map.entry("Tackle", new Move(9, 25, MoveType.NORMAL)),
            Map.entry("Scratch", new Move(5, 40, MoveType.NORMAL)),
            Map.entry("Bite", new Move(8, 30, MoveType.NORMAL))
            );

    public Move getMove(String name) {
        return this.movesMap.get(name);
    }

    public Map<String, Move> getMovesMap() {
        return movesMap;
    }
}
