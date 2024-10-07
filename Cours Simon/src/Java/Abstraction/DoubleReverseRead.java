package Java.Abstraction;

public class DoubleReverseRead implements Readingthing{


    DoubleReverseRead(Book book){
        read(book);
    }


    @Override
    public void read(Book book) {
        System.out.println(book.getHeader());
        int chapterslength = book.getChapters().length-1;
        for (int i = chapterslength; i >= 0; i--) {
            Chapter chapters = book.getChapters()[i];
            char[] charchapter = chapters.getTexte().toCharArray();
            int charchapterlength = charchapter.length-1;
            for (int j = charchapterlength; j >= 0 ; j--) {
                System.out.print(charchapter[j]);
            }
        }
    }
}
