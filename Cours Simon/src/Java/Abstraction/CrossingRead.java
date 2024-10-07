package Java.Abstraction;

public class CrossingRead implements Readingthing{

    static void crossingRead(Book book) {
        // Implémenter la méthode pour lire le livre
        // en lisant la première lettre du premier chapitre,
        // puis la dernière lettre du dernier chapitre
        // Puis la seconde lettre du premier chapitre
        // Puis l'avant dernière lettre du dernier chapitre
        // etc... jusqu'à arriver au milieu du livre
    }
    @Override
    public void read(Book book) {
        System.out.println(book.getHeader());
        for (int i = 0; i > book.getChapters().length; i++) {

        }
    }
}
