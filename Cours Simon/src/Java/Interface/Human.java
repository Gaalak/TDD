package Java.Interface;

public class Human implements MovingThing {

    private int hight;

    private int weight;

    private static final int speed = 30;

    private String name;

    Human(String name){
        this.name = name;
        getSpeed();
    }

    @Override
    public void move() {
        System.out.println("Je marche");
    }
    @Override
    public int getSpeed() {

        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public int getHight() {
        return hight;
    }

    @Override
    public String toString() {
        return name;
    }

}

