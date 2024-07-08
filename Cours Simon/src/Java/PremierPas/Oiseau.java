package Java.PremierPas;
import java.util.Random;

//Exercice3 --La course d'oiseau
public class Oiseau {
    public int poids = 50;
    public int vitesse;

    int positionvainqueur = 0;

    public static int INITIAL_SIZE = 5;
    public int[] listoiseau = new int[INITIAL_SIZE];


    public Oiseau() {
        attributionVitesse();
        setlistoiseau();
    }
    public int attributionPoids(){
            Random poidsreel = new Random();
            poids = poidsreel.nextInt(100) ;
        return poids;
    }
    public int attributionVitesse(){
            int poidsreel = attributionPoids();
            Random Vitessereel = new Random();
            vitesse = Vitessereel.nextInt(500) * poidsreel / 100 ;
        return vitesse;
    }

    public int[] setlistoiseau(){
        for (int i = 0; i < INITIAL_SIZE; i++) {
            listoiseau[i] = attributionVitesse();
        }
        return listoiseau;
    }



    public String getGagnant() {
        int gagnant = 0;
            gagnant = listoiseau[0];
            for (int i = 0; i < listoiseau.length; i++) {
                int valeurcompare = listoiseau[i];
                if (gagnant < valeurcompare) {
                    gagnant = valeurcompare;
                    positionvainqueur = i + 1;
                }
            }
            return positionvainqueur > 0 ? "le gagnant est l'oiseau numéro "+ positionvainqueur + " avec une vitesse de " + gagnant + "km/h" : "Le gagnant est le premier oiseau avec une vitesse de " + gagnant + "km/h";
    }
}
