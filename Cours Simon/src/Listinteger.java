public class Listinteger {
    public class ListInteger {

        int initialSize = 4;
        int[] tab = new int[initialSize];


        // récupère l'index du tableau - 1
        public int get(int index){
            index = tab.length -1;;
            return index;
        }

        // Insérer à l'index indiqué la valeur indiquée
        public void insert(int value, int index){
            tab[index] = value;
        }

        // Ajouter un élément à la fin du tableau:
            // Trouvé le dernier élément du tableau (non-vide)
            // Placer un élément après:
                // Est-ce que le tableau peut assumer cette nouvelle entrée ?
                // Si, oui, ok on met
                // Sinon, agrandir le tableau et ajouter la dernière valeur à la fin
        public int add(int number){
            number = tab.length;
            int[] tab2;
            return number;
        }
    }

}
