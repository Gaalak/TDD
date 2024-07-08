package genericite.exocollections.exoCollection3;


import java.util.Hashtable;
import java.util.Map;

// Créer une Map ayant pour clé une chaine de caractère et une valeur qui sera un nombre
// A l'instanciation, mettez y déjà deux valeurs
// Ajouter une valeur à cette map
// Afficher les valeurs sous le format
// ["clé" -> 5]
// ["clé2" -> 12]
// ["clé15" -> 77]
public class MainCollection {
    public static void main(String[] args) {
        Map<String, Integer> map = new Hashtable<>() {{
            put("a", 1);
            put("b", 2);
        }};
        Map<String, Integer> map2 = Map.of("chat", 5, "dog", 6);

        map.put("c", 3);
        for (var entry : map.entrySet()) {
            System.out.format("[\"%s\" -> %s]\n", entry.getKey(), entry.getValue());
        }
    }
}
