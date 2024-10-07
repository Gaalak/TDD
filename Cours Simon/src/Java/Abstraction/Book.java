
package Java.Abstraction;

class Book {
    private final String header;
    private final Chapter[] chapters;
    public Book(String header, Chapter[] chapters) {
        this.header = header;
        this.chapters = chapters;
    }
    
    public String getHeader() {
        return header;
    }

    public Chapter[] getChapters() {
        return chapters;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
