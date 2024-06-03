package Java;

import java.io.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

public class Account {
    //    Écrivez une classe Account.
//    Une classe Account possède une balance (l’argent actuel sur le compte en banque) exprimé en nombre à virgule.
//    Une classe Account possède une Person comme propriétaire.
//    Une Person a un âge, un nom, et un numéro de sécurité social.
//    Il est possible de faire des retraits, et des dépôts.
//    Le découvert autorisé sur un compte est le suivant :
//            - Si le propriétaire du compte a moins de 18 ans, il n’a pas le droit de réaliser un
//    retrait qui le mettrait à découvert
//- Si le propriétaire du compte a plus de 18 ans, son découvert est autorisé à
//    hauteur de 100 euros par année supérieure à 17 ans
//    À chaque fois qu’une action est entreprise sur le compte, que ce soit un retrait, ou un
//    dépôt, cette dernière doit être conservé sur le compte, et datée.
    private double balance = 400;//bigdecimal
    private boolean permis;
    private String operation;
    private final String dateoperation = new SimpleDateFormat("yyyy/MM/dd à HH:mm").format(Calendar.getInstance().getTime());//datetimeformater

    private Personne owner;
    DecimalFormat df = new DecimalFormat("0.00");

    public Account(Personne proprietairecompte) {
        this.owner =proprietairecompte;
    }

    public String getMontantActuelCompte() {
        return df.format(this.balance) + "€";
    }

    private boolean verificationPossibiliteRetrait(double sommedesire) {
        double resultoperation = balance - sommedesire;
        if (owner.getAge() < 18 && resultoperation < 0) {

            return permis;
        }
        if (owner.getAge() > 18 && resultoperation < 0) {
            resultoperation = sommedesire - balance;
            if (resultoperation <= getDecouvertAutorisePourLesAdultes()) {
                permis = true;
                return permis;
            }
            return permis;
        }
        permis = true;
        return permis;
    }

    private int getDecouvertAutorisePourLesAdultes() {
        return (owner.getAge() - 17) * 100;//eviter des magic numbers
    }

    public String retrait(double sommedesire) {

        operation = "retrait";
        if (Boolean.FALSE.equals(verificationPossibiliteRetrait(sommedesire))) {
            getOperationLog();
            return "Vous n'êtes pas autorisé à retirer, vous avez " + df.format(balance) + "€ sur votre compte";
        }
        balance -= sommedesire;
        getOperationLog();
        return "Le retrait a bien été effectuée, vous avez " + df.format(balance) + "€ sur votre compte";
    }

    public String depot(double sommedesire) {
        operation = "dépot";
        balance += sommedesire;
        getOperationLog();
        return "Vous avez déposé " + sommedesire + "€ . Vous disposez dorénavant de " + df.format(balance) + "€";
    }

    private void getOperationLog() {

        StringBuilder logoperation = new StringBuilder()
                .append(owner.getNom())
                .append(" a demandé à effectuer un ")
                .append(operation)
                .append(" qui a été ")
                .append(Objects.equals(operation, "retrait") ? permis ? "accepté" : "refusé" : "accepté")
                .append(" le ")
                .append(dateoperation);


        try (BufferedWriter logfiles = new BufferedWriter(new FileWriter("C:/Users/ygralak/OneDrive - Reseau-GES/Documents/Cours Simon/TDD/Cours Simon/src/Java/log.txt", true))) {

            logfiles.write("\n" + logoperation);


        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
