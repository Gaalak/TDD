package Java.Fonction.Exo3;

import java.util.function.UnaryOperator;

public class ConcatenationNombre implements UnaryOperator<Integer> {

    private final Integer number;

    public ConcatenationNombre(Integer number) {
        this.number = number;
    }

    @Override
    public Integer apply(Integer integer2) {
        return Integer.valueOf(String.valueOf(integer2).concat(String.valueOf(number)));
    }
}
