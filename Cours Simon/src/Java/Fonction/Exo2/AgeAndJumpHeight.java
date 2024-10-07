package Java.Fonction.Exo2;

public class AgeAndJumpHeight implements CatValidator{

    Cat cat = new Cat();
    @Override
    public boolean test(Cat cat) {
        this.cat = cat;
        return cat.age < 5 && cat.jumpHeight > 5;
    }
}
