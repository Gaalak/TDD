package Java;

import java.util.Arrays;

public class Listinteger {

        public static int INITIAL_SIZE = 4;
        public int[] tab = new int[INITIAL_SIZE];




        // récupère l'index du tableau - 1
        public int getIndex(){

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
            int numberIndex = this.getIndex();

            for (int i = numberIndex; tab[i] == 0 ; i--) {

                int IndexLastPosition = numberIndex -1;

                if (tab[IndexLastPosition] != 0 && i < numberIndex){

                    insertValue(value,numberIndex);

                } else if (tab[IndexLastPosition] != 0 && i >= numberIndex){

                    int[] tab2 = Arrays.copyOf(tab, INITIAL_SIZE *2);
                    tab = Arrays.copyOf(tab2,tab2.length);
                    insertValue(value,numberIndex);

                }else {

                    numberIndex = IndexLastPosition;
                }

            }

            return value;
        }

        public boolean isIndex(Listinteger list1,int index){

            return getIndex() == index;
        }
    }

