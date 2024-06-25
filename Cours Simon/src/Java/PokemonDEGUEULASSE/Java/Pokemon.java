package Java.Pokemon.Java;

import Java.Pokemon.Enum.typeEnum;

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
public class Pokemon extends Type {

    private int pointdevie = 40;
    private String nom;

    private typeEnum typepokemon;

    private typeEnum typeattaque;

    public Pokemon(typeEnum typepokemon,String nom, int pointdevie) {
        super();
        Attaque attaquepokemon = new Attaque();
        this.typepokemon = typepokemon;
        this.nom = nom;
        this.typeattaque = attaquepokemon.getTypeAttaque(this.typepokemon);
        attaquepokemon.setAttaqueParType();
        attaquepokemon.getAttaqueDuPokemon(this.nom);
        this.pointdevie = pointdevie;

    }

    public typeEnum getTypePokemon() {
        return typepokemon;
    }

    public String getNomPokemon() {
        return nom;
    }

    public typeEnum getTypeattaque() {
        return typeattaque;
    }

    public int getPointdevie() {
        return pointdevie;
    }
}
