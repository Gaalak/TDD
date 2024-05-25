package Java;

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
    private long balance;
    private boolean proprietaire;

    public Account() {

    }

    private Boolean verificationPossibiliteRetrait() {

        return true;
    }
    public long retrait(long argent) {

        return argent;
    }
    private Boolean verificationPossibiliteDepot() {

        return true;
    }
    public long depot(long argent) {

        return argent;
    }
}
