package Java.Interface;

public class Pile extends Objet{

    private final Circuit circuit;


    Pile(String name,Circuit circuit){
        super.name = name;
        this.circuit = circuit;
        speed = this.circuit.getAngle();
    }
    @Override
    public int getSpeed() {
        return speed;
    }


}
