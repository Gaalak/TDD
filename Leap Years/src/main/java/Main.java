import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        for (int i = 0; i < 2022; i++) {
            boolean retour = anneeBissextile(i).contains(" est");
            if (retour){
                System.out.println(anneeBissextile(i));
            }
        }
    }

    public static String anneeBissextile(int nb) {

        StringBuilder stringBuilder = new StringBuilder();
        if (nb % 400 == 0) {
            stringBuilder.append("L'année "+nb+" est bissextile");
        }
        if (nb % 100 == 0 && nb % 400 != 0) {
            stringBuilder.append("L'année "+nb+" n'est pas bissextile");
        }
        if (nb % 4 == 0 && nb % 100 != 0) {
            stringBuilder.append("L'année "+nb+" est bissextile");
        }
        if (nb % 4 != 0){
            stringBuilder.append("L'année "+nb+" n'est pas bissextile");
        }

        return stringBuilder.toString();
    }
}
