package Java.Elevator;

import java.util.Random;

public class Elevator3 {

    private int elevatorposition;
    private int elevatornewposition;
    public Elevator3(){
        setStartingFloor();
    }


    private int setStartingFloor(){
        Random start = new Random();
        elevatorposition = start.nextInt(10);
        return elevatorposition;
    }

    public void setNewPosition(int elevatornewposition){
        this.elevatornewposition = elevatornewposition;
    }

    public int getElevatorPosition() {
        return elevatorposition;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
