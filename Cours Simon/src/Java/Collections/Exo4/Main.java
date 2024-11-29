package Java.Collections.Exo4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Departement val = new Departement(95,"Val d’Oise");
        Departement aix = new Departement(06,"Alpes-Cote-D’Azur");

        Ville Viarmes = new Ville("Viarmes",170,val);
        Ville Luzarches = new Ville("Luzarches",110,val);
        Ville Cannes = new Ville("Cannes",300,aix);

        List<Ville> listVille = new ArrayList<>();

        listVille.add(Viarmes);
        listVille.add(Luzarches);
        listVille.add(Cannes);

        var villeCEtT = listVille.stream()
                .map(Ville::getName)
                .filter(name -> name.matches("^[C-T]\\w*"))
                .toList();
        System.out.println(villeCEtT);

        var villeDeptUnderFifty = listVille.stream()
                .map(Ville::getDept)
                        .filter(departement -> departement.getNumero() < 50).toList();
        System.out.println(villeDeptUnderFifty);

        var deptMaxLength = listVille.stream()
                .map(Ville::getDept)
                .max(Comparator.comparing(maxlenght -> maxlenght.getNom().length()));
        System.out.println(deptMaxLength);

        var zipcode = listVille.stream()
                .map(Ville::getZipcode).toList();
        System.out.println(zipcode);
    }
}
