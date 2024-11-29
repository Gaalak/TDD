package Java.Collections.Exo5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Composant {

    List<Composant> composantList;

    String composant;

    public Composant (String composant){
        this.composant = composant;
        this.composantList = new ArrayList<>();
    }

    public void addComposant(Composant composant){
        composantList.add(composant);
    }

    public String getComposant() {
        return composant;
    }

    public List<Composant> getComposantList() {
        return composantList;
    }

    @Override
    public String toString() {
        return  getComposant() ;
    }
}
