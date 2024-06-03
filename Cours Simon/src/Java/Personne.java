package Java;

public class Personne {
    //    Une Person a un âge, un nom, et un numéro de sécurité social.
    private int age;
    private String nom;
    private int nsecu;


    public Personne(int age, String nom, int nsecu) {
        this.age = age;
        this.nom = nom;
        this.nsecu = nsecu;
    }

    public Personne() {

    }
    public int getAge() {
        return age;
    }
    public String getNom() {
        return nom;
    }

}
