package Java.Fonction.Exo2;

public class JumperAndName implements CatValidator {

    @Override
    public boolean test(Cat cat) {
       return cat.jumpHeight > 10 && Character.isUpperCase(cat.name.charAt(0));
    }
}
