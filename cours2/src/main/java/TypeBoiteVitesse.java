public enum TypeBoiteVitesse {


    AUTO("Automatique"),
    MANUELLE("manuelle"),
    SEMI_AUTO("semi-automatique");

    String nomTypeBoite;

    private TypeBoiteVitesse(String nomTypeBoite){
        this.nomTypeBoite=nomTypeBoite;
    }
}
