package Java.Pokemon.Enum;

public enum attaqueEnum {

        pistolet_a_eau(1),bulle_d_eau(2),fouet_liane(3),tranch_herbe(4),flammiche(5),deflagration(6);

        private final int attaque;

        attaqueEnum(int attaque) {
            this.attaque = attaque;
        }

        public Integer getAttaque() {
        return attaque;
    }

}
