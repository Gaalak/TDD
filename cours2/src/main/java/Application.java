import java.util.Scanner;

public class Application {

        public static void main(String[] args) {
//            System.out.println("lol");

//            Voiture voitureDeMichel = new Voiture();
//
//            System.out.println(voitureDeMichel.couleur);
//
//            voitureDeMichel.couleur = "Jaune";
//
//            System.out.println(voitureDeMichel);
//
//            Voiture voitureDeJerome = new Voiture();
//            System.out.println("La couleur de la voiture de Jerome est " + voitureDeJerome.couleur);
//
//            if (voitureDeJerome.couleur == null){
//                System.out.println("La couleur de la voiture de Jérôme est bien null");
//            }
//
//            voitureDeMichel.couleur = null;
//            System.out.println();
//
//            System.out.println(AffichageVoiture.printVoiture(voitureDeJerome, "Jerome"));
//            System.out.println(AffichageVoiture.printPorteAndAutomatique(voitureDeMichel, "Michel"));
//
//            voitureDeMichel.nbPortes = 1;
//            System.out.println(AffichageVoiture.printPorteAndAutomatique(voitureDeMichel, "Michel"));
//
//            System.out.println(AffichageVoiture.printColorAndProprietaire(voitureDeJerome,"Jerome"));
//
//            if (voitureDeJerome == null){
//                System.out.println("la couleur est bien null");
//            }
//
//            ActionVoiture action = new ActionVoiture();
//
//            System.out.println(action.accelerer());
//            int vitesse = action.accelerer();
//
//            action.passerRapport(true,voitureDeJerome);
//            action.passerRapport(true,voitureDeJerome);
//            action.passerRapport(false,voitureDeJerome);
//            int nouveauRapport = action.passerRapport(true,voitureDeJerome);
//
//            System.out.println("le nouveau rapport est " + nouveauRapport);
//
//            //action.tournerVoiture(true,90);
//            action.tournerVoiture(false,90);
//            action.tournerVoiture(true,190);
//            action.tournerVoiture(true,-180);
//
//            Voiture voituredeJerome = new Voiture();
//            Moteur moteur = new Moteur();
//            moteur.carburation = "Diesel";
//            moteur.nbCylindres = 5;
//
//
//
//            System.out.println("vroum => "+moteur);
//            voituredeJerome.moteur = moteur;
//
//            System.out.println(AffichageVoiture.printVoiture(voituredeJerome,"Jerome"));
//
//            UsineDAssemblageVoiture ua = new UsineDAssemblageVoiture();
//
//            Voiture v  = ua.assemble();
//
//            Bateau Titanic = new Bateau();
//            Titanic.masse = 60;
//            Port Amsterdam = new Port();
//            Amsterdam.accueilleEngin(Titanic);
//
//            Voiture peugeot206 = new Voiture();
//            VehiculeAMoteur peugeaot307 = new Voiture();
//            Videngeable peugeot308 = new Voiture();
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
//            Scanner sc = new Scanner(System.in);
//            String ligneSuivante = sc.next();
//            System.out.println("La ligne suivante est " + ligneSuivante);
//
//            Integer ii = new Integer(45);
//            int i = ii.intValue();
//            System.out.println(i);
//
            Voiture tesla = new Voiture();
            tesla.couleur = "Rouge";
//            tesla.typeBoite = TypeBoiteVitesse.SEMI_AUTO;

//            switch (tesla.typeBoite){
//                case AUTO :
//                    System.out.println("le type de boitier de ma telsa est automatique" );
//                case MANUELLE :
//                    System.out.println("le type de boitier de ma telsa est manuelle" );
//                case SEMI_AUTO :
//                    System.out.println("le type de boitier de ma telsa est semi automatique" );
//                break;
//            }
//            System.out.println("Le type de ma boite de vitesse est "+ tesla.typeBoite.nomTypeBoite);
//            System.out.println(tesla.typeBoite.ordinal());
//            TypeBoiteVitesse semiAuto = TypeBoiteVitesse.valueOf("SEMI_AUTO");
//            System.out.println("La boite récupérée par le biais de la chaine de caractère est " + semiAuto.nomTypeBoite);

//            int[] tableauDeInt = new int[5];
//            char[] tableauDeChar = new char[5];
//            Voiture[] tableauDeVoitures = new Voiture[5];
//
//            tableauDeInt[1]=15;
//            tableauDeInt[4]=12;
//            System.out.println("Le deuxième élément du tableau entier est "+ tableauDeInt[1]);
//            System.out.println("Le pemier élément du tableau entier est "+ tableauDeInt[0]);
//
//            tableauDeVoitures[0] = tesla;
//            tableauDeVoitures[2] = new Voiture();
//            System.out.println("La couleur du premier élément du tableau des voitures est "+ tableauDeVoitures[0].couleur);
//            System.out.println("La taille du tableau de caractère est "+tableauDeChar.length);
                Passager passager = new Passager();
                passager.nomPassager = "Dupont";
                Ville depart = new Ville();
                depart.nomVille = "OAKLAND";

                Ville etape1 = new Ville();
                etape1.nomVille = "washington";

                Ville etape2 = new Ville();
                etape2.nomVille = "New York";

                Ville etape3 = new Ville();
                etape3.nomVille = "San Francisco";



                tesla.transporter(passager,depart,etape1,etape2,etape3);



        }
}


