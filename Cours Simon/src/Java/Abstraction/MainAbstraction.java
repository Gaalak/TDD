package Java.Abstraction;


import java.util.Arrays;

// Exo : Implémenter le pattern strategy
// Objectif : Implémenter les méthodes statiques manquantes
// Créer une classe pour chaque méthode de lecture de livres
// Et une interface commune pour réduire la complexité de lecture
// Ceci est une stratégie
public class MainAbstraction {
    public static void main(String[] args) {



        var Chapter1 = new Chapter("premier chapitre","ceci est le premier chapitre");
        var Chapter2 = new Chapter("deuxieme chapitre","ceci est le deuxieme chapitre");
        var Chapter3 = new Chapter("troisieme chapitre","ceci est le troisieme chapitre");
        var Chapters = new Chapter[]{Chapter1,Chapter2,Chapter3};
        var book1 = new Book("harry putter", Chapters);

        new ReverseRead(book1);
        new DoubleReverseRead(book1);
    }











}


