package Java.genericite.exogenericite.pair;


import java.util.List;

// Créer une classe générique Pair qui a deux propriétés du même type
// Instancier la plusieurs fois, avec des integer, des strings, et des List de String
// Sur la classe, ajouter deux méthodes :
// 1 - Qui affiche true si les deux objets sont égaux
// 2 - Qui retourne une Pair dont l'ordre des deux objets en propriété est inversé
public class MainPair {
    public static void main(String[] args) {

        Pair<Integer> pairint = new Pair<>(1,2);
        Pair<String> pairstring = new Pair<>("coucou","coucouk");
        Pair<List<String>> pairliststring = new Pair<>(List.of("coucou"),List.of("coucouk"));
        System.out.println(pairint.areEquals());
        System.out.println(pairstring.areEquals());
        System.out.println(pairliststring.areEquals());
        System.out.println(pairint.getInversePair());
    }
}
