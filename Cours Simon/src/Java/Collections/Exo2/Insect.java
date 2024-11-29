package Java.Collections.Exo2;

import java.util.*;


public class Insect {

    private  String name;
    private int nbPaws;
    private  String color;


    public Insect(String name,Integer nbPaws,String color){
        this.name = name;
        this.color = color;
        this.nbPaws = nbPaws;
    }

    public Insect() {

    }

    public int getNbPaws() {
        return nbPaws;
    }
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Insect insect = (Insect) o;
        return Objects.equals(name, insect.name) && Objects.equals(nbPaws, insect.nbPaws) && Objects.equals(color, insect.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nbPaws, color);
    }


    @Override
    public String toString() {
        return "Insect{" +
                "name='" + name + '\'' +
                ", nbPaws=" + nbPaws +
                ", color='" + color + '\'' +
                '}';
    }
}
