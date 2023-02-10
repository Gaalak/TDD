public class Port {

    void accueilleEngin(Amarable amarable){

        if (amarable instanceof Bateau){
            System.out.printf("Il s'agit bien d'un bateau. ");
        }

        int nbCordes = amarable.combienDeCordes(50);
        System.out.printf("Le nombre corde nécessaire est de " +nbCordes);
    }
}
