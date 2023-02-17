public abstract class Vehicule {

    abstract void klaxonner();

    Ville transporter (Passager passager, Ville villeDeDepart, Ville... villeEtapes){

        System.out.println("La première ville étape est "+ villeEtapes[0].nomVille);
        System.out.println("Il y a " + villeEtapes.length + " étapes sur le circuit");

        return villeDeDepart;
    }

}
