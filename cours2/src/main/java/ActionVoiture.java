public class ActionVoiture {



    public void klaxonner(){
        System.out.println("pimpon");
    }

    public void avancer(){

    }

    public void reculer(){

    }

    public int accelerer(){
        System.out.println("J'accélère");
        return 100;
    }

    public void freiner(){

    }

    public void demarrer(){

    }

    public int passerRapport(boolean augmenter, Voiture voiture){
        if (augmenter){
            voiture.rapportCourant++;
        } else {
            voiture.rapportCourant--;
        }
        return voiture.rapportCourant;
    }

    public void tourner(boolean droite, int angle){
        System.out.println("La voiture va tourner à " + (droite ? "droite" : "gauche"));
    }
}
