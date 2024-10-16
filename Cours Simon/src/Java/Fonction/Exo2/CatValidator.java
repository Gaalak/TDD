package Java.Fonction.Exo2;

import java.util.function.Predicate;

public interface CatValidator extends Predicate<Cat> {


}


Consumer<T> -> T -> void

BiFunction<T, V, U>
public interface CatVal extends BinaryOperator<T> { -> BiFunction<T, T, T>
public interface CatVal extends Function<T, V> {

}
