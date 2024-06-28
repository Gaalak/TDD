package Java.Interface;

public class Dragon implements MovingThing{

    private final int aliment;
    private final int fire = 1;
    private final int age;
    private int speed;

    private String name;

    Dragon(String name,int aliment,int age){
        this.name = name;
        this.aliment = aliment;
        this.age = age;
    }
    @Override
    public void move() {

    }
    @Override
    public int getSpeed() {
        speed = (this.aliment*5) - (this.fire * this.age);
        return speed;
    }

    @Override
    public String toString() {
        return name;
    }

}
