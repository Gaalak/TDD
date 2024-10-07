package Java.Abstraction;

import java.util.Arrays;

public class ReverseRead implements Readingthing {

    public ReverseRead(Book book) {
        read(book);
        // Implémenter la méthode pour lire le livre
        // en commencant par le dernier chapitre et en remontant comme ca
    }

    @Override
    public void read(Book book) {
        System.out.println(book.getHeader());
        for (Chapter chapter: Arrays.stream(book.getChapters()).toList().reversed()) {
            System.out.println(chapter.getTitle());
            System.out.println(chapter.getTexte());
        }
    }
}
