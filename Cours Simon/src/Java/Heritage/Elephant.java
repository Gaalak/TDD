package Java.Heritage;

public class Elephant extends Animal {


    public Elephant() {
        super(95, "Babir");
    }


    @Override
    public void walk() {
        System.out.println("Non, je marche pas, je suis gros.");
    }
}
