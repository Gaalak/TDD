package Java.Immutabilité;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainImmu {
    public static void main(String[] args) {
        // Programmation concurrentielle
        // Permet à deux programmes en même temps de taper sur le code
        var dog = new Plot(5, new Date());
        var dog2 = dog.getWithNewAge(12);

        System.out.println(dog.getDate());
        dog.getDate().setTime(1111525);
        System.out.println(dog.getDate());

        System.out.println(dog.getStuffs()); // affiche la copie du tableau "chat", "map"
         dog.getStuffs().add("chien"); // modifie la copie du tableau "chat", "map" avec chien
        System.out.println(dog.getStuffs()); // affiche la copie du tableau "chat", "map"

//        var elements = List.of("500", "15");
//        for (var element :elements) {
//            System.out.println(element);
//        }

        var dlot = new Dlot(5, new Date(), List.of("chou", "rav"));

        System.out.println(dlot.date());
        dlot.date().setTime(1111525);
        System.out.println(dlot.date());
    }
}


// Undefined Behaviour
// Gestion de la mémoire
// Programmation concurentielle
// Thread safe ? Il peut être appelé en même temps par plusieurs thread
// Rendre tous les champs de l'objet immutable
class Plot {
    final int age;
    final Date date;
    final List<String> stuffs = new ArrayList<>(List.of("chat", "map"));

    Plot(int age, Date date) {
        this.age = age;
        this.date = date;
    }

    void shuffle() {
        if (age > 20) return;
        System.out.println("je suis vieux");
    }

    // Copie défensive
    final public Date getDate() {
        return Date.from(date.toInstant());
    }

    public List<String> getStuffs() {
        return new ArrayList<>(stuffs);
    }


    //    // Interdit
//    void setAge(int age) {
//        this.age = age;
//    }

    public Plot getWithNewAge(int age) {
        return new Plot(age, date);
    }
}

// Equals -> par les valeurs des champs
// hashcode -> Par les valeurs des champs
// serialization -> Transformaition en chaine de caractère -> Transformer des objets en String -> Fait passer sur le réseau, ou les stocker
record Dlot(int age, Date date, List<String> stuffs) {

    public Dlot getWithNewAge(int age) {
        return new Dlot(age, date, stuffs);
    }

    void shuffle() {
        if (age > 20) return;
        System.out.println("je suis vieux");
    }

    @Override
    public Date date() {
        return Date.from(date.toInstant());
    }
}



