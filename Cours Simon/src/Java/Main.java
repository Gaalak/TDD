package Java;

import Java.Listinteger;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
//         Listinteger listinteger = new Listinteger();
//         listinteger.insertValue(30,0);
//        listinteger.insertValue(15,1);
//        listinteger.insertValue(20,2);
//          listinteger.insertValue(30,3);
//           listinteger.insertValue(30,4);
//          listinteger.add(31);
//          listinteger.add(2);
//        listinteger.add(3);
//        listinteger.add(4);
//        System.out.println(Arrays.toString(listinteger.tab));
//
//        Listintegerclass test = new Listintegerclass();
//        test.insertValue(100,0);
//        test.add(5);
//        System.out.println(Arrays.toString(test.tab));
//
//        int[] e = {5,65,8,96,6};
//        Exercice1 tab = new Exercice1(e);
//
//        int valeurbasse = tab.getLowerNumber();
////        System.out.println(tab.getError());
//        System.out.println(valeurbasse);
//
//        int valeurhaute = tab.getUpperNumber();
//        System.out.println(valeurhaute);
//
//        int calcul = tab.sumOfNumbersInArray();
//        System.out.println(" la somme des éléments du tableau est "+ calcul);
//
//        int calculpair = tab.sumOfPairNumbersInArray();
//        System.out.println("la somme des éléments pair du tableau est "+ calculpair);
//
//        int calculimpair = tab.sumOfImpairNumbersInArray();
//        System.out.println("la somme des éléments pair du tableau est "+ calculimpair);
//
//        Integer[] pairArray = tab.pairArray();
//        System.out.println(Arrays.toString(pairArray));

        Exercice2 montresuisse = new Exercice2();
        System.out.println(montresuisse.getHour());
        montresuisse.addMinute(60);
        System.out.println(montresuisse.getHour());
        montresuisse.removeMinute(61);
        System.out.println(montresuisse.getHour());


    }


}
