package Java.Abstraction;

class Chapter {
    private String title;
    private String texte;

    public Chapter(String title, String texte) {
        this.title = title;
        this.texte = texte;
    }

    public String getTexte() {
        return texte;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
