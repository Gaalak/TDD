public class Application {

        public static void main(String[] args) {

            Voiture voitureDeMichel = new Voiture();

            System.out.println(voitureDeMichel.couleur);

            voitureDeMichel.couleur = "Jaune";

            System.out.println(voitureDeMichel);

            Voiture voitureDeJerome = new Voiture();
            System.out.println("La couleur de la voiture de Jerome est " + voitureDeJerome.couleur);

            if (voitureDeJerome.couleur == null){
                System.out.println("La couleur de la voiture de Jérôme est bien null");
            }

            voitureDeMichel.couleur = null;
            System.out.println();

            System.out.println(AffichageVoiture.printVoiture(voitureDeJerome, "Jerome"));
            System.out.println(AffichageVoiture.printPorteAndAutomatique(voitureDeMichel, "Michel"));

            voitureDeMichel.nbPortes = 1;
            System.out.println(AffichageVoiture.printPorteAndAutomatique(voitureDeMichel, "Michel"));

            System.out.println(AffichageVoiture.printColorAndProprietaire(voitureDeJerome,"Jerome"));

            if (voitureDeJerome == null){
                System.out.println("la couleur est bien null");
            }

            ActionVoiture action = new ActionVoiture();

            System.out.println(action.accelerer());
            int vitesse = action.accelerer();

            action.passerRapport(true,voitureDeJerome);
            action.passerRapport(true,voitureDeJerome);
            action.passerRapport(false,voitureDeJerome);
            int nouveauRapport = action.passerRapport(true,voitureDeJerome);

            System.out.println("le nouveau rapport est " + nouveauRapport);

            //action.tournerVoiture(true,90);
            action.tournerVoiture(false,90);
            action.tournerVoiture(true,190);
            action.tournerVoiture(true,-180);










//        boolean jeContinue = true;
//        int nb=0;
//        while (jeContinue){
//            System.out.println("Une itération");
//            nb++;
//            if (nb == 5){
//                continue;
//            }
//            System.out.println("Nb ne vaut pas 5");
//            if(nb==10){
//                jeContinue = false;
//            }
//        }
        }
}


