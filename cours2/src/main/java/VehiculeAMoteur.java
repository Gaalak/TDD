public abstract class VehiculeAMoteur extends Vehicule {

    Moteur moteur;
    VehiculeAMoteur(){
        System.out.println("Une voiture est contruite avec un moteur");

    }
    VehiculeAMoteur(Moteur moteur){
        this.moteur = moteur;

    }

}
