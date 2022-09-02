public class Application {

        public static void main(String[] args) {

            Voiture voitureDeMichel = new Voiture();
            voitureDeMichel.nbPortes = 3;
            voitureDeMichel.automatique = true;
            voitureDeMichel.couleur = "Vert";

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


