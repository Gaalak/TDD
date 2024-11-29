package Java.Collections.Exo4;

public class Departement {

    private int numero;
    private String nom;

    public Departement(int numero,String nom){
        this.nom = nom;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "numero : "+this.numero+" | nom : "+this.nom;
    }
}
