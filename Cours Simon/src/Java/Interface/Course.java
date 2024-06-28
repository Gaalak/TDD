package Java.Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Course {

    List<MovingThing> participants = new ArrayList<>();

    Circuit circuit;


//    Course( Dragon dragon,CaisseASavon caisseasavon,Human human,Pile pile){
//        int dragonspeed = dragon.getSpeed();
//        int caisseasavonspeed = caisseasavon.getSpeed();
//        int humanspeed = human.getSpeed();
//        int pilespeed = pile.getSpeed();
//        List<Integer> participant = new ArrayList<>();
//        participant.add(dragonspeed);

//        participant.add(caisseasavonspeed);
//        participant.add(humanspeed);
//        participant.add(pilespeed);
//        System.out.println("Vitesse de dragonspeed " + dragonspeed);
//        System.out.println("Vitesse de caisseasavonspeed " + caisseasavonspeed);
//        System.out.println("Vitesse de humanspeed " + humanspeed);
//        System.out.println("Vitesse de pilespeed " + pilespeed);
//        getResult(participant);
//    }

    Course(Circuit circuit,List<MovingThing> participants){
        this.circuit = circuit;
        this.participants = participants;
            System.out.println(this.participants);
        getResult(this.participants);
    }


    private void getResult(List<MovingThing> participants) {
//        participant.stream().map(MovingThing::getSpeed);
        System.out.println(Collections.max(participants.stream().map(MovingThing::getSpeed).toList()));
//        return result;
    }
}
