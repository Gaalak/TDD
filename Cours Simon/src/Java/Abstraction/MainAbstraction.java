package exo3;



// Exo : Implémenter le pattern strategy
// Objectif : Implémenter les méthodes statiques manquantes
// Créer une classe pour chaque méthode de lecture de livres
// Et une interface commune pour réduire la complexité de lecture
// Ceci est une stratégie
public class MainAbstraction {
    public static void main(String[] args) {

    }



    static void read(Book book) {
        System.out.println(book.getHeader());
        for (Chapter chapter: book.getChapters()) {
            System.out.println(chapter.getTitle());
            System.out.println(chapter.getTexte());
        }
    }

    static void reverseRead(Book book) {
        // Implémenter la méthode pour lire le livre
        // en commencant par le dernier chapitre et en remontant comme ca
    }

    static void doubleReverseRead(Book book) {
        // Implémenter la méthode pour lire le livre
        // en commencant par le dernier chapitre et en remontant comme ca
        // et en commencant par la dernière lettre
    }

    static void crossingRead(Book book) {
        // Implémenter la méthode pour lire le livre
        // en lisant la première lettre du premier chapitre,
        // puis la dernière lettre du dernier chapitre
        // Puis la seconde lettre du premier chapitre
        // Puis l'avant dernière lettre du dernier chapitre
        // etc... jusqu'à arriver au milieu du livre
    }



}


