package Java.PokemonDEGUEULASSE.Enum;

import java.util.List;

public enum attaqueEnum {

        pistolet_a_eau(1),bulle_d_eau(2),fouet_liane(3),tranch_herbe(4),flammiche(5),deflagration(6);

        private final int attaque;

        attaqueEnum(int attaque) {
            this.attaque = attaque;
        }



}
enum AttackType {
    FIRE(List.of()), WATER(List.of()), GRASS(List.of(PokemonType.WATER));

    private final List<PokemonType> strongAgainst;


    AttackType(List<PokemonType> strongAgainst) {
    this.strongAgainst = strongAgainst;
    }

    public List<PokemonType> getStrongAgainst() {
        return strongAgainst;
    }
}

enum Days {
    MONDAY(6, 0),
    TUESDAY(5, 6);

    private final int daysBeforeSunday;
    private final int daysBeforeMonday;

    Days(int i, int daysBeforeMonday) {
        this.daysBeforeSunday = i;
        this.daysBeforeMonday = daysBeforeMonday;
    }

    public int getDaysBeforeSunday() {
        return daysBeforeSunday;
    }

    public int getDifferenceBetweenBEFOREmONDAYaND() {
        return this.daysBeforeMonday - this.daysBeforeSunday;
    }
}
