package Java.PokemonV2.Java;

import Java.PokemonV2.Java.Attack.Versus;
import Java.PokemonV2.Java.Pokemon.Pokemon;
import java.util.List;

import static Java.PokemonV2.Enum.TypeEnum.*;
import static Java.PokemonV2.Java.Arene.Arena.*;
import static Java.PokemonV2.Java.Attack.Attack.*;

//Développer un combat de Pokémon.
//Un pokémon possède un type, deux attaques, et des points de vie.
//Une attaque cible un pokémon et lui retire deux points de vie à chaque fois.
//Si une attaque est super efficace (le type de l’attaque du pokémon attaquant est super efficace sur le type du pokémon ciblé),
//  elle en retire le double. Si le pokémon a un type résistant, au contraire, il en subit la moitié.
//Il existe des attaques qui infligent un dégât de plus, mais qui ont une chance sur quatre de rater.
//Les combats de pokémon ont lieu dans une arène qui possède elle-même un type qui affecte les attaques d’un pokémon
//  de la même manière que les résistances et les faiblesses du pokémon cible.
//  Une attaque sur le bon terrain est doublée, et sur le mauvais, divisée par deux. Il est donc possible d’infliger jusqu’à huit dégâts
//  (ou douze avec l'attaque moins précise mais qui inflige 1 de plus) par attaque mais une attaque ne peut pas infliger moins d’un dégât.
//doubletype
public class Main {

    public static void main(String[] args) {

        Pokemon salameche = new Pokemon("salameche",List.of(GRASS),List.of( FOUETLIAGNE));
        Pokemon magicarpe = new Pokemon("magicarpe",List.of(GRASS,GRASS),List.of(SURF,TRANCHERBE));
        Pokemon rayquaza = new Pokemon("rayquaza",List.of(GRASS,GROUND),List.of(PISTOLETAO,FLAMMICHE));
        Versus combat = new Versus();
        combat.doAttack(rayquaza,magicarpe);

    }
}
