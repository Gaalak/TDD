public class HelloWorld {
    public static void main(String[] args) {

        Voiture voitureDeMichel = new Voiture();
        voitureDeMichel.nbPortes = 3;
        voitureDeMichel.automatique = true;
        voitureDeMichel.couleur = "Vert";

        System.out.println(voitureDeMichel.couleur);

//        boolean jeContinue = true;
//        int nb=0;
//        while (jeContinue){
//            System.out.println("Une itération");
//            nb++;
//            if (nb == 5){
//                continue;
//            }
//            System.out.println("Nb ne vaut pas 5");
//            if(nb==10){
//                jeContinue = false;
//            }
//        }
    }
}
