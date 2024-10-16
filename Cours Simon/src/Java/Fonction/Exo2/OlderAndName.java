package Java.Fonction.Exo2;

public class OlderAndName implements CatValidator{

    @Override
    public boolean test(Cat cat) {
        return cat.age > 10 && cat.name.length() > 6;
    }
}
