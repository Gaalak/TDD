package Java.PokemonV2.Enum;

import java.util.List;

public enum TypeEnum {

    WATER,
    FIRE,
    GRASS,
    LIGHTNING,
    FLIGHT,
    GROUND;


    private List<TypeEnum> strongAgainst;
    private List<TypeEnum> weakAgainst;


    static {
        WATER.strongAgainst = List.of(FIRE,GROUND);
        WATER.weakAgainst = List.of(GRASS,LIGHTNING);

        FIRE.strongAgainst = List.of(GRASS);
        FIRE.weakAgainst = List.of(WATER,GROUND);

        LIGHTNING.strongAgainst= List.of(WATER,FLIGHT);
        LIGHTNING.weakAgainst = List.of(GROUND);

        GROUND.weakAgainst = List.of(WATER,GRASS);
        GROUND.strongAgainst = List.of(LIGHTNING);

        GRASS.strongAgainst = List.of(WATER,GROUND);
        GRASS.weakAgainst = List.of(FIRE);

        FLIGHT.strongAgainst = List.of(GRASS);
        FLIGHT.weakAgainst = List.of(LIGHTNING);
    }

    TypeEnum(){

    }
    public List<TypeEnum> getStrongAgainst() {
        return strongAgainst;
    }

    public List<TypeEnum> getWeakAgainst() {
        return weakAgainst;
    }
}


