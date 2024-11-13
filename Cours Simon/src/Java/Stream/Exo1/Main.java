package Java.Stream.Exo1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        var inversedList = Stream.of("chat","chouette","raptor","lune")
                .filter(name -> name.length() < 5)
                .map(name -> new StringBuilder(name).reverse())
                .map(name -> name.substring(0, 1)
                        .toUpperCase() + name.substring(1))
                .reduce(String::concat);

        System.out.println(Arrays.toString(inversedList.stream().toArray()));
    }
}
