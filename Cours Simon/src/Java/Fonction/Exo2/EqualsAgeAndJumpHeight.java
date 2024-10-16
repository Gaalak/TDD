package Java.Fonction.Exo2;

import java.util.Objects;

public class EqualsAgeAndJumpHeight implements CatValidator {

    @Override
    public boolean test(Cat cat) {
        return Objects.equals(cat.age, cat.jumpHeight);
    }
}
