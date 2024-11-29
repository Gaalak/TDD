package Java.Collections.Exo3;

import java.util.Scanner;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class ConcatString {

    public Function<String,String> concat(String concatString){

        return name -> name + concatString;
    }
}
