package Java.Fonction.Exo2;

import java.util.Objects;

public class EqualsAgeAndJumpHeight implements CatValidator{

    Cat cat = new Cat();
    @Override
    public boolean test(Cat cat) {
        this.cat = cat;
        return Objects.equals(cat.age, cat.jumpHeight);
    }
}
