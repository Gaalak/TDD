package Java.Interface;

public class CaisseASavon extends Vehicule{


    private final int hightdriver;
    private final int weightdriver;

    CaisseASavon(String name,int hightdriver,int weightdriver){
        super.name = name;
        this.hightdriver = hightdriver;
        this.weightdriver = weightdriver;
    }
    @Override
    public int getSpeed() {
        speed = hightdriver * weightdriver;
        return speed;
    }

    @Override
    public void move() {
        System.out.println("Moi je roule");
    }
}
