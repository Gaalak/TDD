package Java.PremierPas;

import java.util.Date;

public class Exercice2 {
    //Représenter une montre
    //Une montre affiche les heures et les minutes.
    //Il est possible à tout moment d'ajouter n'importe quel nombre de minutes à la montre, qui se mets alors à jour.

    int minute = 0;
    int heure = 0;
    int fullminute = 60;
    int fullhour = 24;
    String Heureactuelle;
    int Totalminute;
    int Totalheure;
    int counthour;
    int countday;

    public String getHour(){

        Heureactuelle = "il est "+ heure + "h"+minute;

        return Heureactuelle;
    }

    public int addMinute(int timeAdd){
        counthour = 0;
        countday = 0;
        Totalminute = minute + timeAdd;

        if (Totalminute <= 59){
            minute += timeAdd;
        } else {
            for (int i = Totalminute; i > 59; i -= fullminute) {
                counthour++;
                Totalminute %= fullminute;
            }
            Totalheure += counthour;
            if (Totalheure >= 23) {
                for (int i = Totalheure; i >= 23; i -= fullhour) {
                    countday++;
                    Totalheure -= fullhour;
                }
            }
            heure = Totalheure;
            minute = Totalminute;
        }
        return minute;
    }

    public int removeMinute(int Timeremove){
        counthour = 0;
        countday = 0;
        Totalminute = minute - Timeremove;
        if (Totalminute >= 0){
            minute -= Timeremove;
        } else {
            for (int i = Totalminute; i < 0; i += fullminute) {
                counthour++;
                Totalminute += fullminute;
            }
            Totalheure = heure - counthour;
            if (Totalheure <= 0) {
                for (int i = Totalheure; i <= 1; i += fullhour) {
                    countday++;
                    Totalheure += fullhour;
                }
            }
            heure = Totalheure;
            minute = Totalminute;
        }
        return minute;
    }
}
