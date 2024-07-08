package genericite.exocollections.exoCollection2;


import java.util.*;
import java.util.stream.Collectors;

// Créer une collection contenant trois chaines de caractères
// Retirez en tous les doublons sans travailler sur le contenu de la liste
public class MainCollection {
    public static void main(String[] args) {
        //1ere methode
        List<String> collection = new ArrayList<>();
        Set<String> collectionwithoutduplicates = new HashSet<>();
        collection.add("a");
        collection.add("a");
        collection.add("a1");
        collection.add("a1");
        collection.add("b");
        System.out.println("collection" +collection);
        collectionwithoutduplicates = new HashSet<>(collection);
        System.out.println("collectiondupl" +collectionwithoutduplicates);

        //2e méthode
        Set<String> collection2 = new HashSet<>();
        collection2.add("a");
        collection2.add("a");
        collection2.add("a1");
        collection2.add("a1");
        collection2.add("b");
        System.out.println("collection2" + collection2);
    }
}
