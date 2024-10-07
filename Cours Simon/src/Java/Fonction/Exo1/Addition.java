package Java.Fonction.Exo1;

import java.util.function.BinaryOperator;

public class Addition implements Operation {

    @Override
    public Integer apply(Integer integer, Integer integer2) {
        return integer+integer2;
    }
}
