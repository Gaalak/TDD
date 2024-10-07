package Java.Elevator;

import java.util.Random;


public class Elevator {

    private int elevatorposition;
    public Elevator(){
        setStartingFloor();
    }



    private int setStartingFloor(){
        Random start = new Random();
        elevatorposition = start.nextInt(1,10);
        return elevatorposition;
    }

    public int getElevatorPosition() {
        return elevatorposition;
    }

    public void setNewPosition(int elevatornewposition){
        this.elevatorposition = elevatornewposition;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
