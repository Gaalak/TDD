package Java.Fonction.Exo2;

public class JumperAndName implements CatValidator{

    Cat cat = new Cat();
    @Override
    public boolean test(Cat cat) {
        this.cat = cat;
       return cat.jumpHeight > 10 && Character.isUpperCase(cat.name.charAt(0));
    }
}
