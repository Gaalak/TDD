package Java.Collections.Exo5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Composant bureau = new Composant("bureau");
        Composant souris = new Composant("souris");
        Composant trousse = new Composant("trousse");
        Composant crayon = new Composant("crayon");
        Composant portefeuille = new Composant("portefeuille");

        bureau.addComposant(trousse);
        bureau.addComposant(souris);
        trousse.addComposant(crayon);

//        System.out.println(bureau);
//        System.out.println(trousse);
//        System.out.println(crayon);

        List<Composant> composantList = new ArrayList<>();
        composantList.add(bureau);
        composantList.add(trousse);
        composantList.add(souris);
        composantList.add(crayon);
        composantList.add(portefeuille);

        var noChildrenComposant = composantList.stream()
                .filter(composant -> composant.getComposantList().isEmpty())
                .toList();
        System.out.println(noChildrenComposant);


        var maxChildrenComposant = composantList.stream()
                .max(Comparator.comparingInt(composant -> composant.getComposantList().size()));
        System.out.println(maxChildrenComposant.get());

        var childrensList = composantList.stream()
                .flatMap(composant -> composant.getComposantList().stream()).toList();
        System.out.println(childrensList);
    }
}
