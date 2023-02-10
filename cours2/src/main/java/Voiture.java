public class Voiture extends VehiculeAMoteur implements Videngeable{

    //propriétés, attributs, variables d'instance
    int nbPortes = 5; //0 par féfaut
    boolean automatique; //False par défaut
    String couleur; // null par défaut
    char premiereLettrePlaque; ///u0000 par défaut
    int rapportCourant;
    Moteur moteur;

    Voiture(){

    }



    @Override
    public void vidanger() {
        System.out.println("Déviser le bouchon sous la culasse et attendre que ça coule.");
    }


    @Override
    void klaxonner() {
        System.out.printf("Tut tut");
    }
}
