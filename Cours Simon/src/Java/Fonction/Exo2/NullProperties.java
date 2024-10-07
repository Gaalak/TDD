package Java.Fonction.Exo2;

public class NullProperties implements CatValidator{

    Cat cat = new Cat();
    @Override
    public boolean test(Cat cat) {
        this.cat = cat;
        return cat.name == null && cat.age == null && cat.jumpHeight == null;
    }
}
