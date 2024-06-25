package Java.Pokemon.Enum;

public enum typeEnum {
        feu(1), eau(2), plante(3);
        public final int type;

        typeEnum(int valeur) {
            this.type = valeur;
        }

        public int getType() {
            return this.type;
        }
    }

