package Java.PokemonDEGUEULASSE.Java;


import Java.PokemonDEGUEULASSE.Enum.attaqueEnum;
import Java.PokemonDEGUEULASSE.Enum.typeEnum;

import java.util.ArrayList;
import java.util.List;

public class Attaque extends Type {

    private typeEnum typeattaque;

    private final List<attaqueEnum> listeattaque = new ArrayList<attaqueEnum>();

    private Pokemon pokemon;

    public Attaque() {
        super();
    }

    public typeEnum getTypeAttaque(typeEnum typepokemon) {

        this.typeattaque = typepokemon;


        return typeattaque;
    }

    public List<attaqueEnum> setAttaqueParType() {

        switch (typeattaque) {
            case feu -> {
                listeattaque.add(attaqueEnum.deflagration);
                listeattaque.add(attaqueEnum.flammiche);
            }
            case eau -> {
                listeattaque.add(attaqueEnum.bulle_d_eau);
                listeattaque.add(attaqueEnum.pistolet_a_eau);
            }
            case plante -> {
                listeattaque.add(attaqueEnum.fouet_liane);
                listeattaque.add(attaqueEnum.tranch_herbe);
            }
        }


        return listeattaque;
    }

    public void getAttaqueDuPokemon(String nom) {
        System.out.println("Voici les attaques de "+nom+" : ");
        for (Java.PokemonDEGUEULASSE.Enum.attaqueEnum attaqueEnum : listeattaque) {
            System.out.println(attaqueEnum);
        }


    }





}
