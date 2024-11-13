package Java.Fonction.Exo6;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        new Fluent<>("1" ).toValue() // string
                .map((fluentString) -> String.valueOf(fluentString.length())).toValue() // number
                .map((fluentInt) -> String.valueOf(List.of(Integer.valueOf(fluentInt).toString()))).toValue(); // List<Integer>
    }
}
