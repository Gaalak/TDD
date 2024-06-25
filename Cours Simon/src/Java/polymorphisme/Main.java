package Java.polymorphisme;

public class Main {
    public static void main(String[] args) {
        var pelican = new Pelican(33);
        var admin = new Administratif(33);
        var runner = new Runner();

        getSpeedOfAnimal(pelican);
        compareWalk(pelican, admin);
        compareWalkQb(runner, admin);
    }

    public static void getSpeedOfAnimal(Animal animal) {
        System.out.println("ma vitesse c'est" + animal.getSpeed());
    }

    public static void compareWalk(Animal animal, Animal animalTwo) {
        animal.walk();
        animalTwo.walk();
    }

    public static void compareWalkQb(WalkingThing walkingThing, WalkingThing walkingThingTwo) {

    }

}

class Runner implements WalkingThing {

    @Override
    public void walk() {
        System.out.println("NON MOI JE COURS");
    }
}

interface WalkingThing {
    void walk();
}
abstract class Animal implements WalkingThing {
    abstract int getSpeed();
}

class Pelican extends Animal  {

    private final int weight;

    public Pelican(int weight) {
        this.weight = weight;
    }
    @Override
    int getSpeed() {
        return weight * 2;
    }

    @Override
    public void walk() {
        System.out.println("Je marche à " + getSpeed() + " kmh");
    }
}

class Administratif extends Animal  {

    private final int age;

    public Administratif(int age) {
        this.age = age;
    }
    @Override
    int getSpeed() {
        return age / 2;
    }

    @Override
    public void walk() {
        System.out.println("Je fais chier le SI à " + getSpeed() + " kmh");
    }
}
