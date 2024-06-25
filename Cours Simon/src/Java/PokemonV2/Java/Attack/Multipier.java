package Java.PokemonV2.Java.Attack;

import Java.PokemonV2.Java.Pokemon.Pokemon;

public class Multipicator {

    public Multipicator(){

    }

    public Number getMultiplicator(Pokemon pokemonattack, Pokemon defendpokemon){
        Attack attack = new Attack();
        pokemonattackattack.initAttack();
              System.out.println("L'attaque " + pokemonattack + " a échoué. Le pokemon " + defendpokemon + " n'a subit aucun dégât.");
                return "";}
            if (pokemonattack.getAttackType().getStrongAgainst().contains(defendpokemontypes)) {
                resultdamage = Math.max(defendpokemon.getHealthPoint() - (pokemonattack.getDamage() * 2), 0);
            }
            if (pokemonattack.getAttackType().getWeakAgainst().contains(defendpokemontypes)) {
                resultdamage = Math.max(defendpokemon.getHealthPoint() - (pokemonattack.getDamage() / 2), 0);
            }
            if (!pokemonattack.getAttackType().getWeakAgainst().contains(defendpokemontypes) && !pokemonattack.getAttackType().getWeakAgainst().contains(defendpokemontypes)) {
                resultdamage = Math.max(defendpokemon.getHealthPoint() - pokemonattack.getDamage(), 0);
            }
            System.out.println("L'attaque " + pokemonattack + " a réussit. Il reste " + resultdamage + "pdv à " + defendpokemon);
            return "";
}
