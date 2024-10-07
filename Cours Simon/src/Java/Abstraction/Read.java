package Java.Abstraction;

public class Read implements Readingthing{
    @Override
    public void read(Book book) {
        System.out.println(book.getHeader());
        for (Chapter chapter: book.getChapters()) {
            System.out.println(chapter.getTitle());
            System.out.println(chapter.getTexte());
        }
    }
}
