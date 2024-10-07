//package Java.Elevator;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.awt.event.*;
//
//public class Building {
//
//    private static int nbfloor = 10;
//    private int stagebutton;
//
//    Elevator1 elevator1 = new Elevator1();
//    Elevator2 elevator2 = new Elevator2();
//    Elevator3 elevator3 = new Elevator3();
//
//    private boolean Up;
//
//    private int elevator1position;
//    private int elevator2position;
//    private int elevator3position;
//
//    public Building(){
//
//    }
//
//
//    public int getNbfloor() {
//        return nbfloor;
//    }
//
//
//    public void callElevator1(int stagebutton){
//        getMovementFromElevator1(stagebutton);
//    }
//    public void callElevator2(int stagebutton){
//        getMovementFromElevator2(stagebutton);
//    }
//    public void callElevator3(int stagebutton){
//        getMovementFromElevator3(stagebutton);
//    }
//
//    private boolean getMovementFromElevator1(int stagebutton){
//        if (elevator1.getElevatorPosition() > stagebutton){
//            callFirstElevatorDown(stagebutton);
//            return !Up;
//        }
//        callFirstElevatorUp(stagebutton);
//        return Up;
//    }
//
//    public boolean getMovementFromElevator2(int stagebutton){
//        if (elevator2.getElevatorPosition() > stagebutton){
//            callSecondElevatorDown(stagebutton);
//            return !Up;
//        }
//        callSecondElevatorUp(stagebutton);
//        return Up;
//    }
//
//    public boolean getMovementFromElevator3(int stagebutton){
//        if (elevator3.getElevatorPosition() > stagebutton){
//            callThirdElevatorDown(stagebutton);
//            return !Up;
//        }
//        callThirdElevatorUp(stagebutton);
//        return Up;
//    }
//
//
//    public int callFirstElevatorUp(int stagebutton){
//
//        elevator1position = elevator1.getElevatorPosition();
//        for (int i = elevator1position; i != stagebutton; i++) {
//            elevator1position++;
//        }
//        elevator1.setNewPosition(elevator1position);
//        System.out.println(elevator1.getElevatorPosition() +" upelevator1pos");
//        return elevator1position;
//
//    }
//
//    public int callSecondElevatorUp(int stagebutton){
//        elevator2position = elevator2.getElevatorPosition();
//        for (int i = elevator2position; i != stagebutton; i++) {
//            elevator2position++;
//        }
//        elevator2.setNewPosition(elevator2position);
//        System.out.println(elevator2.getElevatorPosition() +" upelevator2pos");
//        return elevator2position;
//    }
//
//    public int callThirdElevatorUp(int stagebutton){
//        elevator3position = elevator3.getElevatorPosition();
//        for (int i = elevator3position; i != stagebutton; i++) {
//            elevator3position++;
//        }
//        elevator3.setNewPosition(elevator3position);
//        System.out.println(elevator3.getElevatorPosition() +" upelevator3pos");
//        return elevator3position;
//    }
//
//    public int callFirstElevatorDown(int stagebutton){
//
//        elevator1position = elevator1.getElevatorPosition();
//        for (int i = elevator1position; i != stagebutton; i--) {
//            elevator1position--;
//        }
//        elevator1.setNewPosition(elevator1position);
//        System.out.println(elevator1.getElevatorPosition()+ " downelevator1pos");
//        return elevator1position;
//    }
//
//    public int callSecondElevatorDown(int stagebutton){
//        elevator2position = elevator2.getElevatorPosition();
//        for (int i = elevator2position; i != stagebutton; i--) {
//            elevator2position--;
//        }
//        elevator2.setNewPosition(elevator2position);
//        System.out.println(elevator2.getElevatorPosition()+ " downelevator2pos");
//        return elevator2position;
//    }
//
//    public int callThirdElevatorDown(int stagebutton){
//        elevator3position = elevator3.getElevatorPosition();
//        for (int i = elevator3position; i != stagebutton; i--) {
//            elevator3position--;
//        }
//        elevator3.setNewPosition(elevator3position);
//        System.out.println(elevator3.getElevatorPosition()+ " downelevator3pos");
//        return elevator3position;
//    }
//
////    public int askFirstElevatorToGoTo(int stagebutton){
////
////        this.stagebutton = stagebutton;
////    }
////
////    public int askSecondElevatorToGoTo(int stagebutton){
////
////        this.stagebutton = stagebutton;
////    }
////
////    public int askThirdElevatorToGoTo(int stagebutton){
////
////        this.stagebutton = stagebutton;
////    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }
//}
