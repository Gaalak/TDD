package Java.Fonction.Exo2;

public class NegativeAgeAndJumpHeight implements CatValidator {


    @Override
    public boolean test(Cat cat) {
        return cat.jumpHeight < 0 && cat.age < 0;
    }
}
