package Java.Pokemon.Java;

import Java.Pokemon.Enum.typeEnum;

public class Combat {

    private typeEnum typearene;
    private Pokemon pokemonattaquant;
    private Pokemon pokemondefenseur;
    private typeEnum typeattaque;
    private typeEnum typepokemon;

    private int pointdevie;

    private int statut;

    public Combat(Pokemon pokemonattaquant, Pokemon pokemondefenseur) {
        this.pokemonattaquant = pokemonattaquant;
        this.pokemondefenseur = pokemondefenseur;
        this.typepokemon = pokemondefenseur.getTypePokemon();
        this.typeattaque = pokemonattaquant.getTypeattaque();
        getdegatDapresLefficacite();
        System.out.println("L'attaque de " + pokemonattaquant.getNomPokemon()
                + " est de type " + this.typeattaque
                + ". Elle est donc " + getEfficaciteTypeAttaque()
                + " contre "
                + pokemondefenseur.getNomPokemon()
                + " qui est du type " + pokemondefenseur.getTypePokemon()+ ". Il lui reste "+ this.pointdevie + "point de vie");
    }

    private int getdegatDapresLefficacite() {

        switch (statut) {
            case 0:
                this.pointdevie = (Math.max((pokemondefenseur.getPointdevie() - 5), 0));
                break;
            case 1:
                this.pointdevie = (Math.max((pokemondefenseur.getPointdevie() - 10), 0));
                break;
            case 2:
                this.pointdevie = (Math.max((pokemondefenseur.getPointdevie() - 1), 0));
                break;
        }

        return this.pointdevie;
    }

    private String getEfficaciteTypeAttaque() {

        statut = 0;
        String efficacite = "efficace";
        switch (pokemonattaquant.getTypeattaque()) {
            case eau -> {
                switch (pokemondefenseur.getTypePokemon()) {
                    case eau:
                        efficacite = "efficace";
                        statut = 0;
                        break;
                    case feu:
                        efficacite = "très efficace";
                        statut = 1;
                        break;
                    case plante:
                        efficacite = "peu efficace";
                        statut = 2;
                        break;
                }
            }
            case feu -> {
                switch (pokemondefenseur.getTypePokemon()) {
                    case feu:
                        efficacite = "efficace";
                        statut = 0;
                        break;
                    case plante:
                        efficacite = "très efficace";
                        statut = 1;
                        break;
                    case eau:
                        efficacite = "peu efficace";
                        statut = 2;
                        break;
                }
            }
            case plante -> {
                switch (pokemondefenseur.getTypePokemon()) {
                    case plante:
                        efficacite = "peu efficace";
                        statut = 0;
                        break;
                    case eau:
                        efficacite = "efficace";
                        statut = 1;
                        break;
                    case feu:
                        efficacite = "Tres efficace";
                        statut = 2;
                        break;
                }
            }

        }
        return efficacite;
    }
}
