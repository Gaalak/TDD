package Java;

public class Personne {
    //    Une Person a un âge, un nom, et un numéro de sécurité social.
    private int age;
    private String nom;
    private int nsecu;

    private Boolean proprietaire;

    public Personne(int age,String nom,int nsecu) {
        this.age = age;
        this.nom = nom;
        this.nsecu = nsecu;
    }

    public int getage() {
        return this.age;
    }

    public Boolean getProprietaire() {
        return this.proprietaire;
    }

}
