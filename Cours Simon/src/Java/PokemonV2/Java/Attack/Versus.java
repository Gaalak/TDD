package Java.PokemonV2.Java.Attack;

import Java.PokemonV2.Enum.AttackEnum;
import Java.PokemonV2.Java.Pokemon.Pokemon;

public class Attack {

    private Pokemon Defendpokemon = new Pokemon("e");

    private AttackEnum pokemonattack;
    public int doAttack(Pokemon pokemon) {
        this.Defendpokemon = pokemon;
        if (Defendpokemon.weakagainstindex == pokemonattack.getAttackType()){
            resultdamage = this.Defendpokemon.getHealthPoint()- (pokemonattack.getDamage()*2);
        }
        if (Defendpokemon.strongagainstindex == pokemonattack.getAttackType()){
            resultdamage = this.Defendpokemon.getHealthPoint()- (pokemonattack.getDamage()/2);
        }
        resultdamage = this.Defendpokemon.getHealthPoint()- (pokemonattack.getDamage());
        System.out.println(pokemonattack);
        System.out.println(Defendpokemon);
        System.out.println(Defendpokemon.weakagainstindex);
        System.out.println(pokemonattack.getAttackType());
        System.out.println(pokemonattack.getDamage());
        System.out.println(pokemon.getHealthPoint());
        System.out.println(resultdamage);
        return resultdamage;


    }
}
