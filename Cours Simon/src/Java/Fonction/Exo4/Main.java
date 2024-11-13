package Java.Fonction.Exo4;

public class Main {
    public static void main(String[] args) {
        new FluentNumber(163).and(n -> n + 10).printHere().and(n -> n /2).printHere().and(n -> n * 10).printHere();

    }
}
