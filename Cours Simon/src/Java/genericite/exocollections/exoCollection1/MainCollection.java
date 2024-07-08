package Java.genericite.exocollections.exoCollection1;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// Instancier une liste contenant trois chaine de caractères
// Ajoutez y un élément
// Retirez le second élément
// Affichez en le contenu
public class MainCollection {
    public static void main(String[] args) {

        List<String> listchar = new ArrayList<>();
        listchar.add("a");
        listchar.add("b");
        listchar.add("c");
        System.out.println(listchar);
        listchar.add("d");
        System.out.println(listchar);
        listchar.remove(2);
        System.out.println(listchar);

    }
}
