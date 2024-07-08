package genericite.exocollections.exoCollection4;


import java.util.*;

// Demande 5 fois a un utilisateur de rentrer un nombre
// Afficher ces nombres en sens inverse
// Utiliser une Pile
public class MainCollection {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            System.out.print("Donne un nombre: \n");
            Scanner scanner = new Scanner(System.in);
            list.add(scanner.nextInt());
        }

        ListIterator<Integer> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            ArrayList<Object> list2 = new ArrayList<>();
            list2.add(listIterator.previous());
            System.out.println(list2);
        }


    }
}
