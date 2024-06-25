package Java.PokemonV2.Java.Arene;

import Java.PokemonV2.Enum.TypeEnum;

import java.util.List;

import static Java.PokemonV2.Enum.TypeEnum.*;

public class Arena {

    private final String name;
    private final List<TypeEnum> typefield;

    public final static Arena ACCLIMATATIONGARDEN = new Arena("Les jardins d'acclimatations", List.of(GRASS));
    public final static Arena VESUVE = new Arena("Vésuve", List.of(FIRE));
    public final static Arena OLYMPICPOOL = new Arena("Les jardins d'acclimatations", List.of(WATER));


    public Arena(String name, List<TypeEnum> typefield) {
        this.name = name;
        this.typefield = typefield;
    }

    public List<TypeEnum> getTypefield() {
        return typefield;
    }

    public String getName() {
        return name;
    }
}
