package Java.Collections.Exo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Insect coccinelle = new Insect("coccinelle",8,"red");
        Insect ver = new Insect("ver",7,"yellow");
        Insect manteReligieuse = new Insect("manteReligieuse",6,"blue");
        Insect gendarme = new Insect("gendarme",5,"yellow");
        Insect araignee = new Insect("araignee",4,"blue");
        Insect mouche = new Insect("mouche",3,"yellow");
        Insect moustique = new Insect("moustique",2,"red");
        Insect abeille = new Insect("abeille",6,"red");

        List<Insect> listInsect = new ArrayList<>();
        listInsect.add(coccinelle);
        listInsect.add(ver);
        listInsect.add(manteReligieuse);
        listInsect.add(gendarme);
        listInsect.add(araignee);
        listInsect.add(mouche);
        listInsect.add(moustique);
        listInsect.add(abeille);

        var insectListmaxpaws = listInsect.stream()
                .max(Comparator.comparingInt(Insect::getNbPaws)).stream().toList();
        System.out.println(insectListmaxpaws);
        var insectListred = listInsect.stream()
                .filter(insect -> insect.getColor().equals("red")).map(Insect::getName).toList();
        System.out.println(insectListred);
        var insectListblueandsixpaws = listInsect.stream()
                .filter(insect -> insect.getColor().equals("blue")).filter(insect -> insect.getNbPaws() < 6).map(Insect::getName).toList();
        System.out.println(insectListblueandsixpaws);
         var countPaws = listInsect.stream()
                .mapToInt(Insect::getNbPaws).sum();
        System.out.println(countPaws);
        var countYellowInsect = listInsect.stream()
                .filter(insect -> insect.getColor().equals("yellow")).count();
        System.out.println(countYellowInsect);
    }
}
