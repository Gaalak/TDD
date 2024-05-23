package Java;

import java.text.Format;
import java.util.Arrays;

import static Java.Listinteger.INITIAL_SIZE;

public class Listintegerclass {

    public Integer[] tab = new Integer[INITIAL_SIZE];


    // récupère l'index du tableau - 1
    public Integer getIndex(){

        return tab.length - 1;

    }

    // Insérer à l'index indiqué la valeur indiquée
    public void insertValue(int value, int indexOfTab){

        tab[indexOfTab] = value;
    }

    // Ajouter un élément à la fin du tableau:
    // Trouvé le dernier élément du tableau (non-vide)
    // Placer un élément après:
    // Est-ce que le tableau peut assumer cette nouvelle entrée ?
    // Si, oui, ok on met
    // Sinon, agrandir le tableau et ajouter la dernière valeur à la fin
    public int add(int value){
        int numberOfIndex = getIndex();
        System.out.println(numberOfIndex);

        for(Integer i = numberOfIndex ; i == 0 ; i--){
            int IndexLastPosition = numberOfIndex -1;


            if (tab[IndexLastPosition].equals(null) && i <= numberOfIndex){
                System.out.println(IndexLastPosition);
                insertValue(value,numberOfIndex);

            } else if (tab[IndexLastPosition].equals(null) && i > numberOfIndex){
                System.out.println(IndexLastPosition);

                Integer[] tab2 = Arrays.copyOf(tab, INITIAL_SIZE *2);
                tab = Arrays.copyOf(tab2,tab2.length);
                insertValue(value,numberOfIndex);

            }else {

                numberOfIndex = IndexLastPosition;
            }
        }

        return value;
    }

}
