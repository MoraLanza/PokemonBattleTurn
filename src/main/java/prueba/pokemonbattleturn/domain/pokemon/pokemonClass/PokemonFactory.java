package prueba.pokemonbattleturn.domain.pokemon.pokemonClass;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

@Component
public class PokemonFactory {
    public Map<String, Pokemon> pokemonMap = Map.ofEntries(
            Map.entry("PIKACHU", new Pokemon(PokemonType.ELECTRIC, "PIKACHU")),
            Map.entry("MAGNEMITE", new Pokemon(PokemonType.ELECTRIC, "MAGNEMITE")),
            Map.entry("VOLTORB", new Pokemon(PokemonType.ELECTRIC, "VOLTORB")),
            Map.entry("JOLTEON", new Pokemon(PokemonType.ELECTRIC, "JOLTEON")),

            Map.entry("CHARMANDER", new Pokemon(PokemonType.FIRE, "CHARMANDER")),
            Map.entry("VULPIX", new Pokemon(PokemonType.FIRE, "VULPIX")),
            Map.entry("PONTYA", new Pokemon(PokemonType.FIRE, "PONTYA")),
            Map.entry("FLAREON", new Pokemon(PokemonType.FIRE, "FLAREON")),
            Map.entry("GROWLITHE", new Pokemon(PokemonType.FIRE, "GROWLITHE")),

            Map.entry("BULBASAUR", new Pokemon(PokemonType.GRASS, "BULBASAUR")),
            Map.entry("ODDISH", new Pokemon(PokemonType.GRASS, "ODDISH")),
            Map.entry("PARAS", new Pokemon(PokemonType.GRASS, "PARAS")),
            Map.entry("BELLSPROUT", new Pokemon(PokemonType.GRASS, "BELLSPROUT")),
            Map.entry("EXEGGCUTE", new Pokemon(PokemonType.GRASS, "EXEGGCUTE")),

            Map.entry("SQUIRTLE", new Pokemon(PokemonType.WATER, "SQUIRTLE")),
            Map.entry("PSYDUCK", new Pokemon(PokemonType.WATER, "PSYDUCK")),
            Map.entry("VAPOREON", new Pokemon(PokemonType.WATER, "VAPOREON")),
            Map.entry("GOLDEEN", new Pokemon(PokemonType.WATER, "GOLDEEN")),
            Map.entry("SEEL", new Pokemon(PokemonType.WATER, "SEEL")),
            Map.entry("STARYU", new Pokemon(PokemonType.WATER, "STARYU"))
            );

    public Pokemon getPokemonByName(String name) {
        return this.pokemonMap.get(name);
    }

    public Set<String> getPokemonKeySet() {
        return pokemonMap.keySet();
    }

}
