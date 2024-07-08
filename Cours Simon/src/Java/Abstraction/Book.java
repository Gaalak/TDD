
package exo3;

class Book {
    private String header;
    private Chapter[] chapters;
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
}