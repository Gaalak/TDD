package Java.PremierPas;

import Java.PokemonDEGUEULASSE.Enum.typeEnum;
import Java.PokemonDEGUEULASSE.Java.Combat;
import Java.PokemonDEGUEULASSE.Java.Pokemon;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
//        Listinteger listinteger = new Listinteger();
//        listinteger.insertValue(30,0);
//        listinteger.insertValue(15,1);
//        listinteger.insertValue(20,2);
//        listinteger.insertValue(30,3);
//        listinteger.insertValue(30,4);
//        listinteger.add(31);
//        listinteger.add(2);
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
//        System.out.println(tab.getError());
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
//
//        Exercice2 montresuisse = new Exercice2();
//        System.out.println(montresuisse.getHour());
//        montresuisse.addMinute(63);
//        System.out.println(montresuisse.getHour());
//        montresuisse.removeMinute(61);
//        System.out.println(montresuisse.getHour());
//        Oiseau oiseaux = new Oiseau();
//        System.out.println(oiseaux.vitesse);
//        System.out.println(oiseaux.poids);
//        System.out.println(Arrays.toString(oiseaux.setlistoiseau()));
//        System.out.println(oiseaux.getGagnant());
//        Employee richard = new Employee("alban","developpeur",32);
//        System.out.println(richard.descriptif());
//
//        Personne Yoann = new Personne(32,"Yoann",2);
//        Personne Lena = new Personne(3,"Lena",1);
//        Personne Stephanie = new Personne(30,"Stephanie",2);
//        adult1.setAge(19);
//        adult1.setnom("Stephanie");
//        adult1.setNsecu(1);
//        Account livretaYoann = new Account(Yoann);
//        Account comptecourantLena = new Account(Lena);
//        Account comptecourantStephanie = new Account(Stephanie);
//        System.out.println(livreta.);
//        System.out.println(livreta.balance);
//        System.out.println(livreta.getDecouvertAutorisePourLesAdultes());
//        System.out.println(livretaYoann.depot(185));
//        System.out.println(comptecourantLena.depot(185));
//        System.out.println(livretaYoann.depot(125.425512));
//        System.out.println(comptecourantLena.getMontantActuelCompte());
//        System.out.println(comptecourantLena.retrait(2185.658));
//        System.out.println(comptecourantStephanie.getMontantActuelCompte());
//        System.out.println(comptecourantStephanie.depot(10000));
//        System.out.println(comptecourantStephanie.retrait(100000));
//        Pokemon salameche = new Pokemon(typeEnum.feu,"salameche", 20);
        Pokemon carapuce = new Pokemon(typeEnum.eau,"carapute",45);
        Pokemon salameche = new Pokemon(typeEnum.feu,"salamecreant",45);
        Combat combatclassique = new Combat(carapuce,salameche);
    }

}

