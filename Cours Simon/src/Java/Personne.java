package Java;

public class Personne {
    //    Une Person a un âge, un nom, et un numéro de sécurité social.
    private static int age;
    private static String nom;
    private int nsecu;


    public Personne(int age, String nom, int nsecu) {
        Personne.age = age;
        Personne.nom = nom;
        this.nsecu = nsecu;
    }

    public Personne() {

    }
    public static int getAge() {
        return age;
    }
    public static String getNom() {
        return nom;
    }

}
