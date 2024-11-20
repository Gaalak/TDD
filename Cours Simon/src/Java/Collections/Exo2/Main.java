package Java.Collections.Exo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Insect coccinelle = new Insect("coccinelle",8,"red");
        Insect moustique = new Insect("moustique",2,"red");
        Insect ver = new Insect("ver",7,"yellow");
        Insect manteReligieuse = new Insect("manteReligieuse",6,"blue");
        Insect gendarme = new Insect("gendarme",5,"yellow");
        Insect araignee = new Insect("araignee",4,"blue");
        Insect mouche = new Insect("mouche",3,"yellow");
        Insect abeille = new Insect("abeille",1,"red");
//        var insectListmaxpaws = Stream.of(coccinelle,ver,manteReligieuse,gendarme,araignee,mouche,moustique,abeille)
//                .max(Insect::getNbPaws).map(Insect::getName);
//        System.out.println(insectListmaxpaws);
//        var insectListred = Stream.of(coccinelle, ver, manteReligieuse, gendarme, araignee, mouche, moustique, abeille)
//                .filter(insect -> insect.getColor().equals("red")).map(Insect::getName).toList();
//        System.out.println(insectListred);
//        var insectListblueandsixpaws = Stream.of(coccinelle, ver, manteReligieuse, gendarme, araignee, mouche, moustique, abeille)
//                .filter(insect -> insect.getColor().equals("blue")).filter(insect -> insect.getNbPaws() < 6).map(Insect::getName).toList();
//        System.out.println(insectListblueandsixpaws);
        var countPaws = Stream.of(coccinelle, ver, manteReligieuse, gendarme, araignee, mouche, moustique, abeille)
                .mapToInt(Insect::getNbPaws).sum();
                System.out.println(countPaws);
    }
}
