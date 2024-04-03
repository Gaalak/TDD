import java.util.*;

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

                List list = new ArrayList();
                list.add(etape1);
                list.add(3);
                list.add(etape1);

                List<Ville> listVille = new ArrayList();
                list.add(etape1);
                list.add(etape2);
                list.add(etape3);


                //list.remove(etape1); Supprime le premier élément de l'objet
                Ville o =(Ville)list.get(0);

                System.out.println("La ville à l'index 0 est " +o.nomVille);

            //Contrairement à une liste ,la collection ne peut contenir deux fois la même information. Le 3e ajout sera donc ignoré
            Set<Ville> set = new HashSet<>();
            set.add(etape3);
            set.add(etape1);
            set.add(etape2);
            set.add(etape1);

//            for (Ville suiteVille : set) {
//                System.out.println(suiteVille.nomVille);
//
//            }

            Iterator<Ville> vi = set.iterator();

            while (vi.hasNext()){

                Ville v = vi.next();
                System.out.println(v.nomVille);
            }
//            System.out.println("La collection contient " + set.size() + " éléments");
//            //Il faut transformer la collection en liste pour pouvoir récupérer un élément sur un index précis
//            Ville ep = (Ville)set.toArray()[0];
//            System.out.println(ep.nomVille);

            Map<Integer,Ville> map = new HashMap();
            map.put(1,etape1);
            map.put(2,etape3);
            map.put(3,etape2);

            Ville tev = map.get(1);
            System.out.println(tev.nomVille);

            for (Map.Entry<Integer, Ville> entry : map.entrySet()) {
                Integer varientry = entry.getKey();
                Ville value = entry.getValue();
                System.out.println("L'élément suivant a pour clef : " + varientry + ". Il s'agit de la ville nommé " + value.nomVille);
            }

            for (Integer key : map.keySet()){
                System.out.println("L'élément suivant a pour clef : " + key);
            }
            for (Ville value : map.values()){
                System.out.println("Il s'agit de la ville nommé : " + value.nomVille);
            }

            System.out.println("le nombre d'élément de la map est " + map.size());
            System.out.println((map.isEmpty() ? "La map est vide" :"La map n'est pas vide"));
            System.out.println(map.containsKey(1) ? "La map contient une clef à la première position" : "la map ne contient pas de clef");
            System.out.println(map.containsValue(etape1) ? "Il y a Washington dans la map" : "Il n'y a pas Washington");

            map.clear();
            System.out.println((map.isEmpty() ? "La map est vide" :"La map n'est pas vide"));

            Collections.replaceAll(list,etape1,etape2);
            for(Ville str : set){
                System.out.println(str.nomVille);
            }


        }
}


