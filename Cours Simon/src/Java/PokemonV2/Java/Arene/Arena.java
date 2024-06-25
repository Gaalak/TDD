package Java.PokemonV2.Java.Arene;

import Java.PokemonV2.Enum.TypeEnum;
import Java.PokemonV2.Java.Attack.Attack;

import java.util.List;

import static Java.PokemonV2.Enum.TypeEnum.FIRE;
import static Java.PokemonV2.Enum.TypeEnum.GRASS;

public class Parc {

    private final String name;
    private List<TypeEnum> typefield;

    public final static Parc JARDINDACCLIMATATION = new Parc("Les jardins d'acclimatations", List.of(GRASS));



    public Parc(String name, List<TypeEnum> typefield) {
        this.name = name;
        this.typefield = typefield;
    }
}
