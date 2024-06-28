package Java.Interface;

public class Objet implements MovingThing{

    protected int speed;

    protected String name;
    @Override
    public void move() {

    }
    @Override
    public int getSpeed() {

        return speed;
    }
    @Override
    public String toString() {
        return name;
    }
}
