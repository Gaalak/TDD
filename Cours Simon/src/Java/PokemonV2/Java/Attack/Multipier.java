package Java.PokemonV2.Java.Attack;

import Java.PokemonV2.Enum.TypeEnum;
import Java.PokemonV2.Java.Arene.Arena;
import Java.PokemonV2.Java.Pokemon.Pokemon;

import java.util.HashSet;
import java.util.List;

public class Multipier {

    private double multiplierValue;
    private double finalMultiplierValue;


    public double getFinalMultiplier(Attack attackpokemon, Pokemon defendpokemon) {
        List<TypeEnum> defendpokemontypes = defendpokemon.getTypelist();
        if (new HashSet<>(attackpokemon.getAttackType().getStrongAgainst()).containsAll(defendpokemontypes)) {
            System.out.println(attackpokemon.getAttackType());
            System.out.println(defendpokemontypes);
            finalMultiplierValue = 2;
        }
        if (new HashSet<>(attackpokemon.getAttackType().getWeakAgainst()).containsAll(defendpokemontypes)) {
            System.out.println(attackpokemon.getAttackType());
            System.out.println(defendpokemontypes);
            finalMultiplierValue = 0.5;
        }
        if (!new HashSet<>(attackpokemon.getAttackType().getWeakAgainst()).containsAll(defendpokemontypes) && !new HashSet<>(attackpokemon.getAttackType().getStrongAgainst()).containsAll(defendpokemontypes)) {
            System.out.println(attackpokemon.getAttackType());
            System.out.println(defendpokemontypes);
            return finalMultiplierValue = 1;
        }
        System.out.println("multi "+finalMultiplierValue);
        return finalMultiplierValue;
    }

//    public double getMultiplierPokemonInArena(Attack attackpokemon, Arena arena) {
//        if (new HashSet<>(attackpokemon.getAttackType().getStrongAgainst()).containsAll(arena.getTypefield())) {
//            System.out.println(attackpokemon.getAttackType());
//            multiplierValue = 2;
//        }
//        if (new HashSet<>(attackpokemon.getAttackType().getWeakAgainst()).containsAll(arena.getTypefield())) {
//            System.out.println(attackpokemon.getAttackType());
//            multiplierValue = 0.5;
//        }
//        if (!new HashSet<>(attackpokemon.getAttackType().getWeakAgainst()).containsAll(arena.getTypefield()) && !new HashSet<>(attackpokemon.getAttackType().getStrongAgainst()).containsAll(arena.getTypefield())) {
//            System.out.println(attackpokemon.getAttackType());
//            multiplierValue = 1;
//        }
//        System.out.println("multi "+multiplierValue);
//        return multiplierValue;
//    }
}
