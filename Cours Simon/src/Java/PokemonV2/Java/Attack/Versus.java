package Java.PokemonV2.Java.Attack;

import Java.PokemonV2.Java.Arene.Arena;
import Java.PokemonV2.Java.Pokemon.Pokemon;

import java.util.Random;

public class Versus {

    private Attack randomattack;

    private double resultdamage;

    private double resultlifepoint;

    private final Multipier Multiplier = new Multipier();




    public void doAttack(Pokemon attackpokemon, Pokemon defendpokemon) {
        Random txreussite = new Random();
        int chance = txreussite.nextInt(5);
        randomattack = getRandomAttackFromAttackPokemonList(attackpokemon);
        if (randomattack.isUltiAttack()) {
            System.out.println(randomattack.getName());
            if (chance == 4) {
                System.out.println("L'attaque " + attackpokemon + " a échoué. Le pokemon " + defendpokemon + " n'a subit aucun dégât.");
                return;
            }
            double finalmulti = Multiplier.getFinalMultiplier(randomattack, defendpokemon);
            resultdamage = randomattack.getDamage() * finalmulti;
            resultlifepoint = (Pokemon.getHealthPoint() - resultdamage);
        }
        double finalmulti = Multiplier.getFinalMultiplier(randomattack, defendpokemon);
        resultdamage = randomattack.getDamage() * finalmulti;
        resultlifepoint = (Pokemon.getHealthPoint() - resultdamage);
        System.out.println(chance);
        System.out.println("L'attaque " + randomattack + " a réussit. Elle a infligé "+resultdamage+ " dommages. Il reste " + resultlifepoint + "pdv à " + defendpokemon);
    }

    private Attack getRandomAttackFromAttackPokemonList(Pokemon attackpokemon){
        final Random attackrandom = new Random();
        randomattack = attackpokemon.getPokemonattacksFromType().get(attackrandom.nextInt(attackpokemon.getPokemonattacksFromType().size()));

        return randomattack;
    }

}
