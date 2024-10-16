package Java.Fonction.Exo2;

public class NullProperties implements CatValidator{

    @Override
    public boolean test(Cat cat) {
        return cat.name == null && cat.age == null && cat.jumpHeight == null;
    }
}
