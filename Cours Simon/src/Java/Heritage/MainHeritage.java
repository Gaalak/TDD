package Java.Heritage;

public class MainHeritage {

    public static void main(String[] args) {
        var pelican = new Pelican();
        var pelican2 = new Pelican();
        var animal = new Animal(18, "je suis un animal biatch");
        var elephant = new Elephant();
        animal.walk();
        elephant.walk();
        pelican.walk();


        System.out.println(animal.doStuffDeFou());
        System.out.println(pelican.doStuffDeFou());

        System.out.println(animal);
        System.out.println(pelican);
        System.out.println(elephant);

        System.out.println(pelican.equals(pelican2));

        // doStuff(animal);
        // doStuff(pelican);
        // doStuff(elephant);
    }

    public static void doStuff(Animal animal) {
        System.out.println(animal.getName());
        System.out.println(animal.getAge() * 2);
    }
}





