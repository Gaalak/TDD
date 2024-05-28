package Java;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Calendar;

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
    private long balance = 400;
    private boolean proprietaire;

    private long resultoperation;
    private boolean permis;

    private long sommedesire;
    private int decouvertadultepermis;

    private String operation;

    private String dateoperation = new SimpleDateFormat("yyyyMMdd__HHmmss").format(Calendar.getInstance().getTime());

    public Account(Personne proprietairecompte) {

    }

    private Boolean verificationPossibiliteRetrait(long sommedesire) {
        resultoperation = balance - sommedesire;
        if (Personne.getAge() < 18 && resultoperation < 0) {

            return permis;
        }
        if (Personne.getAge() > 18 && resultoperation < 0) {
            resultoperation = sommedesire - balance;
            if (resultoperation <= getDecouvertAutorisePourLesAdultes()){
                permis = true;
                return permis;
            }
            return permis;
        }
        permis = true;
        return permis;
    }

    private int getDecouvertAutorisePourLesAdultes() {
        decouvertadultepermis = (Personne.getAge() - 17) * 100;
        return decouvertadultepermis;
    }

    public String retrait(long sommedesire) {
        operation = "retrait";
        if (Boolean.FALSE.equals(verificationPossibiliteRetrait(sommedesire))){
            return "Vous n'êtes pas autorisé à retirer, vous avez "+balance+ "€ sur votre compte";
        }
         balance -= sommedesire;
        return "Le retrait a bien été effectuée, vous avez " + balance + "€ sur votre compte";
    }

    public String depot(long sommedesire) {
        operation = "dépot";
        balance += sommedesire;
        return "Vous avez déposé "+ sommedesire+ "€ . Vous disposez dorénavant de "+balance +"€";
    }

    public String getOperationLog() {
        StringBuilder logoperation = new StringBuilder("M ")
                .append(Personne.getNom())
                .append(" a demandé à effectuer un ")
                .append(operation).append(" de ")
                .append(sommedesire)
                .append("€ qui a été ")
                .append(permis ? "accepté" : "refusé")
                .append(" le ")
                .append(dateoperation);

        return logoperation.toString();
    }
}
