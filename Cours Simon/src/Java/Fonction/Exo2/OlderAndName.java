package Java.Fonction.Exo2;

public class OlderAndName implements CatValidator{

    Cat cat = new Cat();
    @Override
    public boolean test(Cat cat) {
        this.cat = cat;
        return cat.age > 10 && cat.name.length() > 6;
    }
}
