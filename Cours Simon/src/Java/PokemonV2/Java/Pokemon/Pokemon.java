package Java.PokemonV2.Java.Pokemon;
import Java.PokemonV2.Enum.TypeEnum;
import Java.PokemonV2.Java.Attack.Attack;

import java.util.*;


public class Pokemon {
    private final String name;

    private final List<TypeEnum> typelist;

    private final List<Attack> attackpokemon;

    public Pokemon(String name, List<TypeEnum> typelist,List<Attack> attackpokemon) {
        this.name = name;
        this.typelist = typelist;
        this.attackpokemon = attackpokemon;
    }
    public List<TypeEnum> getTypelist() {
        return typelist;
    }

    public static int getHealthPoint() {
        return 40;
    }

    public List<Attack> getPokemonattacksFromType() {
        return attackpokemon;
    }

    @Override
    public String toString() {
        return name;
    }

}
