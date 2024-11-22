package Java.Collections.Exo3;

import Java.Collections.Exo3.ConcatString;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ConcatString concatString = new ConcatString();
        var list = Stream.of("chat","chouette","cheval")
                .map(concatString.concat("a"))
                .collect(Collectors.toList());
        System.out.println(list);
    }


}
