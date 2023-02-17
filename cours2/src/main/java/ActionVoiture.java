public class ActionVoiture {





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

    public void tournerVoiture(boolean tourner, int angle){
        if (tourner){
            if (angle < 0) {
                System.out.println("La voiture va tourner à gauche");
            } else if (angle >= 180 && angle < 359){
                System.out.println("La voiture va faire demi-tour");
            }else {
                System.out.println("La voiture va tourner à droite");
            }
        } else {
            System.out.println("La voiture va continuer tout droit");
        }
    }


}
