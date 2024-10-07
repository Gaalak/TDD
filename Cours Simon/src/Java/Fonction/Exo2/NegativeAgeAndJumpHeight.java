package Java.Fonction.Exo2;

public class NegativeAgeAndJumpHeight implements CatValidator {

    Cat cat = new Cat();
    @Override
    public boolean test(Cat cat) {
        this.cat = cat;
        return cat.jumpHeight < 0 && cat.age < 0;
    }
}
