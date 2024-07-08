package Java.PremierPas;

public class Exercice1 {

    int[] numbers;
    int error;

    //    public Integer[] tab = new Integer[e];
    public Exercice1(int[] numbers) {
        this.numbers = numbers;
    }

    public int getError(){
        if (numbers.length == 0) {

            System.out.println("Le tableau ne peut pas être vide");
            return numbers.length;
        }

        int valeur = numbers[0];
        if (numbers.length < 2) {
            return valeur;
        }
        return valeur;
    }

    public int getLowerNumber() {
        error = getError();
        int valeur = 0;
        if (error > 0) {
            valeur = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                int valeurcompare = numbers[i];
                if (valeur >= valeurcompare) {
                    valeur = valeurcompare;
                }
            }
        }
        return valeur;
    }

    public int getUpperNumber() {
        error = getError();
        int valeur = 0;
        if (error > 0) {
            valeur = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                int valeurcompare = numbers[i];
                if (valeur < valeurcompare) {
                    valeur = valeurcompare;
                }
            }
        }
        return valeur;
    }

    public int sumOfNumbersInArray(){
        error = getError();
        int result = 0;
        if (error > 0 ){
            for (int number : numbers) {
                result += number;
            }
        }
    return result;
    }

    public int sumOfPairNumbersInArray() {
        error = getError();
        int pairsum = 0;
        if (error > 0 ){
            for (int number : numbers) {
                if(number % 2 == 0){
                    pairsum += number;
                }
            }
        }
        return pairsum;
    }

    public int sumOfImpairNumbersInArray() {
        error = getError();
        int pairsum = 0;
        if (error > 0 ){
            for (int number : numbers) {
                if(number % 2 == 1){
                    pairsum += number;
                }
            }
        }
        return pairsum;
    }

    public int countPairNumber(){
        int countofpairnumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0){
                countofpairnumber++;
            }
        }
        return countofpairnumber;
    }

    public Integer[] pairArray() {
        error = getError();
        int indexofpairarray = 0;
        Integer[] pairArray = new Integer[countPairNumber()];
        if (error > 0 ){
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] % 2 == 0) {

                    pairArray[indexofpairarray] = numbers[i];
                    indexofpairarray++;
                }
            }
        }
        return pairArray;
    }
}
