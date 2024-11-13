package Java.Fonction.Exo5;

public class Main {

    public static void main(String[] args) {
        var valueBuffer = new ValueBuffer<>("1" ) // string
                .map((value) -> value + " mot après")
                .map((value) -> "mot avant " + value).compile();
    }
}
