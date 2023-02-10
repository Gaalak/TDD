public class AffichageVoiture {


    public static String printVoiture(final Voiture test, final String nomProprietaire){

        return "Voiture{" +
                "nbPorte = " + test.nbPortes +
                ", automatique = " + test.automatique +
                ", couleur= '" + test.couleur + '\'' +
                ", premiereLettrePlaque = " + test.premiereLettrePlaque +
                ", Nom du popriétaire = " + nomProprietaire +
                ", Carburation = " + (test.moteur != null ? test.moteur.carburation : "null")+
                ", nombre de cylindre = " + (test.moteur != null ? test.moteur.nbCylindres : "null") +
                '}';
    }

    public static String printPorteAndAutomatique(final Voiture test, final String nomProprietaire){
        String nbPrtStr = "";

        if (isMultiplePortes(test.nbPortes)) {
            nbPrtStr = "portes";
        }
        else {
            nbPrtStr = "porte";
        }


        //ternaire
        String nbPorte = test.nbPortes > 1 ? test.nbPortes + " portes" : test.nbPortes + " porte";

        return "La voiture de " + nomProprietaire + " a " + nbPrtStr +
                " et est " + (test.automatique ? "automatique" : "manuel") ;
    }

    private static boolean isMultiplePortes(final int numberPorte) {
        return numberPorte > 1;
    }

    public static String printColorAndProprietaire (final Voiture couleur,final String nomProprietaire){
        return "La voiture de " + nomProprietaire + " est de couleur " + couleur.couleur;
    }


}
