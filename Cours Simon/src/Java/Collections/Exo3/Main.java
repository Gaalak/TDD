package Java.Collections.Exo3;

import Java.Collections.Exo3.ConcatString;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ConcatString concatString = new ConcatString();

        Function<String, String> addChat = concatString.concat(" chat");
        Function<String, String> addChouette = concatString.concat(" chouette");
        Function<String, String> addCheval = concatString.concat(" cheval");
        List<String> list = new ArrayList<>();
        list.add("perroquet");
        list.add("voiture");
        list.add("peinture");
        var concatchat = list.stream().map(addChat).toList();
        var concatChouette = list.stream().map(addChouette).toList();
        var concatCheval = list.stream().map(addCheval).toList();

        System.out.println(concatchat);
        System.out.println(concatChouette);
        System.out.println(concatCheval);




    }


}
