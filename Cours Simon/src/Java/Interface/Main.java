package Java.Interface;

//Créer un système de course.
//1.Il est possible de participer à cette course dès lors que quelque chose peut se déplacer
//2.Une caisse à savon, dont la vitesse est déterminée par le poids * la taille de la personne qui la dirige
//3.Un dragon, dont la vitesse est déterminée par la taille du repas qu'il a mangé ce midi (exprimée par le nombre d'aliment contenu dans ce repas x 5) et la quantité de feu qu'il a accumulé (un dragon a 1L de feu par année de vie) -> L'opération sera Taille du repas - Litres de feu
//4.Un humain, dont la vitesse est TOUJOURS 30
//5.Une pile qui roule, dont la vitesse dépend du degré d'inclinaison de la pente
//PS : Survis à ca.


import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Course course = new Course(30,new Dragon(300,500), new CaisseASavon(180,60),new Human(),new Pile());
        Circuit mans = new Circuit(190,"Mans");
        Dragon dragon = new Dragon("Gerard",11250,522);
        CaisseASavon caisseASavon = new CaisseASavon("bolide",150,60);
        Pile pile = new Pile("AAA",mans);
        Human human = new Human("random");
        Course course1 = new Course(mans, List.of(dragon, human, pile, caisseASavon));
    }
}
